package teacher.com.javacore.oops.abstract_class.demolive;

public class Employee extends People {
	private double rate; // hệ số của nhân viên
	private int manDay; // ngày công

	public Employee() {
		this.rate = 2.34;
		this.manDay = 30;
	}

	public int getManDay() {
		return manDay;
	}

	public void setManDay(int manDay) {
		this.manDay = manDay;
	}

	@Override
	public double salary() {

		return this.manDay * 500000 * this.rate;

	}

}
