/**
 * 
 */
package za.ac.wits.aps.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import za.ac.wits.scraper.dto.ScrapingTime;
import za.ac.wits.scraper.dto.ScrapingTime.ScrapingTimeBuilder;

public class SchedulatorDAO {

	
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
			ScrapingTime  time = new ScrapingTime(builder);
			scrapingTimes.add(time);
		}

		return scrapingTimes;

}
}
