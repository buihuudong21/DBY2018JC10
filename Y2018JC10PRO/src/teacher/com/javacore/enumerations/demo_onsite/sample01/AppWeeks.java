package com.teacher.enumerations.demo_onsite.sample01;

public class AppWeeks {
	public static void main(String[] args) {
		// 1. Khai báo biến kiểu liệt kê (enumeration)
		WeekDays monday = WeekDays.mon;
		System.out.println("Value is " + monday);
		// 2. Lấy tất cả các giá trị trong một enum

		WeekDays[] allDays = WeekDays.values();

		// In ra màn hình

		for (WeekDays weekDays : allDays) {
			System.out.println(weekDays);
		}
	}

}
