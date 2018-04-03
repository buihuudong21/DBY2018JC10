package teacher.com.javacore.oops.polymorphisms;

public class DemoOverload {

	public static void main(String[] args) {
		System.out.println("Tong hai so la: " + tinhTong(15.5, 20));
	}

	public static double tinhTong(int a, int b) {
		return (a + b);
	}

	public static double tinhTong(double a, double b) {
		return (a + b);
	}
}
