/**
 * 
 */
package za.ac.wits.aps.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import za.ac.wits.domain.customer.User;
import za.ac.wits.domain.customer.UserCredential;
import za.ac.wits.scraper.dto.ScrapingTime;
import za.ac.wits.scraper.dto.ScrapingTime.ScrapingTimeBuilder;

/**
 * @author f4780027
 *
 */
public class ScrappingDAO {

	final private static String  directory = "C:\\dev\\esp\\samples\\customiseResponse\\";
	
	private static List<String> searchFolderById(String folder, String startsWitch) throws IOException {
		List<String> fileList = new ArrayList<>();
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(folder))) {
			for (Path path : stream) {
				if (!Files.isDirectory(path)) {

					if (path.getFileName().toString().startsWith(startsWitch))
						fileList.add(path.getFileName().toString());
				}
			}
		}
		return fileList;
	}

//	public static void main(String args[]) throws IOException {
//
//		new ScrappingDAO ().searchDirectoryById("C:\\dev\\esp\\samples\\customiseResponse\\", "WIMSelect");
//
//	}

	public  List<String> searchDirectoryById(String searchById) throws IOException {
		List<String> accountListXml = new ArrayList<>();
		File folder = new File(directory);
		for (File fileEntry : folder.listFiles()) {
			accountListXml.addAll(searchFolderById(fileEntry.toString(), searchById));
		}
		return accountListXml;
	}
		
	public void authenticateScraping (UserCredential creditial){
		
		
	}
	
	public List <ScrapingTime> loadAllScheduleConfigurationPerCompany() throws FileNotFoundException,IOException{
		
		String filePath = "" + "";

		FileInputStream excelFile = new FileInputStream(new File(filePath));
		Workbook workBook = new XSSFWorkbook(excelFile);
		Sheet dataTypeSheet = workBook.getSheetAt(0);
		Iterator<Row> iterator = dataTypeSheet.iterator();

		List<ScrapingTime> scrapingTimes = new ArrayList<>();

		while (iterator.hasNext()) {

			Row currentRow = iterator.next();
			ScrapingTimeBuilder builder = new ScrapingTimeBuilder().buildCompanyKey(currentRow.getCell(1).getStringCellValue()).
					buildArchiveInterval(currentRow.getCell(2).getStringCellValue());
			ScrapingTime  time =new ScrapingTime(builder);
			scrapingTimes.add(time);
		}

		return scrapingTimes;

}
	
	public List<User> loadAllSubcribeBillingCompany () throws FileNotFoundException,IOException{
		
		CustomerDAO  customer = new CustomerDAO();
		
		return customer.retriveAllUsers("");
	}
}
