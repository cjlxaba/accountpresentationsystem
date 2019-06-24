/**
 * 
 */
package za.ac.wits.group7045.aps.service;

import java.util.List;

import za.ac.wits.scraper.dto.ScrapeRequest;

/**
 * @author f4780027
 *
 */
public class ScrapeManagerImpl  implements IScrapeManager{

	ScrapeStrategyFactory scrapeStrategyFactory;
	
	@Override
	public void  scrapeBillingAccount(ScrapeRequest scrapeRequest) {
		
		 scrapeStrategyFactory.getAccountScrapeStrategy(scrapeRequest);
	}

}
