package teacher.com.javacore.mvc.sample01;

public class Models {

	public double Add(NumberEntity objCal) {
		return objCal.getdNumA() + objCal.getdNumB();
	}

	public double Sub(NumberEntity objCal) {
		return objCal.getdNumA() - objCal.getdNumB();
	}

	public double Mul(NumberEntity objCal) {
		return objCal.getdNumA() * objCal.getdNumB();
	}

	public double Div(NumberEntity objCal) {
		return objCal.getdNumA() / objCal.getdNumB();
	}

}
