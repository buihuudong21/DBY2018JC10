package teacher.com.javacore.arrays.static_array.single_array.practice_array;

public class DemoStaticArray {

	public static void main(String[] args) {

		// 1. Khai bao mang
		// Cach 1
		// int[] arr = { 5, 42, 534, 1231, 7, 3, 8, 93, 983 };
		// Cach 2
		Integer[] arr = new Integer[100];
		// dua du lieu vao mang
		// arr[0] =120;
		for (int i = 0; i < arr.length; i++) {
			// arr[i] = Integer.parseInt(String.valueOf(Math.random() * 10000));
			arr[i] = (int) Math.round(Math.random() * 1000000);
		}
		// cach 3
		int[] arr3 = new int[] { 5, 42, 534, 1231, 7, 3, 8, 93, 983 };

		// 2. In ra man hinh
		printValueArray(arr3);

	}

	public static void printValueArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
