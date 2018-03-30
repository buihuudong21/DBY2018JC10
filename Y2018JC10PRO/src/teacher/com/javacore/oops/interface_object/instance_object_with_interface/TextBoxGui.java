package com.teacher.oops.interface_object.instance_object_with_interface;

public class TextBoxGui implements IVIEWS {
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
