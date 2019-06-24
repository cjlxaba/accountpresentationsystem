/**
 * 
 */
package za.ac.wits.aps.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import za.ac.wits.aps.exception.CreditiallException;
import za.ac.wits.aps.exception.ScheduleException;
import za.ac.wits.aps.exception.ScrapeApsException;
import za.ac.wits.aps.repository.ScrappingDAO;
import za.ac.wits.domain.customer.UserCredential;
import za.ac.wits.scraper.dto.ScrapeRequest;
import za.ac.wits.scraper.dto.ScrapingTime;
import za.ac.wits.util.DateTimeUtil;


/**
 * @author f4780027
 *
 */
public class ScrapingService implements IScrappingService {

	
	@Override
	public List<String> scrapeWebSite(ScrapeRequest scrapeRequest) throws ScrapeApsException {
		
		ScrappingDAO scrappingDAO = new ScrappingDAO();
		
		List<String> scannedResults = null;
		try {
			scannedResults = scrappingDAO.searchDirectoryById(scrapeRequest.getIdNumber());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return scannedResults;
	}

	@Override
	public void execute() throws ScheduleException {
		
		 
	}
	
	public void  loadScheduleScrappingTimes() throws FileNotFoundException, IOException{
		
		ScrappingDAO scrappingDAO = new ScrappingDAO();
		
		List <ScrapingTime> times = scrappingDAO.loadAllScheduleConfigurationPerCompany();
		
		for( ScrapingTime time: times){
			
			ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
			
			 scheduler.scheduleWithFixedDelay(new ScraperSchedulerTask(time.getCompanyKey()), DateTimeUtil.getInitialDelay(Long.parseLong(time.getArchiveInterval()), time.getExecTimeString()),
					 Long.parseLong(time.getArchiveInterval()), TimeUnit.MILLISECONDS);
		}
	}

	@Override
	public boolean verifyCustomerCreditials(UserCredential userDetails) throws CreditiallException {
		// TODO Auto-generated method stub
		return false;
	}


}
