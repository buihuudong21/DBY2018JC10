package com.teacher.oops.castingobject_instanceof.castingdemo;

public class MainApp {

	public static void main(String[] args) {
		// Tính đa hìnhm --Up Casting
		Person obj = new SinhVien(1, "Nguyễn Văn A", 8.9); // implicit casting
		printObject((SinhVien) obj); // Down Casting

		SinhVien sv01 = (SinhVien) obj; // Explicit Casting --Down Casting
		printObject(sv01);

		// Hiểu về instance of
		System.out.println(sv01 instanceof Person);
		System.out.println(obj instanceof SinhVien);

	}

	public static void printObject(SinhVien o) {
		System.out.println(o);
	}
}
