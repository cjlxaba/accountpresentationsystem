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

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import za.ac.wits.domain.customer.UserCredential;
import za.ac.wits.scraper.dto.ScrapingTime;

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
	
	public List <ScrapingTime> loadScheduleScrapingTimes () throws FileNotFoundException,IOException{
		
			ScrapingTime user = new ScrapingTime();
			List <ScrapingTime> users = new ArrayList<ScrapingTime>();
			FileInputStream excelFile = new FileInputStream(new File("scheduleTime"));
			Workbook workBook = new XSSFWorkbook(excelFile);
			Sheet dataTypeSheet = workBook.getSheetAt(0);
			Iterator<Row> iterator = dataTypeSheet.iterator();
			
			while (iterator.hasNext()){
				 Row nextRow = iterator.next();
		         Iterator<Cell> cellIterator = nextRow.cellIterator();
				   while (cellIterator.hasNext()) {
		                Cell cell = cellIterator.next();
		                 
		                switch (cell.getCellType()) {
		                    case Cell.CELL_TYPE_STRING:
		                        cell.getStringCellValue();
		                        break;
		                    case Cell.CELL_TYPE_BOOLEAN:
		                        cell.getBooleanCellValue();
		                        break;
		                    case Cell.CELL_TYPE_NUMERIC:
		                        cell.getNumericCellValue();
		                        break;
		                }
		                System.out.print(" - ");
		            }
		            System.out.println();
		        }

		return null;

	}
}
