package teacher.com.javacore.baitaptonghop;

public class Customer {
	// 1. Thành phần dữ liệu (data field)
	private int custID; // Mã KH
	private String sFullName; // Họ tên khách hàng
	private String sAddress;// Địa chỉ KH
	private String sMobile; // Số điện thoại
	private Double dblAmount; // Số tiền của KH
	// 2. Hàm tạo

	public Customer() {

	}

	public Customer(int custID, String sFullName, String sAddress, String sMobile, Double dblAmount) {
		this.custID = custID;
		this.sFullName = sFullName;
		this.sAddress = sAddress;
		this.sMobile = sMobile;
		this.dblAmount = dblAmount;
	}
	// 3. Các hàm sets và gets

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

	public String getsMobile() {
		return sMobile;
	}

	public void setsMobile(String sMobile) {
		this.sMobile = sMobile;
	}

	public Double getDblAmount() {
		return dblAmount;
	}

	public void setDblAmount(Double dblAmount) {
		this.dblAmount = dblAmount;
	}

	// 4. overide hàm toString của lớp cha (object)
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", sFullName=" + sFullName + ", sAddress=" + sAddress + ", sMobile="
				+ sMobile + ", dblAmount=" + dblAmount + "]";
	}

}
