package com.teacher.Json_module.demoonsite.savefile_json_misc_object;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMetaData {

	private int returnCode;
	private String errorMessage;
	private int totalRecord;
	private List<Employee> data;

	public EmployeeMetaData() {
		data = new ArrayList<Employee>();
	}

	public EmployeeMetaData(int returnCode, String errorMessage, int totalRecord, List<Employee> data) {

		this.returnCode = returnCode;
		this.errorMessage = errorMessage;
		this.totalRecord = totalRecord;
		this.data = data;
	}

	public int getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public List<Employee> getData() {
		return data;
	}

	public void setData(List<Employee> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "EmployeeMetaData [returnCode=" + returnCode + ", errorMessage=" + errorMessage + ", totalRecord="
				+ totalRecord + ", data=" + data + "]";
	}

}
