package teacher.com.javacore.Swing_apps.demo_javaswing_at_class.demo_show_frame_gui;

import java.util.Date;

public class Loan {
	private double intrate; // Lãi suất vay
	private double balance; // Nợ vay
	private int numberOfYear; // Số năm vay

	private Date createDateLoan; // Ngày vay

	public Loan() {
		this(4.5, 1000, 1);
	}

	public Loan(double intrate, double balance, int numberOfYear) {

		this.intrate = intrate;
		this.balance = balance;
		this.numberOfYear = numberOfYear;
		this.createDateLoan = new Date(); // Ngày hiện tại
	}

	// Hàm get/set
	public double getIntrate() {
		return intrate;
	}

	public void setIntrate(double intrate) {
		this.intrate = intrate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNumberOfYear() {
		return numberOfYear;
	}

	public void setNumberOfYear(int numberOfYear) {
		this.numberOfYear = numberOfYear;
	}

	public Date getCreateDateLoan() {
		return createDateLoan;
	}

	public void setCreateDateLoan(Date createDateLoan) {
		this.createDateLoan = createDateLoan;
	}

	// Hàm tính ra lãi hàng tháng
	public double getMonthlyInterest() {
		return this.balance * this.intrate / 12 / 100;
	}

	// Hàm tính tổng lãi của this.numberOfYear năm

	public double getTotalinterest() {
		return this.getMonthlyInterest() * 12 * this.numberOfYear;
	}

}
