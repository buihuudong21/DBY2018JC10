package com.damngocanh.customers.model;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private List<Customer> customers = new ArrayList<Customer>();

	public Database() {
		this.customers.add(new Customer(1, "010001", "Nguyễn Văn Bo", "Quận 1", "011324244", "01642115909"));
		this.customers.add(new Customer(1, "010002", "Đàm Thị Ngọc Ánh", "Quận 4", "0113235", "0163258594"));
		this.customers.add(new Customer(1, "010003", "Nguyễn Thị Hoa", "Quận 7", "03243636", "01285514992"));
		this.customers.add(new Customer(1, "010004", "Huỳnh Thị Hà", "Quận 12", "05446454", "01202305261"));
		this.customers.add(new Customer(1, "010005", "Đào Phương Uyên", "Quận 8", "04354364", "0166788911"));
		this.customers.add(new Customer(1, "010006", "Huỳnh Gia Hân", "Quận 3", "046466457", "0169996533"));
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void addCustomer(Customer customer) {
		this.customers.add(customer);
		System.out.println("custttttttt");
	}

	public void removeCustomer(Customer customer) {
		this.customers.remove(customer);
	}
}
