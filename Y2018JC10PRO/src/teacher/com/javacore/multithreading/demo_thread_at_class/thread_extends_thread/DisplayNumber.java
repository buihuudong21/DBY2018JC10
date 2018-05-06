package teacher.com.javacore.multithreading.demo_thread_at_class.thread_extends_thread;

public class DisplayNumber extends Thread {
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
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
