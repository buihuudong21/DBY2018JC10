package buihuudong.thread_primenumber;

public class CheckPrime implements Runnable {
	private int n;

	public CheckPrime() {

	}

	public CheckPrime(int n) {

		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.n; i++) {
			if (getPrime(i)) {
				System.out.println(i);
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public synchronized boolean getPrime(int n) {
		if (n > 1) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
