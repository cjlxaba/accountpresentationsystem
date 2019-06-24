/**
 * 
 */
package za.ac.wits.aps.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import za.ac.wits.domain.customer.User;
import za.ac.wits.scraper.dto.ScrapingTime;

public interface ISchedularManagerDOA {

	public List <ScrapingTime> loadAllScheduleConfigurationPerCompany() throws FileNotFoundException,IOException;
	
	public List<User> loadAllSubcribeBillingCompanyUsers () throws FileNotFoundException,IOException;
    
	public void deleteScheduleConfigPerCompany () throws Exception;
	
	public void updateScheduleConfigurationPerCompany () throws Exception;
	
}
