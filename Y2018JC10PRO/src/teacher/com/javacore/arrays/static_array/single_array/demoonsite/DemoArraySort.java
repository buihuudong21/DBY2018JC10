package com.teacher.arrays.static_array.single_array.demoonsite;

public class DemoArraySort {

	public static void main(String[] args) {
		int[] arrInt = new int[] { 7, 1, 9, 2, 4, 322, 44, 6, 66 };
		// insertionSort(arrInt);

		int[] reArray = arraySort(arrInt);
		printArray(reArray);

	}

	// Phuong thuc sap xep gia tri mang theo chieu tang dan
	public static int[] arraySort(int[] array) {
		// Algorithms
		int[] arr = array;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// Hoan vi
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "  ");
		}

	}

	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			/**
			 * insert list[i] into a sorted sublist list[0..i-1] so that list[0..i] is
			 * sorted.
			 */
			int currentElement = list[i];
			int k;
			for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
				list[k + 1] = list[k];
			}
			// Insert the current element into list[k+1]
			list[k + 1] = currentElement;
		}
	}

}
