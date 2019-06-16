/**
 * 
 */
package za.ac.wits.domain.statement;

/**
 * @author f4780027
 *
 */
public class MunicipalStatement  extends Statement{
	
	private String instalmentNotice;
	private String electrictyUsed;
	private String electrictyCharges;
	private String gaseUsed;
	private String gasCharges;
	private String waterUsed;
	private String waterCharges;
	private String sewerageCharges;
	private String refuseCharges;
	
	public String getInstalmentNotice() {
		return instalmentNotice;
	}
	public void setInstalmentNotice(String instalmentNotice) {
		this.instalmentNotice = instalmentNotice;
	}
	public String getElectrictyUsed() {
		return electrictyUsed;
	}
	public void setElectrictyUsed(String electrictyUsed) {
		this.electrictyUsed = electrictyUsed;
	}
	public String getElectrictyCharges() {
		return electrictyCharges;
	}
	public void setElectrictyCharges(String electrictyCharges) {
		this.electrictyCharges = electrictyCharges;
	}
	public String getGaseUsed() {
		return gaseUsed;
	}
	public void setGaseUsed(String gaseUsed) {
		this.gaseUsed = gaseUsed;
	}
	public String getGasCharges() {
		return gasCharges;
	}
	public void setGasCharges(String gasCharges) {
		this.gasCharges = gasCharges;
	}
	public String getWaterUsed() {
		return waterUsed;
	}
	public void setWaterUsed(String waterUsed) {
		this.waterUsed = waterUsed;
	}
	public String getWaterCharges() {
		return waterCharges;
	}
	public void setWaterCharges(String waterCharges) {
		this.waterCharges = waterCharges;
	}
	public String getSewerageCharges() {
		return sewerageCharges;
	}
	public void setSewerageCharges(String sewerageCharges) {
		this.sewerageCharges = sewerageCharges;
	}
	public String getRefuseCharges() {
		return refuseCharges;
	}
	public void setRefuseCharges(String refuseCharges) {
		this.refuseCharges = refuseCharges;
	}

}
