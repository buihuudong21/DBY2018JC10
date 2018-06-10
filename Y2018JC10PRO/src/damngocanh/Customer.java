package com.damngocanh.customers.model;

public class Customer {
	private int id;
	private String custID; // ma kh
	private String sFullName; // ten day du cua kh
	private String sAddress; // dia chi kh
	private String sLicense; // chung minh thu kh
	private String sMobile; // dt kh

	public Customer() {

	}

	public Customer(int id, String custID, String sFullName, String sAddress, String sLicense, String sMobile) {
		this.id = id;
		this.custID = custID;
		this.sFullName = sFullName;
		this.sAddress = sAddress;
		this.sLicense = sLicense;
		this.sMobile = sMobile;
	}

	public Customer(String custID, String sFullName, String sAddress, String sLicense, String sMobile) {

		this.custID = custID;
		this.sFullName = sFullName;
		this.sAddress = sAddress;
		this.sLicense = sLicense;
		this.sMobile = sMobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsLicense() {
		return sLicense;
	}

	public void setsLicense(String sLicense) {
		this.sLicense = sLicense;
	}

	public String getsMobile() {
		return sMobile;
	}

	public void setsMobile(String sMobile) {
		this.sMobile = sMobile;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", sFullName=" + sFullName + ", sAddress=" + sAddress + ", sLicense="
				+ sLicense + ", sMobile=" + sMobile + "]";
	}

}
