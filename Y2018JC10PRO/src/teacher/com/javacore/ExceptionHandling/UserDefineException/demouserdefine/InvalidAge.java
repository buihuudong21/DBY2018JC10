package teacher.com.javacore.ExceptionHandling.UserDefineException.demouserdefine;

public class InvalidAge extends Exception {
	private int ageNumber;

	public InvalidAge() {

	}

	public int getAgeNumber() {
		return ageNumber;
	}

	public void setAgeNumber(int ageNumber) {

		this.ageNumber = ageNumber;
	}

	public InvalidAge(int age) {
		super("Bạn chưa đủ tuổi nhập ngũ " + age); // Tương tác tới csdl
		this.ageNumber = age;
	}

}
