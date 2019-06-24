package za.ac.wits.scraper.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "scrape-session")
@XmlAccessorType(XmlAccessType.FIELD)
public class ScrapeSession {
	
	@XmlElement(name = "base-url", required = true)
	private String baseUrl;
	
	@XmlElement(name = "date", required = true)
	private String date;
	
	@XmlElement(name = "time", required = true)
	private String time;
	
	@XmlElement (name ="responseCode" , required = true)
	private String responseCode;
	
	@XmlElement(name = "datapair", required = true)
	
	private List<Datapair> datapairs;

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}	
}
