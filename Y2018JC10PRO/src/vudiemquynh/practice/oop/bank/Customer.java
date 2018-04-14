package vudiemquynh.practice.oop.bank;

import java.util.Arrays;

public class Customer {
	private String sFullName = "a";
	private double[] depositAmount;
	private int vCount; // so lan tang sau moi lan add thêm transaction

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String sFullName, double depositAmount) {

		this.sFullName = sFullName;
		this.depositAmount = new double[5];
		addAmountInArray(depositAmount);
	}

	public void addAmountInArray(double amount) {
		if (vCount < 5) {
			depositAmount[vCount] = amount;
			vCount++;
		}
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public double[] getDepositAmount() {
		double[] arrTemp;
		int vIndex = 0;
		for (int i = 0; i < this.depositAmount.length; i++) {
			if (depositAmount[i] != 0) {
				vIndex++;
			}
		}
		arrTemp = new double[vIndex];
		arrTemp = Arrays.copyOfRange(depositAmount, 0, vIndex);
		return arrTemp;
	}

	@Override
	public String toString() {
		return "Customer [sFullName=" + sFullName + ", depositAmount=" + Arrays.toString(getDepositAmount()) + "]";
	}

}
