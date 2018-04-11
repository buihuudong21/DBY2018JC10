package teacher.com.javacore.mvc.demo_mvc_at_class.controllers;

import teacher.com.javacore.mvc.demo_mvc_at_class.entitynumber.NumberEntity;
import teacher.com.javacore.mvc.demo_mvc_at_class.models.Models;

public class Controllers {
	// 1. Kết nối sang Models
	private Models models;

	// 2. Sử dụng contructor để khởi tạo đối tượng models
	public Controllers() {
		models = new Models();
	}

	// 3 Xử lý nghiệp vụ
	public Double excuteCalculator(NumberEntity obj) {
		byte bOption = obj.getbOption();
		Double dblResult = 0.0;

		switch (bOption) {
		case 0:
			dblResult = models.Add(obj);
			break;
		case 1:
			dblResult = models.Sub(obj);
			break;
		case 2:
			dblResult = models.Mul(obj);
			break;
		case 3:
			dblResult = models.Div(obj);
			break;
		default:
			break;
		}

		return dblResult;
	}

}
