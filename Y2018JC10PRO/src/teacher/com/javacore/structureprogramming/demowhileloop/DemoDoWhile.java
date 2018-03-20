package teacher.com.javacore.structureprogramming.demowhileloop;

import java.util.Scanner;

public class DemoDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i = 0;
		System.out.println("Nhập giá trị n: ");
		n = sc.nextInt();
		do {
			System.out.println("Giá trị của i là: " + (i + 1));
			i++;
		} while (i < n);

	}

}
