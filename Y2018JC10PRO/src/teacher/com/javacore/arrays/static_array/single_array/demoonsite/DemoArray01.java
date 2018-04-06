package com.teacher.arrays.static_array.single_array.demoonsite;

public class DemoArray01 {

	public static void main(String[] args) {
		// byte, short, int, double, float...Byte, Short, Integer, Double...
		// Cach 1
		double[] arrList = { 2.5, 3.0, 8.0, 9, 56, 55 }; // => Mang mot chieu.
		// Cach 2. Dinh nghia kich co cua mang (size)
		double[] arrListDouble = new double[50];
		// Cach 3: Vua define size vua khoi tao luon gia tri
		int[] arrInt = new int[] { 1, 7, 9, 2, 4, 322, 44, 6, 66 };
		// Duyet qua cac phan tu mang de hien thi ra ngoai

		for (int i = 0; i < arrInt.length; i++) {
			System.out.println("Gia tri thu " + (i + 1) + " la: " + arrInt[i]);
		}

	}

}
