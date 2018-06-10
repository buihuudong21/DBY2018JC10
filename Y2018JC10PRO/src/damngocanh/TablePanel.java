package com.damngocanh.customers.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

import com.damngocanh.customers.model.Customer;

public class TablePanel extends JPanel {
     private JTable customersTable;
     private TableModel tableModel;
      public TablePanel() {
		
	     intitalizeVariable();
	     initalizeLayout();
	     initalizeHeaderAlignment();
	     intitallzeTableAlignment();
	     
	     
	
}
	private void intitallzeTableAlignment() {
		DefaultTableCellRenderer tableCellRenderer = new DefaultTableCellRenderer();
		tableCellRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		// cawn tung cot mot tuong ung 
		this.customersTable.getColumnModel().getColumn(0).setCellRenderer(tableCellRenderer);
		this.customersTable.getColumnModel().getColumn(1).setCellRenderer(tableCellRenderer);
		this.customersTable.getColumnModel().getColumn(2).setCellRenderer(tableCellRenderer);
		this.customersTable.getColumnModel().getColumn(3).setCellRenderer(tableCellRenderer);
		this.customersTable.getColumnModel().getColumn(4).setCellRenderer(tableCellRenderer);
		this.customersTable.getColumnModel().getColumn(5).setCellRenderer(tableCellRenderer);
		
	}
	private void initalizeHeaderAlignment() {
		DefaultTableCellRenderer headerCellRenderer = new DefaultTableCellRenderer();
		headerCellRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		headerCellRenderer.setBackground(Color.GRAY);
		
		this.customersTable.getTableHeader().setDefaultRenderer(headerCellRenderer);
		
	}
	private void intitalizeVariable() {
		this.tableModel = new TableModel();
	
	    this.customersTable = new JTable(tableModel);
	}
	private void initalizeLayout() {
		this.setLayout(new BorderLayout());
		this.setBorder(new EmptyBorder(10, 30, 10, 30));
		this.add(new JScrollPane(customersTable), BorderLayout.CENTER);
		
	}
	public void updateTable() {
		this.tableModel.updateTable();
		
	}
	public void setTableModel(List<Customer> customersList) {
		this.tableModel.setCustomersList(customersList);
	}
}
