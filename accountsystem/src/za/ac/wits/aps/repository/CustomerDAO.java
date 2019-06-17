/**
 * 
 */
package za.ac.wits.aps.repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import za.ac.wits.domain.customer.User;

/**
 * @author f4780027
 *
 */
public class CustomerDAO {
	
	private static final String CREDETIALS_FILE_PATH =  "WEB-INF/DataFiles/UserLoginCredentials.properties";
	
	private static final String USER_DETAILS_FILE_PATH = "WEB-INF/DataFiles/UserDetails.xlsx";

	public boolean authenticateUser(String contextPath, String username, String userPassword) throws FileNotFoundException, IOException {

		String filePath = contextPath + CREDETIALS_FILE_PATH;

		Properties credentials = new Properties();
		credentials.load(new FileInputStream(filePath));
		
		String credetialPassword = credentials.getProperty(username);
		
		if(StringUtils.isNotBlank(credetialPassword)) {
			return credetialPassword.equals(userPassword);
		} else {
			return false;
			//TODO Throw DAO Exception describing the error
		}		
	}

	public User getUserByAuthKey(String contextPath, String authKey) throws IOException {
		String filePath = contextPath + USER_DETAILS_FILE_PATH;
		
		 FileInputStream excelFile = new FileInputStream(filePath);
         Workbook workbook = new XSSFWorkbook(excelFile);
         Sheet datatypeSheet = workbook.getSheetAt(0);
         Iterator<Row> iterator = datatypeSheet.iterator();
         
         
         Map<String, User> userMap = new HashMap<String, User>();
         
         while (iterator.hasNext()) {

             Row currentRow = iterator.next();
             
             User user = new User();             
             user.setName(currentRow.getCell(2).getStringCellValue());
             user.setSurname(currentRow.getCell(3).getStringCellValue());
             user.setEmail(currentRow.getCell(4).getStringCellValue());
             
             userMap.put(currentRow.getCell(0).getStringCellValue(),user);
         }

		
		return userMap.get(authKey);
	}

}
