/**
 * 
 */
package za.ac.wits.aps.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

import za.ac.wits.aps.repository.ScrappingDAO;
import za.ac.wits.domain.customer.User;


public class ScraperSchedulerTask extends TimerTask implements Runnable {
	
	ScrappingDAO scrappingDAO = new ScrappingDAO();
	List<User> subscribedUsers;

	Date now;

	public ScraperSchedulerTask(String companyId) throws FileNotFoundException, IOException {

		subscribedUsers = scrappingDAO.loadAllSubcribeBillingCompanyUsers();

	}

	@Override
	public void run() {

		try {

			// hand over to scrapping module

		} catch (Exception e) {
			try {
				throw new Exception();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

	}

}
