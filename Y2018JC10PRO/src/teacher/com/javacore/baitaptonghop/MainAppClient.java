package teacher.com.javacore.baitaptonghop;

public class MainAppClient {
	// Sử dụng tính đa hình để khởi tạo inteface thông qua lớp dẫn suất/subclass

	public static void main(String[] args) {
		IGetAllCustomerFromDB arrCustomer = new GetAllCustomerImpl();
		Customer[] lstCustomer = arrCustomer.getAllCustomer();
		displayInfor(lstCustomer);
	}

	public static void displayInfor(Customer[] arrCustomer) {
		for (Customer customer : arrCustomer) {
			System.out.println(customer.getsFullName());
		}
	}

}
