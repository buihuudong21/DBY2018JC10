package teacher.com.javacore.oops.inheritance.demoextends;

public class Student extends Person { // IS -A
	private double dMark;
	private static String strNameOfSchool = "Imic";

	public Student() {

	}

	public Student(double dMark) {

		this.dMark = dMark;
	}

	public Student(double dMark, String sFullName, short age, double height, double weight, Address address) {
		super(sFullName, age, height, weight, address);
		this.dMark = dMark;

	}

	protected double getdMark() {
		return dMark;
	}

	protected void setdMark(double dMark) {
		this.dMark = dMark;
	}

	protected String getStrNameOfSchool() {
		return strNameOfSchool;
	}

}
