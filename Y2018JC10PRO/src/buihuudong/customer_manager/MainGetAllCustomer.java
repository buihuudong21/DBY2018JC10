package buihuudong.customer_manager;

public class MainGetAllCustomer {
	private IGetAllCustomer iGetAllCustomer;
	private Customer[] customers;

	public MainGetAllCustomer() {
		intitalizesVariable();
		this.customers = iGetAllCustomer.getAllCustomer();
	}

	private void intitalizesVariable() {
		this.iGetAllCustomer = new GetAllCustomerImpl();
	}

	public Customer[] getCustomers() {
		return customers;
	}

}
