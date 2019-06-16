package za.ac.wits.domain.statement;

public class TelecomStatement extends Statement{

	private String telephoneNumber;
	private String serviceCharges;
	private String callCharges;
	private String totalNumberOfCalls;
	private String totalCallDuration;
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getServiceCharges() {
		return serviceCharges;
	}
	public void setServiceCharges(String serviceCharges) {
		this.serviceCharges = serviceCharges;
	}
	public String getCallCharges() {
		return callCharges;
	}
	public void setCallCharges(String callCharges) {
		this.callCharges = callCharges;
	}
	public String getTotalNumberOfCalls() {
		return totalNumberOfCalls;
	}
	public void setTotalNumberOfCalls(String totalNumberOfCalls) {
		this.totalNumberOfCalls = totalNumberOfCalls;
	}
	public String getTotalCallDuration() {
		return totalCallDuration;
	}
	public void setTotalCallDuration(String totalCallDuration) {
		this.totalCallDuration = totalCallDuration;
	}
	
} 
