/**
 * 
 */
package za.ac.wits.scraper.dto;

/**
 * @author f4780027
 *
 */
public enum ScrapeResult {
	
	SCRAPE_SUCCESS (200),
	SCRAPE_FAILED (300),
	ERROR_UKNOWN (999);
	
    private int responseCode;

    private ScrapeResult(int responseCode) {
        this.responseCode = responseCode;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public static ScrapeResult find(int responseCode) {
        for (ScrapeResult code : values()) {
            if (code.getResponseCode() == responseCode) {
                return code;
            }
        }
        return ERROR_UKNOWN;
    }
}
