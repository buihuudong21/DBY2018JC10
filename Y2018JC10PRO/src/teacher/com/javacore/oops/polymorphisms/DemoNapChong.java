package com.teacher.oops.polymorphisms;

public class DemoNapChong {
	private static String sName = "Nguyen Van A";

	public static void main(String[] args) {
		printInfor();
		printInfor("Nguyen Cong Phuong");

		System.out.println("Tong hai so la: " + tinhTong(3, 5));
		System.out.println("Tong hai so la: " + tinhTong(3.0, 5));

	}

	public static void printInfor() {
		System.out.println("Thông tin số 1" + sName);
	}

	public static void printInfor(String sName) {
		System.out.println("Thông tin số 1" + sName);
	}

	public static double tinhTong(double a, double b) {
		System.out.println("SO double");
		return a + b;
	}

	public static int tinhTong(int a, int b) {
		System.out.println("SO nguyen");
		return a + b;
	}

}
