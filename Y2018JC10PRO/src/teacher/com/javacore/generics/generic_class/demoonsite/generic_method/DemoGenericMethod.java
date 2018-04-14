package com.teacher.generics.generic_class.demoonsite.generic_method;

import java.util.LinkedList;
import java.util.List;

public class DemoGenericMethod {
	// Yeu cau: Viet mot phuong thuc de in ra danh sach cac phan tu trong mang

	public static void main(String[] args) {
		Integer[] arrList = new Integer[10];
		arrList[0] = 433;
		arrList[1] = 56456;
		arrList[2] = 4564;
		arrList[3] = 43234233;
		arrList[4] = 3242;
		arrList[5] = 23;
		arrList[6] = 23464;
		arrList[7] = 432343;
		arrList[8] = 4756533;
		arrList[9] = 43763;

		List<String> arrString = new LinkedList<String>();
		arrString.add("A");
		arrString.add("B");
		arrString.add("C");
		arrString.add("D");
		arrString.add("E");
		arrString.add("F");

		printArray(arrString);

	}

	public static <E> void printArray(List<E> arrList) {
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ; ");
		}
		System.out.println();

	}

}
