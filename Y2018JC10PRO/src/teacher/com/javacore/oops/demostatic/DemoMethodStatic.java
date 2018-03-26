package teacher.com.javacore.oops.demostatic;

public class DemoMethodStatic {

	public static void main(String[] args) {

		DemoMethodStatic calculation = new DemoMethodStatic();

		System.out.println("Tổng hai số a và b là: " + calculation.tinhTong(1000, 6434535));
	}

	public int tinhTong(int a, int b) {
		return (a + b);
	}
}
