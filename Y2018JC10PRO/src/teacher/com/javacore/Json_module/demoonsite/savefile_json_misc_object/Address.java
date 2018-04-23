package com.teacher.Json_module.demoonsite.savefile_json_misc_object;

public class Address {
	// POJO => Lop java thuan tuy.
	private int addressID;
	private String numID;
	private String sFullAddress;

	public Address() {

	}

	public Address(int addressID, String numID, String sFullAddress) {

		this.addressID = addressID;
		this.numID = numID;
		this.sFullAddress = sFullAddress;
	}

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public String getNumID() {
		return numID;
	}

	public void setNumID(String numID) {
		this.numID = numID;
	}

	public String getsFullAddress() {
		return sFullAddress;
	}

	public void setsFullAddress(String sFullAddress) {
		this.sFullAddress = sFullAddress;
	}

	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", numID=" + numID + ", sFullAddress=" + sFullAddress + "]";
	}

}
