package com.damngocanh.customers.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.damngocanh.constant.utils.StringConstant;
import com.damngocanh.customer.callbacks.IAddCustomerCallBack;
import com.damngocanh.customer.controller.IAddCustomerFormController;

public class CreateMenuBar extends JMenuBar implements ActionListener, IAddCustomerCallBack {
	private JMenu fileMenu = null;
	private JMenuItem openItem = null;
	private JMenuItem exitItem = null;
	
	//==============================
	private JMenu customer = null;
	private JMenuItem addItem = null;
	private JMenuItem removeItem = null;
	//==============================
	private JMenu view = null;
	private JMenu help = null;
	
	// khai bao them doi tuong addForm
	private AddCustomerForm addCustomerForm = null;
	private MainFrame mainFrame = null;
	
	
	
	public CreateMenuBar(MainFrame parentFrame) {
		fileMenu = new JMenu(StringConstant.MAIN_MENU_FILE);
		openItem = new JMenuItem(StringConstant.MAIN_MENU_OPEN);
		exitItem = new JMenuItem(StringConstant.MAIN_MENU_EXIT);
		
		fileMenu.add(openItem);
		fileMenu.add(exitItem);
		//====================Xu ly cho jmenu customer
		customer = new JMenu(StringConstant.MAIN_MENU_CUSTOMER);
		addItem = new JMenuItem(StringConstant.MAIN_MENU_ADD_CUSTOMER);
		removeItem = new JMenuItem(StringConstant.MAIN_MENU_REMOVE_CUSTOMER);
		customer.add(addItem);
		customer.add(removeItem);
		//======================
		view = new JMenu(StringConstant.MAIN_MENU_VIEW);
		help = new JMenu(StringConstant.MAIN_MENU_HELP);
		
		
		this.add(fileMenu);
		this.add(customer);
		this.add(view);
		this.add(help);
		//============ Xu ly action event
		exitItem.addActionListener(this);
		openItem.addActionListener(this);
		addItem.addActionListener(this);
		
		// khoi tao doi tuowng addform
		addCustomerForm = new AddCustomerForm(parentFrame);
		this.mainFrame = parentFrame; // muc dich truyen tham chieu toi doi tuong mainframe de su dung ham refresttable
		setCallback();
		
		
		
	}



	private void setCallback() {
		this.addCustomerForm.setCallBack(this);
		
	}



	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exitItem) {
			int action = JOptionPane.showConfirmDialog(getParent(), StringConstant.MAIN_MENU_EXIT_TEXT, 
					StringConstant.MAIN_MENU_EXIT_TETLE, JOptionPane.OK_CANCEL_OPTION);
			if(action == JOptionPane.OK_OPTION) {
				System.gc();// thoat form confirm
				System.exit(0);// thoat ung dung
			}
		}else if(e.getSource() == addItem) {
			addCustomerForm.setVisible(true);
			
			
			
			
		}
		
	}



	public void customerSaved() {
		this.mainFrame.refreshTable();
	}

}
