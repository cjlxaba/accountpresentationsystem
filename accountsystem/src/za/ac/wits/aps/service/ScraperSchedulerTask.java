/**
 * 
 */
package za.ac.wits.aps.service;

import java.util.Date;
import java.util.TimerTask;

/**
 * @author f4780027
 *
 */
public class ScraperSchedulerTask extends TimerTask implements Runnable{
	
 public ScraperSchedulerTask(String companyKey) {
	
}	
  Date now ;
  
	@Override
	public void run() {
		
		IScrappingService service = new ScrapingService();
		try {
			service.execute();
		} catch (Exception e) {
			try {
				throw new Exception();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}

}
