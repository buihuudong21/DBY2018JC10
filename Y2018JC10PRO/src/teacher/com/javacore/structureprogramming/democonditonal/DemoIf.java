package teacher.com.javacore.structureprogramming.democonditonal;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
		System.out.print("Nhap diem sinh vien:");
		double dMark = new Scanner(System.in).nextDouble();
		if (dMark < 0 || dMark >= 11) {
			System.out.println("Diem khong hop le !");
		} else {
			if (dMark >= 0 && dMark < 5.0) {
				System.out.println("Hoc luc yeu !");
			} else if (dMark >= 5.0 && dMark < 7.0) {
				System.out.println("Hoc luc trung binh");
			} else if (dMark >= 7.0 && dMark < 8.0) {
				System.out.println("Hoc luc kha");
			} else {
				if (dMark < 9.0) {
					System.out.println("Hoc luc tot");
				} else {
					System.out.println("Hoc luc Xuat sac");
				}

			}
		}

	}

}
