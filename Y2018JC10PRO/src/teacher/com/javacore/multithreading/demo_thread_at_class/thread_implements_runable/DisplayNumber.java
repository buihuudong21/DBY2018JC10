package teacher.com.javacore.multithreading.demo_thread_at_class.thread_implements_runable;

public class DisplayNumber implements Runnable {
	private int vNum = 0;

	public DisplayNumber(int vNum) {
		this.vNum = vNum;
	}

	// Overide method run của interface Runable

	@Override
	public void run() {
		for (int i = 0; i < this.vNum; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
