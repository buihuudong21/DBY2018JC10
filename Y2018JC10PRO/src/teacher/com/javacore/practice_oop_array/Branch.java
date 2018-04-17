package teacher.com.javacore.practice_oop_array;

public class Branch {
	private static final int INITIAL_CAPICITY = 20;
	private String nameBranch;
	private Customer[] arrCustomer = new Customer[INITIAL_CAPICITY];
	private int size = 0;

	public Branch(String name) {
		this.nameBranch = name;
	}

	public String getNameBranch() {
		return nameBranch;
	}

	public Customer[] getArrCustomer() {
		return arrCustomer;
	}

	public int getSize() {
		return this.size;
	}

	// Lam the nao de add mot customer vao mang cua branch
	public boolean addCustomer(String name, double amount) {
		// Kiem tra xem name da co trong mang arrCustomer chua?
		if (findCustomer(name) == null) {
			// Dua doi tuong khach hang vao mang
			this.arrCustomer[size++] = new Customer(name, amount);
			return true;
		} else {
			addCustomerDeposit(name, amount);
		}

		return false;
	}

	// 2. Them mot lan gui ma KH da co ten
	private boolean addCustomerDeposit(String name, double amount) {
		// Ta kiem tra xem name da co chua? neu co thi add amount vao
		Customer cust = findCustomer(name);
		if (cust != null) {
			// dua so tien vao mang
			cust.addAmountInArray(amount);
			return true;
		}
		return false;

	}

	// 3. Dinh nghia mot ham kiem tra xem ten da co trong mang chua
	private Customer findCustomer(String name) {
		for (int i = 0; i < this.getSize(); i++) {
			if (arrCustomer[i].getName().equals(name)) {
				return arrCustomer[i];
			}
		}
		return null;
	}

	// Hàm tự động thay đổi size của mảng depositAmounted
	private void ensureCapcity() {
		if (this.size >= this.arrCustomer.length) {
			// Thực hiện tăng mảng lên
			Customer[] newData = new Customer[this.size * 2];
			System.arraycopy(this.arrCustomer, 0, newData, 0, this.arrCustomer.length);
			this.arrCustomer = newData;
		}
	}

}
