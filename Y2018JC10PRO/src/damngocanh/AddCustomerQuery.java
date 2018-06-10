package com.damngocanh.customers.model;

public class AddCustomerQuery {
	private Database database = DatabaseHandler.INSTANCE.getInstance();

	public void insertCustomer(Customer customer) {
		this.database.addCustomer(customer);
	}

}
