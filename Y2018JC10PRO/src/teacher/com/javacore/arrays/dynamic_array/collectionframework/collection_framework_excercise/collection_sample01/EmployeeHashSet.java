package com.teacher.collection_framework_excercise.collection_sample01;

import java.util.TreeSet;

public class EmployeeHashSet {
	public static void main(String[] args) {
		// 1. Khai bao
		// Set<Employee> objSetEmp = new HashSet<Employee>();
		// Set<Employee> objSetEmp = new LinkedHashSet<>();
		TreeSet<Employee> objSetEmp = new TreeSet<Employee>();
		// 2. Khoi tao mot tap cac sinh vien va dua va Set
		Employee employee1 = new Employee(1, "Nguyen Van A", 5000_000_000d);
		Employee employee2 = new Employee(2, "Nguyen Van B", 15_000_000_000d);
		Employee employee3 = new Employee(3, "Nguyen Van C", 25_000_000_000d);
		Employee employee4 = new Employee(4, "Nguyen Van D", 35_000_000_000d);
		Employee employee5 = new Employee(5, "Nguyen Van E", 45000000000d);
		Employee employee6 = new Employee(6, "Nguyen Van F", 55000000000d);
		Employee employee7 = new Employee(7, "Nguyen Van G", 65000000000d);
		Employee employee8 = new Employee(8, "Nguyen Van H", 75000000000d);
		// 3 Dua vao set

		objSetEmp.add(employee1);
		objSetEmp.add(employee2);
		objSetEmp.add(employee3);
		objSetEmp.add(employee4);
		objSetEmp.add(employee5);
		objSetEmp.add(employee6);
		objSetEmp.add(employee7);
		objSetEmp.add(employee8);
		objSetEmp.add(employee8);

		// 4. In ra
		for (Employee employee : objSetEmp) {
			System.out.println(employee);

		}

	}
}
