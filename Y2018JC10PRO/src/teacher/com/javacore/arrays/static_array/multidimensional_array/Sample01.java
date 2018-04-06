package com.teacher.arrays.static_array.multidimensional_array;

public class Sample01 {

	public static void main(String[] args) {
		// 1. Khai báo
		int[][] matrix = new int[10][5];

		int[][] myArray = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };

		// 2. Fill giá trị vào mảng 2 chiều
		for (int row = 0; row < matrix.length; ++row) {

			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 1000);

			}

		}
		// 3. In ra ngoài
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}

		System.out.println();
	}

}
