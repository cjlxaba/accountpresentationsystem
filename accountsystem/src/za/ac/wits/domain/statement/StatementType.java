/**
 * 
 */
package za.ac.wits.domain.statement;

/**
 * @author f4780027
 *
 */
public enum StatementType {

	MUNICIPALITY_BILLING_TYPE ("MUNICIPALITY_BILLING_TYPE"),
	CREDIT_CARD_BILLING_TYPE ("CREDIT_CARD_BILLING_TYPE"),
	TELECOM_CARD_BILLING_TYPE ("TELECOM_CARD_BILLING_TYPE"),
	ERROR_UNKNOWN ("999");

	private String responseCode;

    private StatementType(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public static StatementType find(String responseCode) {
        for (StatementType code : values()) {
            if (code.getResponseCode().equalsIgnoreCase(responseCode)) {
                return code;
            }
        }
        return ERROR_UNKNOWN;
    }
}
