package teacher.com.javacore.practice_oop_array;

public class Customer {
	// 1. Thuoc tinh
	private static final int INITIAL_CAPACITY = 20;
	private String name;
	private double[] depositAmounted = new double[INITIAL_CAPACITY];
	private int size = 0; // số lượng lần gửi tiền

	// 2. phuong thuc xu ly
	public Customer(String name, double amount) {
		this.name = name;
		addAmountInArray(amount);
	}

	public void addAmountInArray(double amount) {
		ensureCapcity();
		depositAmounted[size++] = amount;
	}

	// 3.Ham get va set
	public String getName() {
		return name;
	}

	public int getSize() {
		return this.size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getDepositAmounted() {
		double[] arrTemp = new double[this.size];
		// copy tu mang ban dau sang
		System.arraycopy(depositAmounted, 0, arrTemp, 0, this.getSize());
		return arrTemp;
	}
	// Hàm tự động thay đổi size của mảng depositAmounted

	public void ensureCapcity() {
		if (this.size >= this.depositAmounted.length) {
			// Thực hiện tăng mảng lên
			double[] newData = new double[this.size * 2];
			System.arraycopy(depositAmounted, 0, newData, 0, this.depositAmounted.length);
			this.depositAmounted = newData;
		}
	}

}
