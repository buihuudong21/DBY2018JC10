package teacher.com.javacore.multithreading.demo_thread_at_class.thread_implements_runable;

public class DisplayChar implements Runnable {
	// Nhiệm vụ của lớp này là gì thì code ở đây.
	private char character;
	private int vCount = 0;

	public DisplayChar(char character, int vCount) {

		this.character = character;
		this.vCount = vCount;
	}

	// Ghi đè cái việc cần làm của phương thưc run của interface Runable
	@Override
	public void run() {
		for (int i = 0; i < this.vCount; i++) {
			System.out.println(this.character);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
