package teacher.com.javacore.XML_module.XML_demo_class.write_file_XML;

import java.util.List;

public class CustomerMetaData {
	private List<Customer> arrCustomer; // Chứa danh sách các KH
	private String strPath; // Chứa đường dẫn để lưu một mảng các KH arrCustomer xuống XML

	public CustomerMetaData() {
		// TODO Auto-generated constructor stub
	}

	public CustomerMetaData(List<Customer> arrCustomer, String strPath) {
		super();
		this.arrCustomer = arrCustomer;
		this.strPath = strPath;
	}

	public List<Customer> getArrCustomer() {
		return arrCustomer;
	}

	public void setArrCustomer(List<Customer> arrCustomer) {
		this.arrCustomer = arrCustomer;
	}

	public String getStrPath() {
		return strPath;
	}

	public void setStrPath(String strPath) {
		this.strPath = strPath;
	}

}
