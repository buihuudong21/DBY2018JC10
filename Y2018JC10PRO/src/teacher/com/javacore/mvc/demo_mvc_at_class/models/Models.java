package teacher.com.javacore.mvc.demo_mvc_at_class.models;

import teacher.com.javacore.mvc.demo_mvc_at_class.entitynumber.NumberEntity;

public class Models {
	// 1. Method cộng
	public double Add(NumberEntity objNumber) {
		return objNumber.getdNumberA() + objNumber.getdNumberB();
	}

	// 2. Phép Trừ
	public double Sub(NumberEntity objNumber) {
		return objNumber.getdNumberA() - objNumber.getdNumberB();
	}

	// 3. Phép nhân
	public double Mul(NumberEntity objNumber) {
		return objNumber.getdNumberA() * objNumber.getdNumberB();
	}

	// 4. Method chia
	public double Div(NumberEntity objNumber) {
		return objNumber.getdNumberA() / objNumber.getdNumberB();
	}

}
