package buihuudong;

import java.util.Scanner;

public class Hinh {

	public static void main(String[] args) {
		String cantinh = "";
		String chonhinh = "";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("bam p de tinh chu vi, s de tinh dien tich");
			cantinh = scanner.nextLine().toLowerCase();
		} while (!cantinh.equals("p"));

		do {
			System.out.println("v hinh vuong, g tam giac, c chu nhat, t hinh tron");
			chonhinh = scanner.nextLine().toLowerCase();
		} while (!chonhinh.equals("v") || !chonhinh.equals("g") || !chonhinh.equals("c") || !chonhinh.equals("t"));

		// hinh vuong
		if (chonhinh.equals("v"))

		{
			System.out.println("nhap vao chieu dai canh: ");
			double a = scanner.nextDouble();
			HinhVuong hv = new HinhVuong(a);
			if (cantinh.equals("p")) {
				// chu vi hinh vuong
				System.out.println("chu vi hinh vuong la: " + HinhVuong.chuvi(hv));
			} else if (cantinh.equals("s")) {
				System.out.println("dien tich hinh vuong la: " + HinhVuong.dientich(hv));
			}
		}
		// tam giac
		if (chonhinh.equals("g")) {
			System.out.println(" nhap vao chieu dai 3 canh a b c: ");
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();
			TamGiac tg = new TamGiac(a, b, c);
			if (cantinh.equals("p")) {
				System.out.println("chu vi tam giac la: " + TamGiac.chuvi(tg));
			} else if (cantinh.equals("s")) {
				System.out.println("dien tich tam giac la: " + TamGiac.dientich(tg));
			}
		}
		// chu nhat
		if (chonhinh.equals("c")) {
			System.out.println("nhap vao chieu dai va chieu rong: ");
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			HinhChuNhat cn = new HinhChuNhat(a, b);
			if (cantinh.equals("p")) {
				System.out.println("chu vi hinh chu nhat: " + HinhChuNhat.chuvi(cn));
			} else if (cantinh.equals("s")) {
				System.out.println("dien tich chu nhat: " + HinhChuNhat.dientich(cn));
			}

		}
		if (chonhinh.equals("t")) {
			System.out.println("nhap vao ban kinh : ");
			double r = scanner.nextDouble();
			HinhTron ht = new HinhTron(r);
			if (cantinh.equals("p")) {
				System.out.println("chu vi hinh tron la: " + HinhTron.chuvi(ht));
			} else if (cantinh.equals("s")) {
				System.out.println("dien tich hinh tron la " + HinhTron.dientich(ht));

			}
		}
		scanner.close();
	}
}
