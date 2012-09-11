package dk.nsi.sdm4.vaccination.integrationtest;

import dk.nsi.sdm4.testutils.StatuspageChecker;
import org.junit.Test;

public class VaccinationimporterIsUpIT {
	@Test
	public void statusPageReturns200OK() throws Exception {
		new StatuspageChecker("vaccinationimporter").assertThatStatuspageReturns200OK();
	}
}
