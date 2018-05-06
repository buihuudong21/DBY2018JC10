package teacher.com.javacore.multithreading.Thread_Synchronization.TheProblemWithoutSynchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainNoSynchronization {
	private static Account account = new Account();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i = 1; i <= 3; i++) {
			executor.execute(new AddAmount());
		}
		executor.shutdown();

		while (!executor.isTerminated()) {

		}
		System.out.println("Now Balance is: " + account.getBalance());
	}

	// inner class
	private static class AddAmount implements Runnable {

		@Override
		public void run() {
			account.deposit(1);
		}

	}
}
