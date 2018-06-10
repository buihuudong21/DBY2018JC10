package com.damngocanh.customers.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
//1 dinh nghia cac nut
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.omg.CORBA.CurrentHolder;

import com.damngocanh.constant.utils.NumberConstant;
import com.damngocanh.constant.utils.StringConstant;
import com.damngocanh.customer.callbacks.IAddCustomerCallBack;
import com.damngocanh.customer.controller.IAddCustomerFormController;
import com.damngocanh.customer.controllerimpl.AddCustomerFormControllerImlp;
import com.damngocanh.customers.model.Customer;
public class AddCustomerForm extends JDialog implements ActionListener {
private JButton saveButton;
private JButton resetButton;
private JButton closeButton;


//2. dinh nghia cac lable vaf textfield
private JLabel custidLable, custnamelable, addressLable, licenseLable, phoneLable;

private JTextField custidField,custnameField, addressField, licenseField, phoneField;

private IAddCustomerFormController addCustomerFormController;
private IAddCustomerCallBack addCustomerCallBack = null;
//3 dinh nghia ham tao
public AddCustomerForm(JFrame parentFrame) {
	super(parentFrame, StringConstant.CUSTOMER_FORM_TITLE, false);
    initalizeVariable();
    constructLayout();
    setWindow(parentFrame);
    
    

}

private void constructLayout() {
	JPanel customerInfoPanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	
	Border spaceBorder = BorderFactory.createEmptyBorder(15, 15, 15, 15);
	Border titleBorder = BorderFactory.createTitledBorder(StringConstant.CUSTOMER_FORM_SUBTITLTE);
	
	customerInfoPanel.setBorder(BorderFactory.createCompoundBorder(spaceBorder, titleBorder ));
	customerInfoPanel.setLayout(new GridBagLayout());
	
	GridBagConstraints gc = new GridBagConstraints();
	gc.gridy = 0;
	Insets rightPadding = new Insets(0,0,0,15);
	Insets noPadding = new Insets(0, 0, 0, 0);
	
	//=============== The First Row============
	gc.weightx = 1;
	gc.weighty =1;
	gc.fill =GridBagConstraints.NONE;
	
	
	gc.gridx = 0;
	gc.anchor = GridBagConstraints.EAST;
	gc.insets = rightPadding;
	customerInfoPanel.add(custidLable, gc);
	
	gc.gridx++;
	gc.anchor = GridBagConstraints.WEST;
	gc.insets = noPadding;
	customerInfoPanel.add(custidField, gc);
	// =======================next row=======================
	gc.gridy++;
	
	gc.weightx = 1;
	gc.weighty =1;
	gc.fill =GridBagConstraints.NONE;
	
	
	gc.gridx = 0;
	gc.anchor = GridBagConstraints.EAST;
	gc.insets = rightPadding;
	customerInfoPanel.add(custnamelable, gc);
	
	gc.gridx++;
	gc.anchor = GridBagConstraints.WEST;
	gc.insets = noPadding;
	customerInfoPanel.add(custnameField, gc);
	
	// ============dong thu 3 =================
	
gc.gridy++;
	
	gc.weightx = 1;
	gc.weighty =1;
	gc.fill =GridBagConstraints.NONE;
	
	
	gc.gridx = 0;
	gc.anchor = GridBagConstraints.EAST;
	gc.insets = rightPadding;
	customerInfoPanel.add(addressLable, gc);
	
	gc.gridx++;
	gc.anchor = GridBagConstraints.WEST;
	gc.insets = noPadding;
	customerInfoPanel.add(addressField, gc);
	//===================dong thu 4==================
    gc.gridy++;
	
	gc.weightx = 1;
	gc.weighty =1;
	gc.fill =GridBagConstraints.NONE;
	
	
	gc.gridx = 0;
	gc.anchor = GridBagConstraints.EAST;
	gc.insets = rightPadding;
	customerInfoPanel.add(licenseLable, gc);
	
	gc.gridx++;
	gc.anchor = GridBagConstraints.WEST;
	gc.insets = noPadding;
	customerInfoPanel.add(licenseField, gc);
	
	//===================dong thu 5==================
    gc.gridy++;
	
	gc.weightx = 1;
	gc.weighty =1;
	gc.fill =GridBagConstraints.NONE;
	
	
	gc.gridx = 0;
	gc.anchor = GridBagConstraints.EAST;
	gc.insets = rightPadding;
	customerInfoPanel.add(phoneLable, gc);
	
	gc.gridx++;
	gc.anchor = GridBagConstraints.WEST;
	gc.insets = noPadding;
	customerInfoPanel.add(phoneField, gc);
	
	
	// xu ly JPanel cua cac nut
	buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
	buttonPanel.add(saveButton);
	buttonPanel.add(resetButton);
	buttonPanel.add(closeButton);
	
	// tu dong thay doi do dai cua nut
	Dimension btnsize = closeButton.getPreferredSize();
	saveButton.setPreferredSize(btnsize);
	resetButton.setPreferredSize(btnsize);
	
	// dua 2 JPanel vao Form
	this.setLayout(new BorderLayout());
	this.add(customerInfoPanel, BorderLayout.CENTER);
	this.add(buttonPanel, BorderLayout.SOUTH);
	
}

private void setWindow(JFrame parentFrame) {
	setSize(NumberConstant.CUSTOMER_FORM_WINDOW_WIDTH, NumberConstant.CUSTOMER_FORM_WINDOW_HEIGTH);
	setLocationRelativeTo(parentFrame);
}

private void initalizeVariable() {
	this.saveButton = new JButton(StringConstant.CUSTOMER_FORM_SAVE);
	this.closeButton =new JButton(StringConstant.CUSTOMER_FORM_CLOSE);
	this.resetButton =new JButton(StringConstant.CUSTOMER_FORM_RESET);

	//2 khoi tao cac lable va text
	this.custidLable = new JLabel(StringConstant.CUSTOMER_FORM_CUSTID);
	this.custidField = new JTextField(NumberConstant.CUSTOMER_FORM_FIELD_CUSTID_LENGTH);

	
	this.custnamelable = new JLabel(StringConstant.CUSTOMER_FORM_CUSTNAME);
	this.custnameField = new JTextField(NumberConstant.CUSTOMER_FORM_FIELD_CUSTNAME_LENGTH);
	
	this.addressLable = new JLabel(StringConstant.CUSTOMER_FORM_ADDRESS);
	this.addressField = new JTextField(NumberConstant.CUSTOMER_FORM_FIELD_ADDRESS_LENGTH);
	
	this.licenseLable = new JLabel(StringConstant.CUSTOMER_FORM_LICENSE);
	this.licenseField = new JTextField(NumberConstant.CUSTOMER_FORM_FIELD_LICENSE_LENGTH);
	
	
	
	
	this.phoneLable = new JLabel(StringConstant.CUSTOMER_FORM_PHONE);
	this.phoneField = new JTextField(NumberConstant.CUSTOMER_FORM_FIELD_PHONE_LENGTH);

	
	this.addCustomerFormController = new AddCustomerFormControllerImlp();
	closeButton.addActionListener(this);
	resetButton.addActionListener(this);
	saveButton.addActionListener(this);
	
	
}

public void actionPerformed(ActionEvent e) {
	if(e.getSource() == this.closeButton) {
		this.setVisible(false);
	} else if(e.getSource() == resetButton) {
		this.custidField.setText(null);
		this.custnameField.setText(null);
		this.addressField.setText(null);
		this.licenseField.setText(null);
		this.phoneField.setText(null);
		this.custidField.setFocusable(true);
	}else if(e.getSource() == saveButton) {
		//1. lay du lieu tren form add new => cac bien
		String strCustid = this.custidField.getText();
		String strCustname = this.custnameField.getText();
		String strAdress = this.addressField.getText();
		String strLicense = this.licenseField.getText();
		String strPhone = this.phoneField.getText();
		
		//2 dua vao doi tuong
		Customer customer = new Customer(strCustid, strCustname,  strAdress, strLicense,strPhone );
	this.addCustomerFormController.InsertCustomer(customer);
	this.addCustomerCallBack.customerSaved();
	this.setVisible(false);
	
	}
}
public void setCallBack(IAddCustomerCallBack addCustomerCallBack) {
	this.addCustomerCallBack = addCustomerCallBack;
}





}
