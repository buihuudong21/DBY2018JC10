package teacher.com.javacore.multithreading.demo_thread_at_class.thread_extends_thread;

public class RunTaskApp {

	public static void main(String[] args) {
		// Tạo ra các đối tượng nhiệm vụ
		// DisplayChar task1 = new DisplayChar('a', 500);
		// DisplayChar task2 = new DisplayChar('b', 400);
		DisplayNumber task3 = new DisplayNumber(500);

		// Add tasks vào luồng để java (JVM) thực hiện
		// Thread t1 = new Thread(task1);
		// Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);
		// Run nó
		// t1.start();
		// t2.start();
		t3.start();

	}

}
