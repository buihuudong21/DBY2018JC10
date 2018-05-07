package teacher.com.javacore.ExceptionHandling.demo_onsite.example03;

@SuppressWarnings("serial")
public class InvalidAgeArmy extends Exception {

	private int iAge;

	public InvalidAgeArmy() {

	}

	public int getiAge() {
		return iAge;
	}

	public InvalidAgeArmy(int iAge) {
		super("Tuổi không hợp lệ vào quân đội " + iAge); // Sẽ xử lý connect to database
		this.iAge = iAge;
	}

}
