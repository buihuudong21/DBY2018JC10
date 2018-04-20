package com.teacher.collection_framework_excercise.collection_sample01;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeMapDemo {
	public static void main(String[] args) {
		// 1. Khai bao Map
		// Map<Integer, Employee> mapObj = new Hashtable<Integer, Employee>();
		Map<Integer, Employee> mapObj = new LinkedHashMap<>();

		// 2. Dinh nghia object Empl
		Employee employee1 = new Employee(1, "Nguyen Van A", 5000_000_000d);
		Employee employee2 = new Employee(2, "Nguyen Van B", 15_000_000_000d);
		Employee employee3 = new Employee(3, "Nguyen Van C", 25_000_000_000d);
		Employee employee4 = new Employee(4, "Nguyen Van D", 35_000_000_000d);
		Employee employee5 = new Employee(5, "Nguyen Van E", 45000000000d);
		Employee employee6 = new Employee(6, "Nguyen Van F", 55000000000d);
		Employee employee7 = new Employee(7, "Nguyen Van G", 65000000000d);
		Employee employee8 = new Employee(8, "Nguyen Van H", 75000000000d);
		// 3. Add vao
		mapObj.put(1, employee1);
		mapObj.put(2, employee2);
		mapObj.put(3, employee3);
		mapObj.put(4, employee4);
		mapObj.put(5, employee5);
		mapObj.put(6, employee6);
		mapObj.put(7, employee7);
		mapObj.put(8, employee8);

		// 4. In ra ngoai man hinh theo tap key
		for (Integer key : mapObj.keySet()) {
			System.out.println(mapObj.get(key));
		}
		System.out.println("=============================");

		Collection<Employee> arrEmp = mapObj.values();
		// 5. lay ra tap gia tri
		for (Employee employee : arrEmp) {
			System.out.println(employee);

		}

	}
}
