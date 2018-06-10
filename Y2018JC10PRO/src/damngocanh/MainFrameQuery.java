package com.damngocanh.customers.model;

import java.util.List;

public class MainFrameQuery {
	private Database database = DatabaseHandler.INSTANCE.getInstance();

	public List<Customer> getCustomer() {
		return this.database.getCustomers();

	}

}
