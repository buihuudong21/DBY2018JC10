package teacher.com.javacore.oops.castingobject_instanceof.castingdemo;

public class SinhVien extends Person {
	// instance variable - Data fields
	private int iRollID; // Mã sinh viên
	private String sFullName; /* Tên đầy đủ */
	private double dMark;

	public SinhVien() {

	}

	public SinhVien(int iRollID, String sFullName, double dMark) {

		this.iRollID = iRollID;
		this.sFullName = sFullName;
		this.dMark = dMark;
	}

	public int getiRollID() {
		return iRollID;
	}

	public void setiRollID(int iRollID) {
		this.iRollID = iRollID;
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

	@Override // anotation
	public String toString() {
		return "ID: " + this.iRollID + " - " + "FullName: " + this.sFullName + " - " + this.dMark;
	}

}
