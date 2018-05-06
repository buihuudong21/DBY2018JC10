package teacher.com.javacore.multithreading.Demo_onsite.demo_create_thread_impl_runable;

public class PrintNumber implements Runnable {
	private int iTimes;

	public PrintNumber(int iTimes) {

		this.iTimes = iTimes;
	}

	@Override
	public void run() {

		for (int i = 0; i < iTimes; i++) {
			System.out.print(i + " ");
		}
	}

}
