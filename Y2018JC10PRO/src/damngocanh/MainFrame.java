package com.damngocanh.customers.ui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;


import com.damngocanh.constant.utils.NumberConstant;
import com.damngocanh.constant.utils.StringConstant;
import com.damngocanh.customer.controller.IMainFrameController;
import com.damngocanh.customer.controllerimpl.MainFrameControllerImpl;
import com.damngocanh.customers.model.Customer;

public class MainFrame extends JFrame{
	private IMainFrameController mainFrameController;
	private TablePanel tablePanel;
	private StatusPanel statusPanel;
	
	public MainFrame() {
		super(StringConstant.APP_NAME);
		constructAppWindow();
		setJMenuBar(new CreateMenuBar(this));
		
		
		initalizesVariable();
		constructLayout();
		refreshTable();
		
		
		
	}

	void refreshTable() {
		List<Customer> customers = this.mainFrameController.getAllCustomers();
		this.tablePanel.setTableModel(customers);
		this.tablePanel.updateTable();
		
		
	}

	private void initalizesVariable() {
		this.mainFrameController = new MainFrameControllerImpl();
		this.tablePanel = new TablePanel();
		this.statusPanel = new StatusPanel();
		
		
		
		
	}

	private void constructLayout() {
		this.setLayout(new BorderLayout());
		this.add(tablePanel,BorderLayout.CENTER);
		this.add(statusPanel, BorderLayout.SOUTH);
		
		
	}

	private void constructAppWindow() {
		this.setSize(NumberConstant.APP_WINDOW_SIZE_WIDTH, NumberConstant.APP_WINDOW_SIZE_HIEGHT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
