package com.teacher.Json_module.demoonsite.savefile_json_misc_object;

public class Employee {
	private int id;
	private String sFullName;
	private Address address; // HAS - A (ADT - Abstract Data Type)
	private double salary;

	public Employee() {

	}

	public Employee(int id, String sFullName, Address address, double salary) {

		this.id = id;
		this.sFullName = sFullName;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) { // Dependency Injection (J2EE)

		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", sFullName=" + sFullName + ", address=" + address + ", salary=" + salary + "]";
	}

}
