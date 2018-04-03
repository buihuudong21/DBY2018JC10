package teacher.com.javacore.oops.polymorphisms.Overiding;

public class Student extends People {
	private static final String nameOfSchool = "IMIC";
	private String id;
	private double dMark;

	public Student() {
		this.id = "";
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public Student(String name, int age, String id, double dMark) {
		super(name, age);
		this.id = id;
		this.dMark = dMark;
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected double getdMark() {
		return dMark;
	}

	protected void setdMark(double dMark) {
		this.dMark = dMark;
	}

	// Ghi de ham toString cua doi tuong Object
	@Override
	public String toString() {

		return "Họ và tên sinh viên: " + this.getName() + " có điểm: " + this.getdMark();
	}

}
