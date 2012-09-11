package dk.nsi.sdm4.vaccination.config;

import dk.nsi.sdm4.core.parser.Parser;
import dk.nsi.sdm4.vaccination.parser.VaccinationParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VaccinationimporterApplicationConfig {
	@Bean
	public Parser parser() {
		return new VaccinationParser();
	}
}