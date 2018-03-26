package buihuudong;

public class HinhTron {
	static double r;

	public HinhTron(double r) {
		HinhTron.r = r;
	}

	public static double chuvi(HinhTron ht) {
		return 2 * Math.PI * r;

	}

	public static double dientich(HinhTron ht) {
		return chuvi(ht) * r;

	}
}
