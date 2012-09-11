package dk.nsi.sdm4.vaccination.parser;

import java.io.File;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dk.nsi.sdm4.core.parser.Parser;
import dk.nsi.sdm4.core.parser.ParserException;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordPersister;
import dk.sdsd.nsp.slalog.api.SLALogItem;
import dk.sdsd.nsp.slalog.api.SLALogger;

public class VaccinationParser implements Parser {
	private static final Logger log = Logger.getLogger(VaccinationParser.class);

	@Autowired
	private SLALogger slaLogger;

	@Autowired
	private RecordPersister persister;

	@Autowired
	private JdbcTemplate jdbcTemplate;


	public void process(File datadir) throws ParserException {

	    SLALogItem slaLogItem = slaLogger.createLogItem("VaccinationParser", "All");

		try {


			slaLogItem.setCallResultOk();
			slaLogItem.store();
		} catch (Exception e) {
			slaLogItem.setCallResultError("VaccinationParser failed - Cause: " + e.getMessage());
			slaLogItem.store();

			throw new ParserException(e);
		}
	}

	@Override
	public String getHome() {
		return "vaccinationimporter";
	}
}
