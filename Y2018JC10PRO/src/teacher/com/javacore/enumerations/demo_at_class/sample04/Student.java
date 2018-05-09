package teacher.com.javacore.enumerations.demo_at_class.sample04;

public class Student {
	private int ID;
	private String sFullName;
	private double dMark;

	public Student() {

	}

	public Student(int iD, String sFullName, double dMark) {
		ID = iD;
		this.sFullName = sFullName;
		this.dMark = dMark;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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
		return "Student [ID=" + ID + ", sFullName=" + sFullName + ", dMark=" + dMark + "]";
	}

}
