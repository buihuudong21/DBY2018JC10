package com.teacher.mvc.demomvc_onsite;

public class Views {
	public static void main(String[] args) {
		// 1. Tao du lieu cho doi tuong NumberEntity
		NumberEntity o = new NumberEntity();
		o.setNumberA(15222);
		o.setNumberB(2335);
		// 2. Chon toan tu can thuc hien
		o.setsOption("/");
		// 3. Goi uy quyen thuc hien (goi Controller)

		Controllers objController = new Controllers();

		// 4. Return ket qua

		System.out.println("The result is: " + objController.calculation(o));

	}
}
