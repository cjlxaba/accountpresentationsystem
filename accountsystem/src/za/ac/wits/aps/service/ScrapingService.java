/**
 * 
 */
package za.ac.wits.aps.service;

import java.io.IOException;
import java.util.List;

import za.ac.wits.aps.repository.ScrappingDAO;

/**
 * @author f4780027
 *
 */
public class ScrapingService implements IScrappingService {

	
	@Override
	public List<String> scanDirectoryById(String idNumber) throws IOException {
		
		ScrappingDAO scrappingDAO = new ScrappingDAO();
		
		List<String> scannedResults = ScrappingDAO.searchDirectoryById("", idNumber);
		
		return scannedResults;
	}

	

}
