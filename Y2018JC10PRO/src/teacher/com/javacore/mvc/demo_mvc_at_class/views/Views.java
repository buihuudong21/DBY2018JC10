package teacher.com.javacore.mvc.demo_mvc_at_class.views;

import java.util.Scanner;

import teacher.com.javacore.mvc.demo_mvc_at_class.controllers.Controllers;
import teacher.com.javacore.mvc.demo_mvc_at_class.entitynumber.NumberEntity;

public class Views {

	public static void main(String[] args) {
		// 1 Khai báo đối tương để gọi tới controller
		Controllers controllers;
		NumberEntity objNumber = new NumberEntity();
		inputValue(objNumber);
		// 2. Gọi controller để yêu cầu tra ra kết quả
		controllers = new Controllers();

		System.out.println("Kết quả phép tính là: " + controllers.excuteCalculator(objNumber));

	}

	private static void inputValue(NumberEntity obj) {
		// 2. Định nghĩa dữ liệu cho EntityNumber
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số thứ 1:");
		double numberA = sc.nextDouble();
		System.out.print("Nhập số thứ 2:");
		double numberB = sc.nextDouble();
		System.out.print("Hãy chọn phép tính (0 - Cộng; 1 - Trừ; 2-nhân và 3- chia): ");
		byte bOption = sc.nextByte();
		System.out.println();
		sc.close();
		// Gán giá trị vào đói tượng
		obj.setdNumberA(numberA);
		obj.setdNumberB(numberB);
		obj.setbOption(bOption);

	}

}
