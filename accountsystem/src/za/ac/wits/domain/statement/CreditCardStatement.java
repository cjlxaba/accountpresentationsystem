/**
 * 
 */
package za.ac.wits.domain.statement;

/**
 * @author f4780027
 *
 */
public class CreditCardStatement extends Statement{
	
	private String cardType;
	private String interestRate;
	private String creditLimit;
	private String creditAvailable;
	private String minimumAmountDue;
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public String getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getCreditAvailable() {
		return creditAvailable;
	}
	public void setCreditAvailable(String creditAvailable) {
		this.creditAvailable = creditAvailable;
	}
	public String getMinimumAmountDue() {
		return minimumAmountDue;
	}
	public void setMinimumAmountDue(String minimumAmountDue) {
		this.minimumAmountDue = minimumAmountDue;
	}
	

}
