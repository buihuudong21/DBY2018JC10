package com.damngocanh.customer.controllerimpl;

import com.damngocanh.customer.controller.IAddCustomerFormController;
import com.damngocanh.customers.model.AddCustomerQuery;
import com.damngocanh.customers.model.Customer;

public class AddCustomerFormControllerImlp implements IAddCustomerFormController {
	private AddCustomerQuery addCustomerQuery;

	public AddCustomerFormControllerImlp() {
		this.addCustomerQuery = new AddCustomerQuery(); // khoi tao model

	}

	public void InsertCustomer(Customer customer) {
		this.addCustomerQuery.insertCustomer(customer);

	}

}
