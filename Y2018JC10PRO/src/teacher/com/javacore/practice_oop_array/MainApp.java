package teacher.com.javacore.practice_oop_array;

public class MainApp {

	public static void main(String[] args) {
		// // 1. Goi ham class customer
		// Customer customer1 = new Customer("Nguyen", 500000);
		// customer1.addAmountInArray(600000);
		// customer1.addAmountInArray(700000);
		// customer1.addAmountInArray(800000);
		// customer1.addAmountInArray(900000);
		// customer1.addAmountInArray(1000000);
		//
		// customer1.addAmountInArray(600000);
		// customer1.addAmountInArray(700000);
		// customer1.addAmountInArray(800000);
		// customer1.addAmountInArray(900000);
		// customer1.addAmountInArray(1000000);
		// customer1.addAmountInArray(600000);
		// customer1.addAmountInArray(700000);
		// customer1.addAmountInArray(800000);
		// customer1.addAmountInArray(900000);
		// customer1.addAmountInArray(1000000);
		//
		// customer1.addAmountInArray(600000);
		// customer1.addAmountInArray(700000);
		// customer1.addAmountInArray(800000);
		// customer1.addAmountInArray(900000);
		// customer1.addAmountInArray(1000000);
		//
		// System.out.println("Số lần nộp tiền của KH " + customer1.getName() + " là: "
		// + customer1.getSize());
		// for (int i = 0; i < customer1.getSize(); i++) {
		// System.out.println(customer1.getDepositAmounted()[i]);
		// }
		// System.exit(0);

		// //
		// Customer customer2 = new Customer("Dong", 500000);
		// customer2.addAmountInArray(4500000);
		// customer2.addAmountInArray(200000d);
		// customer2.addAmountInArray(23400000d);
		// customer2.addAmountInArray(234700000d);
		// customer2.addAmountInArray(234200000d);

		/*
		 * // Khoi tao ten 1 CN va dua 2 KH customer1 va 2 vao CN Branch branch = new
		 * Branch("Ngan Hang ACB - CN Phan Ton"); // Dua khach hang vao mang
		 * branch.addCustomer("Đông", 500000); branch.addCustomer("Đông", 600000);
		 * branch.addCustomer("Dong", 700000); branch.addCustomer("Dong", 800000);
		 * branch.addCustomer("Quynh", 600000); branch.addCustomer("Vinh", 600000);
		 * 
		 * // In ra ten CN va cac kh cua CN do System.out.println("Ten CN la: " +
		 * branch.getNameBranch()); System.out.println("Cac khach hang la:"); for (int i
		 * = 0; i < branch.getSize(); i++) { System.out.println((i + 1) + " la: " +
		 * branch.getArrCustomer()[i].getName()); for (int j = 0; j <
		 * branch.getArrCustomer()[i].getSize(); j++) { System.out.println(
		 * "Số tiền gửi lần " + (j + 1) + " là: " +
		 * branch.getArrCustomer()[i].getDepositAmounted()[j]); } }
		 */

		// put and list all together
		// 1. Tạo ra 1 Ngân hàng
		Bank bank = new Bank("Ngân hàng Sacombank");
		// 2. Tạo Các CN cho Ngân hàng
		if (bank.addBranch("Chi nhánh Nguyễn Đình Chiểu")) {
			System.out.println("Chi nhánh Nguyễn Đình Chiểu vừa được tạo");
		}
		// 3. Thêm khách hàng và số tiền giao dịch cho CN Nguyễn Đình Chiểu
		bank.addCustomer("Chi nhánh Nguyễn Đình Chiểu", "Đông", 2000000);
		bank.addCustomer("Chi nhánh Nguyễn Đình Chiểu", "Trang", 3000000);
		bank.addCustomer("Chi nhánh Nguyễn Đình Chiểu", "Thống", 4000000);
		bank.addCustomer("Chi nhánh Nguyễn Đình Chiểu", "Tùng", 5000000);

		// 5. Tạo thêm một CN thứ 2 của Sacombank
		if (bank.addBranch("Chi nhánh An Giang")) {
			System.out.println("Chi nhánh An Giang vừa được tạo");
		}
		// 6. Thêm khách hàng và số tiền giao dịch cho CN Nguyễn Đình Chiểu
		bank.addCustomer("Chi nhánh An Giang", "Sơn", 2000000);
		bank.addCustomer("Chi nhánh An Giang", "Quỳnh", 3000000);
		bank.addCustomer("Chi nhánh An Giang", "Quỳnh", 4000000);
		bank.addCustomer("Chi nhánh An Giang", "Ánh", 5000000);
		bank.addCustomer("Chi nhánh An Giang", "Ánh", 6000000);

		// hiển thị toàn bộ

		bank.diplayListCustomerInBranch();

	}

}
