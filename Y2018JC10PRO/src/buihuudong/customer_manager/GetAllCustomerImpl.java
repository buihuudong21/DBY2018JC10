package buihuudong.customer_manager;

public class GetAllCustomerImpl implements IGetAllCustomer {
	private MainQueryDatabase mainQueryDatabase;

	public GetAllCustomerImpl() {
		mainQueryDatabase = new MainQueryDatabase();
	}

	@Override
	public Customer[] getAllCustomer() {

		return this.mainQueryDatabase.getAllCustomer();
	}

}
