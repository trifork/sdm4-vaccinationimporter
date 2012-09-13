package dk.nsi.sdm4.vaccination.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import dk.nsi.sdm4.testutils.TestDbConfiguration;
import dk.nsi.sdm4.vaccination.config.VaccinationimporterApplicationConfig;
import dk.nsi.sdm4.vaccination.model.Diseases;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = {VaccinationimporterApplicationConfig.class, TestDbConfiguration.class})
public class VaccinationParserIntegrationTest
{
	@Autowired
	private VaccinationParser parser;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void unmarshallDiseases() throws IOException {
        File file = FileUtils.toFile(getClass().getClassLoader().getResource("data/ExpDiseases.xml"));
        
        Object obj = parser.unmarshallFile(file, Diseases.class);
        
        if(obj instanceof Diseases) {
            Diseases diseases = (Diseases)obj;
            assertEquals(25, diseases.getDiseasesList().size());
        } else {
            fail("Unknown object: " + obj);
        }
	    
	}
	
    @Test
    public void parseAndPersistDiseases() throws IOException {
        // 1 folder containing 1 file
        File file = FileUtils.toFile(getClass().getClassLoader().getResource("diseases"));
        
        parser.process(file);
        
        assertEquals(25, jdbcTemplate.queryForInt("select count(*) from ddv_diseases"));
        
        assertEquals("Brucellose vacciner", jdbcTemplate.queryForObject("select ATCText from ddv_diseases where DiseaseIdentifier = 2", String.class));
        assertEquals("2002-09-01 00:00:00.0", jdbcTemplate.queryForObject("select ddvValidFrom from ddv_diseases where DiseaseIdentifier = 2", String.class));
        
    }

    @Test
    public void parseAndPersistDiseasesVaccines() throws IOException {
        // 1 folder containing 1 file
        File file = FileUtils.toFile(getClass().getClassLoader().getResource("diseasesVaccines"));
        
        parser.process(file);
        assertEquals(1800, jdbcTemplate.queryForInt("select count(*) from ddv_diseases_vaccines"));
        assertEquals("2012-09-04 12:37:56.0", jdbcTemplate.queryForObject("select ddvModifiedDate from ddv_diseases_vaccines where DiseaseIdentifier = 25 and VaccineIdentifier = 1617209100", String.class));
    }
    
    @Test
    public void parseAndPersistDosageoptions() throws IOException {
        // 1 folder containing 1 file
        File file = FileUtils.toFile(getClass().getClassLoader().getResource("dosageoptions"));
        
        parser.process(file);
        assertEquals(10, jdbcTemplate.queryForInt("select count(*) from ddv_dosageoptions"));
        assertEquals(4, jdbcTemplate.queryForInt("select count(*) from ddv_dosageoptions where DrugIdentifier = 28101565493"));
        assertEquals("1 * 1/4 dosis - barn under 20 kg", jdbcTemplate.queryForObject("select DosageText from ddv_dosageoptions where DrugIdentifier = 28101565493 and dosageoptionIdentifier = 111111", String.class));
    }

    @Test
    public void parseAndPersistServices() throws IOException {
        // 1 folder containing 1 file
        File file = FileUtils.toFile(getClass().getClassLoader().getResource("services"));
        
        parser.process(file);
        assertEquals(77, jdbcTemplate.queryForInt("select count(*) from ddv_services"));
        assertEquals("Statens Seruminstit.", jdbcTemplate.queryForObject("select Description from ddv_services where serviceidentifier = 32103114106", String.class));
    }

}
