package com.damngocanh.customer.controllerimpl;

import java.util.List;

import com.damngocanh.customer.controller.IMainFrameController;
import com.damngocanh.customers.model.Customer;
import com.damngocanh.customers.model.MainFrameQuery;

public class MainFrameControllerImpl implements IMainFrameController {
	private MainFrameQuery mainFrameQuery;

	public MainFrameControllerImpl() {
		this.mainFrameQuery = new MainFrameQuery();
	}

	public List<Customer> getAllCustomers() {

		return mainFrameQuery.getCustomer();
	}

}
