package teacher.com.javacore.oops.inheritance.demoextends;

public class Address {
	private String thon;
	private String xa;
	private String huyen;
	private String tinh;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String thon, String xa, String huyen, String tinh) {

		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}

	protected String getThon() {
		return thon;
	}

	protected void setThon(String thon) {
		this.thon = thon;
	}

	protected String getXa() {
		return xa;
	}

	protected void setXa(String xa) {
		this.xa = xa;
	}

	protected String getHuyen() {
		return huyen;
	}

	protected void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	protected String getTinh() {
		return tinh;
	}

	protected void setTinh(String tinh) {
		this.tinh = tinh;
	}

	protected String displayInforAddress() {
		return "Địa chỉ: " + this.thon + " Xã: " + this.xa + " Huyện: " + this.huyen + " Tỉnh: " + this.tinh;
	}
}
