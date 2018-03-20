package teacher.com.javacore.structureprogramming.demofunction;

import java.util.Scanner;

public class DemoFunction {

	public static void main(String[] args) {
		// Demo cách dùng một hàm
		Scanner sc = new Scanner(System.in);
		System.out.print("Giá trị của x là: ");
		int x = sc.nextInt();
		System.out.println();
		System.out.println("Giá trị của y là: ");
		int y = sc.nextInt();

		System.out.println("Kết quả là: " + tinhTong(x, y));
		sc.close();
	}

	// Định nghĩa một hàm => có trả về kết quả.
	public static int tinhTong(int a, int b) {
		return (a + b);
	}

}
