package vudiemquynh.practice.oop.bank;

import java.util.Arrays;

public class Branch {
	private String nameBranch;
	private Customer[] arrCustomer = null;
	private int cusCount = 0;

	public Branch() {

	}

	public Branch(String nameBranch) {
		this.nameBranch = nameBranch;
		this.arrCustomer = new Customer[5];

	}

	public String getNameBranch() {
		return nameBranch;
	}

	public void setNameBranch(String nameBranch) {
		this.nameBranch = nameBranch;
	}

	public Customer[] getArrCustomer() {
		Customer[] arrTemp = new Customer[cusCount];
		arrTemp = Arrays.copyOfRange(arrCustomer, 0, cusCount);
		return arrTemp;

	}

	// Add 1 khách hàng chưa có tên ở NH
	public void addCustomer(String name, double amount) {
		if (findCustomer(name) == -1) {
			this.arrCustomer[cusCount] = new Customer(name, amount);
			this.cusCount++;
		} else {
			System.out.println("KH này đã tồn tại, vui lòng thêm chọn menu 3 để thêm thông tin giao dịch");
		}
	}

	public void addTransaction(String name, double amount) {
		if (this.findCustomer(name) != -1) {
			this.arrCustomer[this.findCustomer(name)].addAmountInArray(amount);
			System.out.println("Add transaction for customer " + name + " successfully");
		} else {
			System.out.println("Chưa có thông tin KH này, vui lòng chọn menu 2 để thêm mới khách hàng");
		}

	}

	// Check xem đã có customer nào trong ds chưa. Chưa có customer nào thì ko thể
	// so sánh sẽ văng lỗi
	public boolean checkEmptyCustomer() {
		if (this.cusCount > 0) {
			return false;
		}
		return true;
	}

	// Lấy vị trí của Customer
	public int findCustomer(String name) {
		for (int i = 0; i < cusCount; i++) {
			if (name.equals(arrCustomer[i].getsFullName())) {
				return i;
			}
		}

		return -1;
	}

	@Override
	public String toString() {
		return "Branch [nameBranch=" + nameBranch + ", arrCustomer=" + Arrays.toString(this.getArrCustomer());
	}

}
