package com.teacher.collection_framework_excercise.collection_sample01;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;

	public Employee() {

	}

	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// int iResult = 0;
		// if (this.salary > o.salary) { // ASC
		// iResult = 1;
		// } else {
		// iResult = -1;
		// }
		//
		// return iResult;
		return (int) (this.salary - o.salary);
	}

}
