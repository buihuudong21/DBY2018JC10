package buihuudong;

public class TamGiac {
	static double a, b, c;

	public TamGiac(double a, double b, double c) {
		TamGiac.a = a;
		TamGiac.b = b;
		TamGiac.c = c;
	}

	public static double chuvi(TamGiac tg) {
		double ptg = (a + b + c) / 2;
		return ptg;
	}

	public static double dientich(TamGiac tg) {
		double ptg = chuvi(tg);
		return Math.sqrt(ptg * (ptg - a) * (ptg - b) * (ptg - c));
	}

	public static void main(String[] args) {
		// TamGiac tg = new TamGiac(6, 3, 4);
		// System.out.println(chuviTG(tg));
		// System.out.println(dientichTG(tg));
	}
}
