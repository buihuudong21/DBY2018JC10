package com.teacher.arrays.dynamic_array.samples.baitoan03;

public class Employment {
	private int custId;
	private String name;
	private String address;
	private double salary;

	public Employment() {

	}

	public Employment(int custId, String name, String address, double salary) {

		this.custId = custId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
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
		return "Employment [custId=" + custId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

}
