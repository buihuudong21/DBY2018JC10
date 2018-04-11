package teacher.com.javacore.baitaptonghop;

public class GetAllCustomerImpl implements IGetAllCustomerFromDB {
	private Database database; // has-a

	public GetAllCustomerImpl() {
		database = new Database();
	}

	@Override
	public Customer[] getAllCustomer() {

		return this.database.getArrCustomer();
	}

}
