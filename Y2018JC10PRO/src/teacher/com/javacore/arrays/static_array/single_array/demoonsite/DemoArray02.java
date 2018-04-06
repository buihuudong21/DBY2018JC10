package com.teacher.arrays.static_array.single_array.demoonsite;

public class DemoArray02 {

	public static void main(String[] args) {
		// 1. define the array variable
		double[] myList = new double[100];
		// 2. Fill all value into array
		for (int i = 0; i < myList.length; i++) {
			myList[i] = Math.round(Math.random() * 100);
		}
		// 3 print to screen.
		printArray(myList);
		System.out.println("========================");
		for (double d : myList) {
			System.out.println(d);
		}
	}

	public static void printArray(double[] arr) {
		for (int k = 0; k < arr.length; k++) {
			System.out.println("Value number " + (k + 1) + " is: " + arr[k]);
		}

	}

}
