package com.teacher.arrays.dynamic_array.democollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoCollection01 {

	public static void main(String[] args) {
		// 1. Khai bao va khoi tao ArrayList
		ArrayList<Double> myList = new ArrayList<Double>(); // Tinh da hinh
		// Double[] myArray = new Double[10];
		// 2. Them du cac phan tu vao mang

		myList.add(5.2);
		myList.add(5.5);

		myList.add(97.5);
		myList.add(955.5);
		myList.add(847.5);
		myList.add(444.5);
		// 3. In ra so luong phan thu trong mang
		System.out.println("So luong: " + myList.size());
		// 4. Lặp và in ra màn hình
		Collections.sort(myList);

		for (Double d : myList) {
			System.out.print(d + " ; ");

		}
		System.out.println();
		System.out.println("================================");

		Iterator<Double> iterator = myList.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ; ");
		}

	}

}
