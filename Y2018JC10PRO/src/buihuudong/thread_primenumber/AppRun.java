package buihuudong.thread_primenumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppRun {

	public static void main(String[] args) {
		ExecutorService excutor = Executors.newCachedThreadPool();
		// for (int i = 2; i < 500; i++) {
		excutor.execute(new CheckPrime(500));
		// }
		excutor.shutdown();
	}

}
