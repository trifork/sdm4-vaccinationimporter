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
}
