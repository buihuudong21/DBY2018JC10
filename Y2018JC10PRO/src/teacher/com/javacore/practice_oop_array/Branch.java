package teacher.com.javacore.practice_oop_array;

public class Branch {
	private String nameBranch;
	private Customer[] arrCustomer;
	private int vCount = 0;

	public Branch() {

	}

	public Branch(String name) {
		this.nameBranch = name;
		this.arrCustomer = new Customer[100];

	}

	public String getNameBranch() {
		return nameBranch;
	}

	public Customer[] getArrCustomer() {
		return arrCustomer;
	}

	// Lam the nao de add mot customer vao mang cua branch
	// 1. Them moi mot KH = chua co ten trong mang bao gio
	public boolean newCustomer(String name, double amount) {
		// Kiem tra xem name da co trong mang arrCustomer chua?
		if (findCustomer(name) == null) {
			// Dua doi tuong khach hang vao mang
			this.arrCustomer[vCount++] = new Customer(name, amount);
			return true;
		}

		return false;
	}
	// 2. Them mot lan gui ma KH da co ten

	public boolean addCustomerDeposit(String name, double amount) {
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
	public Customer findCustomer(String name) {
		for (int i = 0; i < this.arrCustomer.length; i++) {
			if (arrCustomer[i].getName() != null) {
				if (arrCustomer[i].getName().equals(name)) {
					return arrCustomer[i];
				}
			}

		}
		return null;
	}

}
