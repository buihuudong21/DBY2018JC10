package minhthuan.com.code.arrays.static_array;

import java.util.Random;
import java.util.Scanner;

public class DemoStaticArray {

	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("Nhap so luong phan tu");
		int n = new Scanner(System.in).nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			// arr[i] = new Scanner(System.in).nextInt();
			arr[i] = rd.nextInt(100);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
