package teacher.com.javacore.multithreading.demo_thread_at_class.thread_implements_runable;

public class RunTaskApp {

	public static void main(String[] args) {
		// Tạo ra các đối tượng nhiệm vụ
		DisplayChar task1 = new DisplayChar('a', 500);
		DisplayChar task2 = new DisplayChar('b', 400);
		DisplayNumber task3 = new DisplayNumber(500);

		// Add tasks vào luồng để java (JVM) thực hiện
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		});
		// Run nó
		t1.start();
		t2.start();
		// t3.start();
		t4.start();
	}

}
