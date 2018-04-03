package teacher.com.javacore.oops.abstract_class.demolive;

public class HighEmployee extends People {
	private int manDay;
	private double rate;
	private double addRate; // Phụ cấp

	public HighEmployee() {
		this.rate = 5.2;
		this.manDay = 29;
	}

	protected int getManDay() {
		return manDay;
	}

	protected void setManDay(int manDay) {
		this.manDay = manDay;
	}

	protected double getAddRate() {
		return addRate;
	}

	protected void setAddRate(double addRate) {
		this.addRate = addRate;
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return this.manDay * 600000 * this.rate + this.addRate;
	}

}
