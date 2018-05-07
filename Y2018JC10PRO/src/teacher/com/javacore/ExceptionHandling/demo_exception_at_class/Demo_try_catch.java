package teacher.com.javacore.ExceptionHandling.demo_exception_at_class;

public class Demo_try_catch {

	public static void main(String[] args) {
		int a, b;
		a = 10;
		b = 0;

		try {
			System.out.println("ket qua cua phep chia: " + div(a, b));
		} catch (ArithmeticException e) {
			// Xu ly loi o day
			System.out.println("Loi la: " + e.getMessage());
			System.out.println("Class la: " + e.getClass());
		}

		System.out.println("Ket thuc");// xu ly write to log

	}

	public static int div(int a, int b) {
		return a / b;
	}
}
