/**
 * 
 */
package za.ac.wits.aps.repository;

import java.io.IOException;
import java.util.List;

import za.ac.wits.aps.exception.CreditiallException;
import za.ac.wits.aps.exception.ScrapeApsException;
import za.ac.wits.domain.customer.UserCredential;

/**
 * @author f4780027
 *
 */
public interface IScrappingDAO {

	public  List<String> searchDirectoryById(String searchById) throws IOException ;
	
	public void authenticateScraper (UserCredential creditial) throws CreditiallException;
	
	public void saveScrapeSessionXML (List <String>scrapeSessionXML) throws ScrapeApsException;
	
	public void deleteScrapeSessionXML (String BillingCompany) throws ScrapeApsException;

}
