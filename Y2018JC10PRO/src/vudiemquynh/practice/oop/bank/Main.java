package vudiemquynh.practice.oop.bank;

import java.util.Scanner;

public class Main {
	private static Bank bank = new Bank("Ngân Hàng ACB");
	private static Branch branchname = new Branch();
	private static Customer[] customer = new Customer[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số 1, 2, 3, 4 tương ứng với các dịch vụ");
		byte bOption = 0;
		boolean flag = true;
		do {
			showMenu();
			System.out.println("Nhập vào số 1, 2, 3, 4 tương ứng với các dịch vụ");
			bOption = sc.nextByte();
			switch (bOption) {
			case 1:
				addNewBranch();
				break;
			case 2:
				addNewCustomer();
				break;

			case 3:
				addNewTransaction();
				break;

			case 4:
				showInfo();
				break;

			default:
				flag = false;
				break;
			}
		} while (flag == true);

	}

	public static void showMenu() {

		System.out.println("----CHỌN CÁC DỊCH VỤ NGÂN HÀNG SAU-----");
		System.out.println("1. Thêm mới Chi nhánh");
		System.out.println("2. Thêm khách hàng vào Chi nhánh");
		System.out.println("3. Deposit vào TK khách hàng");
		System.out.println("4 In sao kê tất cả KH trong Ngân hàng");
	}

	public static void addNewBranch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hãy nhập vào tên chi nhánh cần thêm vào:");
		String name = sc.nextLine();
		bank.addBranch(name);
	}

	public static void addNewCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Branch: ");
		String name = sc.nextLine();
		System.out.println("Customer Name:");
		String namecus = sc.nextLine();
		System.out.println("Deposit amount:");
		double amount = sc.nextDouble();
		sc.nextLine();
		bank.addCustomer(name, namecus, amount);
	}

	public static void addNewTransaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Branch");
		String name = sc.nextLine();
		System.out.println("Customer Name:");
		String namecus = sc.nextLine();
		System.out.println("Deposit amount: ");
		double amount = sc.nextDouble();

		bank.addTransaction(name, namecus, amount);
	}

	public static void showInfo() {
		System.out.println(bank.getsBank());
		System.out.println(bank.toString());
	}
}
