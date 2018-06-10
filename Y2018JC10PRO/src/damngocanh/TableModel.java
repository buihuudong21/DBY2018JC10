package com.damngocanh.customers.ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.damngocanh.constant.utils.NumberConstant;
import com.damngocanh.customers.model.Customer;

public class TableModel extends AbstractTableModel {
	private List<Customer> customersList;
	private String[] colNames = {"ID","CUSTID", "FULLNAME", "ADDRESS", "LICENSE", "PHONE"};
	
	
	public TableModel() {
		customersList = new ArrayList<Customer>();
	}
	
	@Override
	public String getColumnName(int column) {
		
		return this.colNames[column];
	}
	public int getColumnCount() {
		return NumberConstant.NUM_OF_COLUMNS;
		
		
	}

	public int getRowCount() {
		
		return this.customersList.size();
	}

	public Object getValueAt(int rowIndex, int colIndex) {
		Customer customer = this.customersList.get(rowIndex);
		switch (colIndex) {
		case 0:
			return customer.getId();
		case 1:
			return customer.getCustID();
		case 2:
			return customer.getsFullName();
		case 3:
			return customer.getsAddress();
		case 4:
			return customer.getsLicense();
		case 5:
			return customer.getsMobile();
			

		default:
			return null;
		}
		
	}
	public void setCustomersList(List<Customer> customersList) {
		this.customersList = customersList;
	}
	
	public void updateTable() {
		fireTableDataChanged();
	}

}
