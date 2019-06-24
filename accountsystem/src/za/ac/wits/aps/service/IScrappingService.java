package za.ac.wits.aps.service;

import java.util.List;

import za.ac.wits.aps.exception.CreditiallException;
import za.ac.wits.aps.exception.ScheduleException;
import za.ac.wits.aps.exception.ScrapeApsException;
import za.ac.wits.domain.customer.UserCredential;
import za.ac.wits.scraper.dto.ScrapeRequest;
import za.ac.wits.scraper.dto.ScrapeSession;

public interface IScrappingService {
 
	public List <String> scrapeWebSite (ScrapeRequest request) throws ScrapeApsException;
	
	public boolean verifyCustomerCreditials (UserCredential userDetails) throws CreditiallException ;
	
	public void execute () throws ScheduleException;
	
	public void performDataChecks (ScrapeSession scrapeSession) throws DataIntegrityException;
}
