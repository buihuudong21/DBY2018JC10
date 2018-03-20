package teacher.com.javacore.structureprogramming.demowhileloop;

import java.util.Scanner;

public class DemoWhileLoop {

	public static void main(String[] args) {
		// Cho 1 số n - nhập từ bàn phím. Và in ra từ 1 cho đến n và mỗi lần cách nhau 1
		// đơn vị
		System.out.println("Nhập giá trị n:");
		int n = new Scanner(System.in).nextInt();
		int i = 0;
		while (i < n) {
			System.out.println("Giá trị của i là: " + (i + 1));
			i = i + 1;
		}

	}

}
