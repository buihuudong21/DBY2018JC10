package com.teacher.oops.inheritance;

public class Worker extends Person {
	private String sNameOfCompany;
	private double salary;

	public Worker() {

	}

	public Worker(String sName, int age, double height, double weight, String address, String sNameOfCompany,
			double salary) {

		super(sName, age, height, weight, address);

		this.sNameOfCompany = sNameOfCompany;
		this.salary = salary;
	}

	public String getsNameOfCompany() {
		return sNameOfCompany;
	}

	public void setsNameOfCompany(String sNameOfCompany) {
		this.sNameOfCompany = sNameOfCompany;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override // anotation
	public String toString() {
		return String.format("Ho va Ten: %s - Age: %s - Noi lam viec: %s", this.getsName(), this.age,
				this.sNameOfCompany);
	}

}
