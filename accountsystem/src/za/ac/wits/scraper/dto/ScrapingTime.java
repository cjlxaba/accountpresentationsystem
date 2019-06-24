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

	public ScrapingTime(ScrapingTimeBuilder builder) {
      
		this.companyKey = builder.companyKey;
		this.date = builder.date;
		this.archiveInterval = builder.archiveInterval;

	}

	public String getCompanyKey() {
		return companyKey;
	}

	public String getDate() {
		return date;
	}

	public String getArchiveInterval() {
		return archiveInterval;
	}

	public String getPreProcSelectDayLimit() {
		return preProcSelectDayLimit;
	}

	public String getExecTimeString() {
		return execTimeString;
	}

	public String getPreProcSelectLimit() {
		return preProcSelectLimit;
	}

	public String getTmsXmlLogSelectLimit() {
		return tmsXmlLogSelectLimit;
	}

	public String getTmsXmlLogSelectDayLimit() {
		return tmsXmlLogSelectDayLimit;
	}

	public String getSsaQuotelogSelectLimit() {
		return ssaQuotelogSelectLimit;
	}

	public static class ScrapingTimeBuilder {

		private String companyKey;
		private String date;
		private String archiveInterval;
		private String preProcSelectDayLimit;
		private String execTimeString;
		private String preProcSelectLimit;
		private String tmsXmlLogSelectLimit;
		private String tmsXmlLogSelectDayLimit;
		private String ssaQuotelogSelectLimit;

		public ScrapingTimeBuilder buildCompanyKey(String companyKey) {

			this.companyKey = companyKey;
			return this;
		}

		public ScrapingTimeBuilder buildDate(String date) {

			this.date = date;
			return this;
		}

		public ScrapingTimeBuilder buildArchiveInterval(String archiveInterval) {

			this.archiveInterval = archiveInterval;
			return this;
		}

		public ScrapingTimeBuilder buildPreProcSelectDayLimit(String preProcSelectDayLimit) {

			this.preProcSelectDayLimit = preProcSelectDayLimit;
			return this;
		}

		public ScrapingTimeBuilder buildExecTimeString(String tmsXmlLogSelectDayLimit) {

			this.tmsXmlLogSelectDayLimit = tmsXmlLogSelectDayLimit;
			return this;
		}

		public ScrapingTimeBuilder buildTmsXmlLogSelectLimit(String tmsXmlLogSelectDayLimit) {

			this.tmsXmlLogSelectDayLimit = tmsXmlLogSelectDayLimit;
			return this;
		}
		
		public ScrapingTimeBuilder buildSaQuotelogSelectLimit(String ssaQuotelogSelectLimit) {

			this.ssaQuotelogSelectLimit = ssaQuotelogSelectLimit;
			return this;
		}
	}

}
