package com.teacher.arrays.dynamic_array.samples.Baitoan04;

import java.util.ArrayList;
import java.util.List;

import com.teacher.arrays.dynamic_array.samples.baitoan03.Employment;

public class Views {

	public static void main(String[] args) {
		// 1. Khai bao doi tuong Employment
		List<Employment> lstEmployment1 = new ArrayList<>();
		List<Employment> lstEmployment2 = new ArrayList<>();
		ArrayEmployment arrayEmployment = new ArrayEmployment();
		List<List<Employment>> lstLstEmployment = new ArrayList<List<Employment>>();
		Controllers controllers = new Controllers();

		Employment emp1 = new Employment(1, "A", "HCM", 2555.5);
		Employment emp2 = new Employment(2, "B", "HCM", 44555.5);
		Employment emp3 = new Employment(3, "C", "HCM", 255666455.5);
		Employment emp4 = new Employment(4, "D", "HCM", 2556665465.5);
		Employment emp5 = new Employment(5, "E", "HCM", 255456455.5);
		// 2. Dua vao List
		lstEmployment1.add(emp1);
		lstEmployment1.add(emp2);
		lstEmployment1.add(emp3);
		lstEmployment1.add(emp4);
		lstEmployment1.add(emp5);

		lstEmployment2.add(emp1);
		lstEmployment2.add(emp2);
		lstEmployment2.add(emp3);
		lstEmployment2.add(emp4);
		lstEmployment2.add(emp5);

		// 3. Dua vao mang da chieu List
		lstLstEmployment.add(lstEmployment1);
		lstLstEmployment.add(lstEmployment2);

		// 4. Dua vao doi duong du lieu
		arrayEmployment.setArrEmploy(lstLstEmployment);
		// 5. Return tong luong cua tat ca cac nhan vien

		System.out.println("Total of Salary is: " + controllers.sumSalary(arrayEmployment));

	}

}
