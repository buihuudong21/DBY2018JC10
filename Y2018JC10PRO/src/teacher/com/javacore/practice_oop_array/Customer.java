package teacher.com.javacore.practice_oop_array;

public class Customer {
	// 1. Thuoc tinh
	private String name;
	private double[] depositAmounted;
	private int vCount = 0; // so lan tang sau moi lan goi ham Add

	// 2. phuong thuc xu ly
	public Customer() {

	}

	public Customer(String name, double amount) {
		this.name = name;
		this.depositAmounted = new double[100];
		addAmountInArray(amount);

	}

	public void addAmountInArray(double amount) {
		if (vCount < 100) {
			depositAmounted[vCount++] = amount;
		}

	}

	// 3.Ham get va set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getDepositAmounted() {
		double[] arrTemp;
		int vIndex = 0;
		for (int i = 0; i < depositAmounted.length; i++) {
			if (depositAmounted[i] != 0) {
				vIndex++;
			}
		}
		arrTemp = new double[vIndex];
		// copy tu mang ban dau sang
		System.arraycopy(depositAmounted, 0, arrTemp, 0, vIndex);

		return arrTemp;
	}

}
