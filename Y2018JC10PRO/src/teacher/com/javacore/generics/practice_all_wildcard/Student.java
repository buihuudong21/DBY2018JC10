package teacher.com.javacore.generics.practice_all_wildcard;

public class Student extends Person {
	private double dMark;

	public Student() {

	}

	public Student(double dMark, String name, double weight) {
		super(name, weight);
		this.dMark = dMark;

	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

	@Override
	public String toString() {
		return "Ten sinh vien la: " + this.getName() + " co diem: " + this.dMark;
	}
}
