package za.ac.wits.aps.service;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import za.ac.wits.scraper.dto.ScrapeSession;

public class XmlMarshaller {

	
	public List<ScrapeSession> convertScapedXMLStringToObject(List<String> scriptList) throws JAXBException {
		List<ScrapeSession> scrapeSessions = new ArrayList<>();
		
		for(String scrapeXml: scriptList) {
			scrapeSessions.add(generateScrapeSession(scrapeXml));
		}
		
		return scrapeSessions;
	}

	private ScrapeSession generateScrapeSession(String scrapeXml) throws JAXBException {
		
		StringReader reader = new StringReader(scrapeXml);
		
		JAXBContext jaxbContext = JAXBContext.newInstance(ScrapeSession.class);  
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		ScrapeSession scrapeSession = (ScrapeSession) jaxbUnmarshaller.unmarshal(reader);
		
		return scrapeSession;
	}

	
	//TODO Add to Test class
	/*public static void main(String[] args) throws Exception {
		
		
		XmlMarshaller  marshaller = new XmlMarshaller();
		
		String samplexml = marshaller.getSampleXML();

		ScrapeSession scrapeSession = marshaller.generateScrapeSession(samplexml);
		
	}
	
	private String getSampleXML() throws IOException {
		InputStream fis = getClass().getResourceAsStream("sample.xml");
		
		byte[] targetArray = new byte[fis.available()];
		
		fis.read(targetArray);
		return new String(targetArray);
	}*/
	
}
