/**
 * 
 */
package za.ac.wits.domain.statement;

/**
 * @author f4780027
 *
 */
public class Statement {

	
	private String accountNumber;
	private String accountHolderName;
	private String statementDate;
	private String statementNumber;
	private String statementMonth;
	private String totalDue;
	private String dueDate;
	private String openingBalance;
	private String closingBalance;
	private String paymentReceived;
	private String newCharges;
	private String deductions;
	private String discount;
	private String vateAmount;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getStatementDate() {
		return statementDate;
	}
	public void setStatementDate(String statementDate) {
		this.statementDate = statementDate;
	}
	public String getStatementNumber() {
		return statementNumber;
	}
	public void setStatementNumber(String statementNumber) {
		this.statementNumber = statementNumber;
	}
	public String getStatementMonth() {
		return statementMonth;
	}
	public void setStatementMonth(String statementMonth) {
		this.statementMonth = statementMonth;
	}
	public String getTotalDue() {
		return totalDue;
	}
	public void setTotalDue(String totalDue) {
		this.totalDue = totalDue;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}
	public String getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(String closingBalance) {
		this.closingBalance = closingBalance;
	}
	public String getPaymentReceived() {
		return paymentReceived;
	}
	public void setPaymentReceived(String paymentReceived) {
		this.paymentReceived = paymentReceived;
	}
	public String getNewCharges() {
		return newCharges;
	}
	public void setNewCharges(String newCharges) {
		this.newCharges = newCharges;
	}
	public String getDeductions() {
		return deductions;
	}
	public void setDeductions(String deductions) {
		this.deductions = deductions;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getVateAmount() {
		return vateAmount;
	}
	public void setVateAmount(String vateAmount) {
		this.vateAmount = vateAmount;
	}
}
