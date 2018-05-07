package teacher.com.javacore.ExceptionHandling.demo_onsite.example01;

public class Exception_Divided_Number {

	public static void main(String[] args) {
		int num01 = 10;
		int num02 = 0;

		try {
			System.out.println("Thuong cua a chia b la: " + getQuatient(num01, num02));
		} catch (ArithmeticException e1) {
			System.out.println("Không được phép chia cho 0");
		} catch (Exception e2) {
			System.out.println("Một ngoại lệ khác");
		}
		System.out.println("Kết thúc phép chia");

	}

	public static double getQuatient(int a, int b) {

		if (b == 0) {
			throw new ArithmeticException();
		}

		return a / b;

	}

}
