package teacher.com.javacore.Json_module.demo_json.google_json.EXAMPLE01;

public class Students {
	private int iRollNo;
	private String sFullName;
	private double dMark;

	public Students() {
	}

	public int getiRollNo() {
		return iRollNo;
	}

	public void setiRollNo(int iRollNo) {
		this.iRollNo = iRollNo;
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

	@Override
	public String toString() {
		return String.format("iRollNo: %s - sFullName: %s - dMark: %s", iRollNo, sFullName, dMark);
	}
}
