package Teacher.Y2017JC79.jdbc_providers.DemoJDBC.Sample06;

public class StudentEntity {
	private int iRollNo;
	private String sFullName;
	private String sEmail;
	private String sMark;

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

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsMark() {
		return sMark;
	}

	public void setsMark(String sMark) {
		this.sMark = sMark;
	}

	@Override
	public String toString() {
		return sFullName;
	}
}
