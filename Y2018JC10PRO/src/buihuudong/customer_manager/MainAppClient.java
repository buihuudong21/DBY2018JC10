package buihuudong.customer_manager;

public class MainAppClient {

	public static void main(String[] args) {
		// 1. Nhận danh sách khách hàng từ DB
		MainGetAllCustomer mainGetAllCustomer = new MainGetAllCustomer();
		Customer[] customers = mainGetAllCustomer.getCustomers();
		// 2. Hiển thị thông tin khách hàng
		displayInforCustomer(customers);

	}

	public static void displayInforCustomer(Customer[] arrCustomer) {
		for (Customer customer : arrCustomer) {
			System.out.println(customer.toString());
		}
	}

}
