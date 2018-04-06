package com.teacher.arrays.static_array.single_array.demoonsite;

public class DemoArray03 {

	public static void main(String[] args) {
		// demo ve copy mang a sang mang b
		// 1. define the array variable
		double[] myList = new double[100];
		// 2. Fill all value into array
		for (int i = 0; i < myList.length; i++) {
			myList[i] = Math.round(Math.random() * 100);
		}
		// 3 copy sang mang khac
		double[] myListCopy = new double[myList.length];
		for (int i = 0; i < myList.length; i++) {
			myListCopy[i] = myList[i];
		}
		// 4. In ra ngoai
		printArray(myListCopy);

		// Copy cach 2 - su dung ham co san cua java
		double[] myListCopySystem = new double[myList.length];
		System.arraycopy(myList, 0, myListCopySystem, 0, myList.length);
		printArray(myListCopySystem);

		printArray(1, 5, 6, 7, 8, 8, 3, 22, 222222);

	}

	public static void printArray(double... arr) {
		for (int k = 0; k < arr.length; k++) {
			System.out.println("Value number " + (k + 1) + " is: " + arr[k]);
		}

	}

}
