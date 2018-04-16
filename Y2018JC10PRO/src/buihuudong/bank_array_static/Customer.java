package buihuudong.bank_array_static;

public class Customer {
	// 1. Thuoc tinh
	private static final int INITIAL_CAPACITY = 20; // Khai bao default size ban dau cho mang
	private String name;
	private double[] depositAmounted = new double[INITIAL_CAPACITY];
	private int size = 0; // size of the depositAmounted

	// 2. phuong thuc xu ly
	public Customer() {

	}

	public Customer(String name, double amount) {
		this.name = name;
		addAmountInArray(amount);

	}

	public void addAmountInArray(double amount) {
		// Thay doi size tu dong
		ensureCapacity();
		depositAmounted[size++] = amount;
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

	// ensure Capacity
	public void ensureCapacity() {
		if (this.size >= depositAmounted.length) {
			double[] newData = new double[this.size * 2 + 1];
			System.arraycopy(depositAmounted, 0, newData, 0, this.size);
			this.depositAmounted = newData;
		}

	}

}
