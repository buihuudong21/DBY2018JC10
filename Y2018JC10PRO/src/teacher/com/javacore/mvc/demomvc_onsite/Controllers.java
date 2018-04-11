package com.teacher.mvc.demomvc_onsite;

public class Controllers {
	// Buoc 1: Phai cho Controller ket noi duoc voi Models
	private Models modelObject;

	public Controllers() {
		modelObject = new Models();
	}

	// Buoc 2: Dinh nghia ra mot ham chung de thuc hien tinh toan
	public double calculation(NumberEntity o) {
		double dResult;
		switch (o.getsOption()) {
		case "+":
			dResult = modelObject.Add(o);
			break;
		case "-":
			dResult = modelObject.Sub(o);
			break;
		case "*":
			dResult = modelObject.Mul(o);
			break;
		case "/":
			dResult = modelObject.Div(o);
			break;
		default:
			dResult = 0;
			break;
		}
		return dResult;
	}

}
