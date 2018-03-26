package buihuudong;

public class HinhVuong {
	static double a;

	public HinhVuong(double a) {
		HinhVuong.a = a;
	}

	public static double chuvi(HinhVuong hv) {
		return a * 4;

	}

	public static double dientich(HinhVuong hv) {
		return a * a;
	}

	public static void main(String[] args) {
		HinhVuong hv = new HinhVuong(4);
		System.out.println(chuvi(hv));
		System.out.println(dientich(hv));
	}

}
