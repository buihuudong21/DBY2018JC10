package teacher.com.javacore.ExceptionHandling.demo_onsite.example03;

public class MainDefineException {

	public static void main(String[] args) {
		try {
			new RunCheckAgeException(17);

		} catch (InvalidAgeArmy e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Đủ tổi !(:");
		}
	}

}
