package com.teacher.oops.interface_object.instance_object_with_interface;

public class ListViewGUI implements IVIEWS {
	@Override
	public String PrintInfo() {
		return Processing();
	}

	public String Processing() {
		return "Giao diện của ListView Controls đã customs!";
	}

	@Override
	public void HienThiDuLieu() {

	}
}
