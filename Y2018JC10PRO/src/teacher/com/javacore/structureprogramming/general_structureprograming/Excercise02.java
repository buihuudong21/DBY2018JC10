package teacher.com.javacore.structureprogramming.general_structureprograming;

import java.util.Scanner;

public class Excercise02 {

	public static void main(String[] args) {
		// 1. Kiểm tra trạng thái các điều khiển trên giao diện.
		// a. Mời nhập UserName?
		String strUserName = "";
		String strPassWord = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Mời nhập UserName?");

			// b. Khai báo biến nhận giá trị nhập vào
			strUserName = sc.nextLine();
		} while (strUserName.isEmpty());

		do {
			System.out.println("Mời nhập PassWord?");

			// c. Khai báo biến nhận giá trị nhập vào
			strPassWord = sc.nextLine();
		} while (strPassWord.isEmpty());

		// 2. Kiểm tra xác thực thông tin và đưa ra điều hướng tương
		// ứng.
		if (strUserName.equals("doannv") && strPassWord.equals("nothing"))
			System.out.println("Chúc mừng bạn đã đăng nhập thành công!!!");
		else
			System.out.println("Rất tiếc, tài khoản của bạn ko tồn tại :<");
	}
}