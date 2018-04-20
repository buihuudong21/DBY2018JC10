package com.teacher.collection_framework_excercise.collection_interface_framework_demo;

import com.teacher.collection_framework_excercise.collection_sample01.Employee;

public class MainApp {

	public static void main(String[] args) {
		// 1. Khai bao mang doi tuong
		IMyList<Employee> arrList = new MyArrayList<Employee>();
		MyArrayList<MyArrayList<Employee>> arr2Di = new MyArrayList<MyArrayList<Employee>>();

		// 2 Dua vao
		arrList.add(new Employee(1, "Nguyen Van A", 5000_000_000d));
		arrList.add(new Employee(2, "Nguyen Van B", 15_000_000_000d));
		arrList.add(new Employee(3, "Nguyen Van C", 25_000_000_000d));
		arrList.add(new Employee(4, "Nguyen Van D", 35_000_000_000d));
		arrList.add(new Employee(5, "Nguyen Van E", 45000000000d));
		arrList.add(new Employee(6, "Nguyen Van F", 55000000000d));

		// 3. In du lieu ra ngoai
		printMyArrayList(arrList);

	}

	public static <E> void printMyArrayList(IMyList<E> arrList) {
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

	}

}
