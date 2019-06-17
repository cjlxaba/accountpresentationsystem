package za.ac.wits.scraper.dto;

public class ScrapingTime {
	
	private String companyKey;
	private String date;
	private String archiveInterval;
    private String preProcSelectDayLimit;
    private String execTimeString;
    private String preProcSelectLimit;
    private String tmsXmlLogSelectLimit;
    private String tmsXmlLogSelectDayLimit;
    private String ssaQuotelogSelectLimit;
    
	public String getCompanyKey() {
		return companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getArchiveInterval() {
		return archiveInterval;
	}
	public void setArchiveInterval(String archiveInterval) {
		this.archiveInterval = archiveInterval;
	}
	public String getPreProcSelectDayLimit() {
		return preProcSelectDayLimit;
	}
	public void setPreProcSelectDayLimit(String preProcSelectDayLimit) {
		this.preProcSelectDayLimit = preProcSelectDayLimit;
	}
	public String getExecTimeString() {
		return execTimeString;
	}
	public void setExecTimeString(String execTimeString) {
		this.execTimeString = execTimeString;
	}
	public String getPreProcSelectLimit() {
		return preProcSelectLimit;
	}
	public void setPreProcSelectLimit(String preProcSelectLimit) {
		this.preProcSelectLimit = preProcSelectLimit;
	}
	public String getTmsXmlLogSelectLimit() {
		return tmsXmlLogSelectLimit;
	}
	public void setTmsXmlLogSelectLimit(String tmsXmlLogSelectLimit) {
		this.tmsXmlLogSelectLimit = tmsXmlLogSelectLimit;
	}
	public String getTmsXmlLogSelectDayLimit() {
		return tmsXmlLogSelectDayLimit;
	}
	public void setTmsXmlLogSelectDayLimit(String tmsXmlLogSelectDayLimit) {
		this.tmsXmlLogSelectDayLimit = tmsXmlLogSelectDayLimit;
	}
	public String getSsaQuotelogSelectLimit() {
		return ssaQuotelogSelectLimit;
	}
	public void setSsaQuotelogSelectLimit(String ssaQuotelogSelectLimit) {
		this.ssaQuotelogSelectLimit = ssaQuotelogSelectLimit;
	}
}
