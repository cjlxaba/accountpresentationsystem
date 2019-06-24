/**
 * 
 */
package za.ac.wits.error.dto;

/**
 * @author f4780027
 *
 */
public enum ERRORTYPE {
	
	BROKEN_SCRIPT ("300"),
	ERROR_PAGE ("900"),
	AUTHORIZATION_ERROR ("700"),
	ERROR_UNKNOWN ("999");

	private String responseCode;

    private ERRORTYPE(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public static ERRORTYPE find(String responseCode) {
        for (ERRORTYPE code : values()) {
            if (code.getResponseCode().equalsIgnoreCase(responseCode)) {
                return code;
            }
        }
        return ERROR_UNKNOWN;
    }
}
