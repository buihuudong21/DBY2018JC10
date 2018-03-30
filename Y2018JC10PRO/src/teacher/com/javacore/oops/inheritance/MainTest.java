package com.teacher.oops.inheritance;

public class MainTest {

	public static void main(String[] args) {
		Worker worker = new Worker("Nguyen Van A", 30, 1.60, 80, "Quan 7", "Samsung corp", 150000000);

		System.out.println(worker);
		System.out.println("==============================");
		System.out.println(worker.getsName());
		System.out.println(worker.getAddress());
		System.out.println(worker.getWeight());

	}

}