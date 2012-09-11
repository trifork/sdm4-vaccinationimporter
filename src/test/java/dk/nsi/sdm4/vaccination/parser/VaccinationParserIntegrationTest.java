package dk.nsi.sdm4.vaccination.parser;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import dk.nsi.sdm4.testutils.TestDbConfiguration;
import dk.nsi.sdm4.vaccination.config.VaccinationimporterApplicationConfig;

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
	public void dummy() throws IOException {
	}
}
