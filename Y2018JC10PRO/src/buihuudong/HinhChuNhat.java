package buihuudong;

public class HinhChuNhat {
	static double a, b;

	public HinhChuNhat(double a, double b) {
		HinhChuNhat.a = a;
		HinhChuNhat.b = b;
	}

	public static double chuvi(HinhChuNhat cn) {
		return (a + b) / 2;
	}

	public static double dientich(HinhChuNhat cn) {
		return a * b;
	}

	public static void main(String[] args) {
		HinhChuNhat cn = new HinhChuNhat(3, 4);
		System.out.println(chuvi(cn));
		System.out.println(dientich(cn));

	}
}
