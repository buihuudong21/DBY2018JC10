package minhthuan.com.code.final_excersise;

public class Student {
	private int Stt;
	private String sFullName;
	private String sAddress;
	private String sClass;
	private String sLicense;
	private String sPhoneNumber;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int stt, String sFullName, String sAddress, String sClass, String sLicense, String sPhoneNumber) {

		this.Stt = stt;
		this.sFullName = sFullName;
		this.sAddress = sAddress;
		this.sClass = sClass;
		this.sLicense = sLicense;
		this.sPhoneNumber = sPhoneNumber;
	}

	public Student(String sFullName, String sAddress, String sClass, String sLicense, String sPhoneNumber) {

		this.sFullName = sFullName;
		this.sAddress = sAddress;
		this.sClass = sClass;
		this.sLicense = sLicense;
		this.sPhoneNumber = sPhoneNumber;
	}

	public int getStt() {
		return Stt;
	}

	public void setStt(int stt) {
		Stt = stt;
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

	public String getsClass() {
		return sClass;
	}

	public void setsClass(String sClass) {
		this.sClass = sClass;
	}

	public String getsLicense() {
		return sLicense;
	}

	public void setsLicense(String sLicense) {
		this.sLicense = sLicense;
	}

	public String getsPhoneNumber() {
		return sPhoneNumber;
	}

	public void setsPhoneNumber(String sPhoneNumber) {
		this.sPhoneNumber = sPhoneNumber;
	}

}
