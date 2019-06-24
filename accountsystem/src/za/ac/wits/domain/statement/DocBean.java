package za.ac.wits.domain.statement;

public class DocBean {

	private CreditCardStatement credit ;
	private MunicipalStatement municipality;
	private TelecomStatement telecoms;
	
	private String currentDate;

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public CreditCardStatement getCredit() {
		return credit;
	}

	public void setCredit(CreditCardStatement credit) {
		this.credit = credit;
	}

	public MunicipalStatement getMunicipality() {
		return municipality;
	}

	public void setMunicipality(MunicipalStatement municipality) {
		this.municipality = municipality;
	}

	public TelecomStatement getTelecoms() {
		return telecoms;
	}

	public void setTelecoms(TelecomStatement telecoms) {
		this.telecoms = telecoms;
	}
	
	
	
	
}
