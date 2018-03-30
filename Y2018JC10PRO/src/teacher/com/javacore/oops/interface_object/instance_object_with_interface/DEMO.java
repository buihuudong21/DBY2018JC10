package com.teacher.oops.interface_object.instance_object_with_interface;

public class DEMO {

	public static void main(String[] args) {

		// Khai báo giao diện GUI
		IVIEWS objView = null;

		// 1. View với TextBox
		objView = new TextBoxGui();
		System.out.println("Info: " + objView.PrintInfo());

		// 2. View với Button
		objView = new ButtonGui();
		System.out.println("Info: " + objView.PrintInfo());

		// 3. View với ListView
		objView = new ListViewGUI();
		System.out.println("Info: " + objView.PrintInfo());
	}
}
