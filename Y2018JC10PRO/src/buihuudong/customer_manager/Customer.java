package buihuudong.customer_manager;

public class Customer {
	private int custID;
	private String sFullName;
	private String sAddress;
	private String sLicense;
	private String sMobile;
	private double dblAmount;

	public Customer() {

	}

	public Customer(int custID, String sFullName, String sAddress, String sLicense, String sMobile, double dblAmount) {
		this.custID = custID;
		this.sFullName = sFullName;
		this.sAddress = sAddress;
		this.sLicense = sLicense;
		this.sMobile = sMobile;
		this.dblAmount = dblAmount;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsLicense() {
		return sLicense;
	}

	public void setsLicense(String sLicense) {
		this.sLicense = sLicense;
	}

	public String getsMobile() {
		return sMobile;
	}

	public void setsMobile(String sMobile) {
		this.sMobile = sMobile;
	}

	public double getDblAmount() {
		return dblAmount;
	}

	public void setDblAmount(double dblAmount) {
		this.dblAmount = dblAmount;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", sFullName=" + sFullName + ", sAddress=" + sAddress + ", sLicense="
				+ sLicense + ", sMobile=" + sMobile + ", dblAmount=" + dblAmount + "]";
	}

}
