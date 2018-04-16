package buihuudong.bank_array_static;

public class MainApp {

	public static void main(String[] args) {
		// // 1. Goi ham class customer
		// Customer customer1 = new Customer("Nguyen", 500000);
		// customer1.addAmountInArray(600000);
		// customer1.addAmountInArray(700000);
		// customer1.addAmountInArray(800000);
		// customer1.addAmountInArray(900000);
		// customer1.addAmountInArray(1000000);
		// customer1.addAmountInArray(1000000);
		// customer1.addAmountInArray(1000000);
		// customer1.addAmountInArray(1000000);
		//
		// for (int i = 0; i < customer1.getDepositAmounted().length; i++) {
		// System.out.println(customer1.getDepositAmounted()[i]);
		// }
		//
		// System.exit(0);

		// //
		// Customer customer2 = new Customer("Dong", 500000);
		// customer2.addAmountInArray(4500000);
		// customer2.addAmountInArray(200000d);
		// customer2.addAmountInArray(23400000d);
		// customer2.addAmountInArray(234700000d);
		// customer2.addAmountInArray(234200000d);

		// Khoi tao ten 1 CN va dua 2 KH customer1 va 2 vao CN
		Branch branch = new Branch("Ngan Hang ACB - CN Phan Ton");
		// Dua khach hang vao mang

		branch.newCustomer("Dong", 500000);
		branch.newCustomer("Thuan", 700000);

		// In ra ten CN va cac kh cua CN do

		System.out.println("Ten CN la: " + branch.getNameBranch());
		System.out.println("Cac khach hang la:");
		for (int i = 0; i < branch.getArrCustomer().length; i++) {
			System.out.println((i + 1) + " la: " + branch.getArrCustomer()[i].getName());
		}

	}

}
