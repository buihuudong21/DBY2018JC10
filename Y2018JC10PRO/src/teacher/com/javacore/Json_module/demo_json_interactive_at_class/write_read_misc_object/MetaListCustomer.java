package teacher.com.javacore.Json_module.demo_json_interactive_at_class.write_read_misc_object;

import java.util.ArrayList;

import teacher.com.javacore.Json_module.demo_json_interactive_at_class.write_object_to_json.Customer;

public class MetaListCustomer {
	private int returnCode;
	private String errorMessage;
	private int totalRecord;
	private ArrayList<Customer> data;

	// Sinh ra cac phuong thuc get & set
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

	public ArrayList<Customer> getData() {
		return data;
	}

	public void setData(ArrayList<Customer> data) {
		this.data = data;
	}

}
