package buihuudong.customer_manager;

public class Database {
	private Customer[] customers = new Customer[5];

	public Database() {
		this.customers[0] = new Customer(1, "Võ Thống", "Hoàn Kiếm, Hà Nội", "02574747", "0903823646", 100_000_000);
		this.customers[1] = new Customer(2, "Trần Thuỳ Trang", "Quận 7, TPHCM", "0257974748", "090805647", 400_000_000);
		this.customers[2] = new Customer(3, "Dương Cao Tùng", "Quận 1, TPHCM", "02574749", "0903836248", 500_000_000);
		this.customers[3] = new Customer(4, "Vũ Diễm Quỳnh", "Quận 1, TPHCM", "02574712", "09038236220", 600_000_000);
		this.customers[4] = new Customer(5, "Trần Văn Cao", "Sa Đéc, Đồng Tháp", "02374747", "0938283632", 700_000_000);
	}

	public Customer[] getCustomers() {
		return customers;
	}

}
