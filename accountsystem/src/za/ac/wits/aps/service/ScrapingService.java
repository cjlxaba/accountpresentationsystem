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

import za.ac.wits.aps.repository.ScrappingDAO;
import za.ac.wits.scraper.dto.ScrapingTime;
import za.ac.wits.util.DateTimeUtil;


/**
 * @author f4780027
 *
 */
public class ScrapingService implements IScrappingService {

	
	@Override
	public List<String> scanDirectoryById(String idNumber) throws IOException {
		
		ScrappingDAO scrappingDAO = new ScrappingDAO();
		
		List<String> scannedResults = scrappingDAO.searchDirectoryById(idNumber);
		
		return scannedResults;
	}

	@Override
	public void execute() throws Exception {
		
		
		 
	}
	
	public void  loadScheduleScrappingTimes() throws FileNotFoundException, IOException{
		
		ScrappingDAO scrappingDAO = new ScrappingDAO();
		List <ScrapingTime> times = scrappingDAO.loadScheduleScrapingTimes();
		for( ScrapingTime time: times){
			ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
			 scheduler.scheduleWithFixedDelay(new ScraperSchedulerTask(time.getCompanyKey()), DateTimeUtil.getInitialDelay(Long.parseLong(time.getArchiveInterval()), time.getExecTimeString()), Long.parseLong(time.getArchiveInterval()), TimeUnit.MILLISECONDS);
		}
	}
	
}
