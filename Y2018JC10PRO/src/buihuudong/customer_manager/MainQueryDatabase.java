package buihuudong.customer_manager;

public class MainQueryDatabase {
	private Database database;

	public MainQueryDatabase() {
		database = new Database();
	}

	public Customer[] getAllCustomer() {
		return this.database.getCustomers();
	}

}
