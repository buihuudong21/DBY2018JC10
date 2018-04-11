package teacher.com.javacore.mvc.demo_mvc_at_class.entitynumber;

public class NumberEntity {
	// định nghĩa các thành phần cần có cho số
	private double dNumberA;
	private double dNumberB;
	private byte bOption; // 0 => +; 1 => -; 2=> *; 3 => /

	public NumberEntity() {

	}

	public NumberEntity(double dNumberA, double dNumberB, byte bOption) {

		this.dNumberA = dNumberA;
		this.dNumberB = dNumberB;
		this.bOption = bOption;
	}

	public double getdNumberA() {
		return dNumberA;
	}

	public void setdNumberA(double dNumberA) {
		this.dNumberA = dNumberA;
	}

	public double getdNumberB() {
		return dNumberB;
	}

	public void setdNumberB(double dNumberB) {
		this.dNumberB = dNumberB;
	}

	public byte getbOption() {
		return bOption;
	}

	public void setbOption(byte bOption) {
		this.bOption = bOption;
	}

}
