package teacher.com.javacore.multithreading.demo_thread_at_class.excutor_services_pool_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import teacher.com.javacore.multithreading.demo_thread_at_class.thread_extends_thread.DisplayNumber;
import teacher.com.javacore.multithreading.demo_thread_at_class.thread_implements_runable.DisplayChar;

public class ExcutorServcices {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool(); // Cho phép add bao nhiều thread cũng được
		// Add các thread vào pool
		executor.execute(new DisplayChar('a', 400));
		executor.execute(new DisplayChar('b', 500));
		executor.execute(new DisplayNumber(500));

		executor.shutdown(); // không cho phép thêm mới một nhiệm vụ khác vào
	}
}
