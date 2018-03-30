package com.teacher.oops.abstract_class.abstract_demo_02;

public class TextBoxGui extends VIEWS {
	@Override
	public String PrintInfo() {
		return Processing();
	}

	/* Nghiệp vụ được che giấu khi thực hiện */
	public String Processing() {
		return "Giao diện của TextBox Controls đã customs!";
	}

	@Override
	public void HienThiDuLieu() {
	}
}
