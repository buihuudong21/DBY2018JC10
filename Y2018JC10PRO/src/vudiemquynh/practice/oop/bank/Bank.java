package vudiemquynh.practice.oop.bank;

import java.util.Arrays;

public class Bank {
	private String sBank;
	private Branch[] arrBranch;
	private int countBranch = 0;

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String sBank) {
		this.sBank = sBank;
		this.arrBranch = new Branch[5];
	}

	public String getsBank() {
		return sBank;
	}

	public Branch[] getArrBranch() {
		Branch[] arrBranchTemp = new Branch[countBranch];
		arrBranchTemp = Arrays.copyOfRange(this.arrBranch, 0, countBranch);
		return arrBranchTemp;
	}

	public void addBranch(String branchName) {
		if (checkBranch(branchName) == -1) {
			this.arrBranch[countBranch] = new Branch(branchName);
			countBranch++;

			System.out.println("Add branch successfully!!!");
		}

		else {
			System.out.println("Branch này đã tồn tại");
		}
	}

	public void addCustomer(String branchname, String name, double amount) {
		if (checkBranch(branchname) == -1) {
			System.out.println("Chưa có branch này vui lòng thêm mới");

		} else {
			this.arrBranch[checkBranch(branchname)].addCustomer(name, amount);
		}
	}

	public void addTransaction(String branchname, String name, double amount) {
		if (checkBranch(branchname) == -1) {
			System.out.println("Chưa có branch này vui lòng thêm mới");

		} else {
			this.arrBranch[checkBranch(branchname)].addTransaction(name, amount);
		}
	}

	public boolean emptyBranch() {
		if (this.countBranch > 0) {
			return false;
		}
		return true;
	}

	public int checkBranch(String branchName) {
		if (emptyBranch() == false) {
			for (int i = 0; i < countBranch; i++) {
				if (this.arrBranch[i].getNameBranch().equals(branchName)) {
					return i;
				}
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return "Bank [arrBranch=" + Arrays.toString(getArrBranch()) + "]";
	}

}
