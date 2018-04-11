package com.teacher.mvc.demomvc_onsite;

public class Models {

	public Models() {

	}

	// 1. Viết hàm tính tổng hai số: mà 2 số này nằm trong đối đượng NumberEntity
	public double Add(NumberEntity o) {
		return o.getNumberA() + o.getNumberB();
	}

	// 2. Viet ham tinh phep tru
	public double Sub(NumberEntity o) {
		return o.getNumberA() - o.getNumberB();
	}

	// 3. Viet ham Nhan 2 so
	public double Mul(NumberEntity o) {
		return o.getNumberA() * o.getNumberB();
	}

	// 4. phep chia

	public double Div(NumberEntity o) {
		return o.getNumberA() / o.getNumberB();
	}

}
