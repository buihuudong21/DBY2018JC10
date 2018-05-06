package teacher.com.javacore.multithreading.Demo_onsite.demo_create_thread_extends;

public class PrintChar extends Thread {

	// 1. Khai báo các biến
	private char charPrint;
	private int count; // Số lần mà in ra

	PrintChar(char charPrint, int count) {
		this.charPrint = charPrint;
		this.count = count;
	}

	// 2. overide phương thức run của Thread
	@Override
	public void run() {

		for (int i = 0; i < this.count; i++) {
			System.out.println(charPrint + " ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
