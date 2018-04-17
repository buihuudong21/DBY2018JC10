package teacher.com.javacore.practice_oop_array;

public class Bank {
	private static final int INITIAL_CAPACITY = 20;
	private String name;
	private Branch[] arrBranch;
	private int size = 0; // Số lượng chi nhánh mà NH có được.

	public Bank() {

	}

	public Bank(String name) {
		this.name = name;
		arrBranch = new Branch[INITIAL_CAPACITY];
	}

	// Hàm thêm một branch vào Ngân hàng
	public boolean addBranch(String name) {
		if (findBranch(name) == null) {
			this.arrBranch[size++] = new Branch(name);
			return true;
		}
		return false;
	}

	// Hàm add khách hàng vào một CN
	public boolean addCustomer(String nameBranch, String nameCustomer, double amount) {
		Branch branch = findBranch(nameBranch);
		if (branch != null) {
			branch.addCustomer(nameCustomer, amount);
			return true;
		}
		return false;
	}

	// Hàm check xem có tồn tại CN chưa
	private Branch findBranch(String name) {
		for (int i = 0; i < this.size; i++) {
			if (this.arrBranch[i].getNameBranch().equals(name)) {
				return arrBranch[i];
			}
		}
		return null;
	}

	// Hàm hiển thị thông tin bank
	public void diplayListCustomerInBranch() {
		for (int i = 0; i < this.size; i++) { // lặp theo từng CN
			System.out.println("Ten CN la: " + arrBranch[i].getNameBranch());
			System.out.println("Chi tiết thông tin khách hàng của chi nhánh " + arrBranch[i].getNameBranch());

			for (int j = 0; j < arrBranch[i].getSize(); j++) { // Lặp theo từng Khách hàng
				System.out.println((j + 1) + " la: " + arrBranch[i].getArrCustomer()[j].getName());
				for (int k = 0; k < arrBranch[i].getArrCustomer()[j].getSize(); k++) { // lặp để lấy số tiền trong mảng
					System.out.println("	Số tiền gửi lần " + (k + 1) + " là: "
							+ arrBranch[i].getArrCustomer()[j].getDepositAmounted()[k]);
				}
			}

		}

	}

}
