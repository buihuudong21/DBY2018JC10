package teacher.com.javacore.ExceptionHandling.UserDefineException.demouserdefine;

public class MainApp {

	public static void main(String[] args) {
		// Thiết lập đội tuổi
		// 1. Tạo ra đối tượng
		try {
			UsingCheckAgeException checkException = new UsingCheckAgeException(17);
		} catch (InvalidAge e) {
			System.out.println(e.getMessage());

		}

	}

}
