package teacher.com.javacore.multithreading.Thread_Synchronization.TheProblemWithoutSynchronization;

public class Account {
	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// synchronized
	public void deposit(double amount) {
		// double newBalance = this.getBalance() + amount;
		// synchronized (this) {
		balance += amount;
		try {
			Thread.sleep(0);

		} catch (Exception e) {
			// TODO: handle exception
		}
		setBalance(balance);
		// }

	}

}
