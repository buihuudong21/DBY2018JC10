package buihuudong.bank;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("National Australia Bank");

		if (bank.addBranch("Adelaide")) {
			System.out.println("Adelaide branch created");
		}

		bank.addCustomer("Adelaide", "Andrew", 119.19);
		bank.addCustomer("Adelaide", "Lauren", 34.22);
		bank.addCustomer("Adelaide", "Julie", 97.48);

		bank.addBranch("Sydney");
		bank.addCustomer("Sydney", "Bob", 150.54);

		bank.addCustomerTransaction("Adelaide", "Andrew", 44.22);
		bank.addCustomerTransaction("Adelaide", "Andrew", 12.44);
		bank.addCustomerTransaction("Adelaide", "Lauren", 1.65);

		bank.listCustomers("Adelaide", true);
		bank.listCustomers("Sydney", true);

		bank.addBranch("Melbourne");

		if (!bank.addCustomer("Melbourne", "John", 5.53)) {
			System.out.println("Error Melbourne branch does not exist");
		}

		if (!bank.addBranch("Adelaide")) {
			System.out.println("Adelaide branch already exists");
		}

		if (!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
			System.out.println("Customer does not exist at branch");
		}

		if (!bank.addCustomer("Adelaide", "Andrew", 12.21)) {
			System.out.println("Customer Andrew already exists");
		}

	}

}
