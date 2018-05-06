package teacher.com.javacore.multithreading.demo_thread_at_class.excutor_services_pool_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import teacher.com.javacore.multithreading.demo_thread_at_class.thread_extends_thread.DisplayNumber;
import teacher.com.javacore.multithreading.demo_thread_at_class.thread_implements_runable.DisplayChar;

public class ExcutetorThreadFixedPool {

	public static void main(String[] args) {
		ExecutorService excutor = Executors.newFixedThreadPool(4);

		excutor.execute(new DisplayChar('a', 400));
		excutor.execute(new DisplayChar('b', 500));
		excutor.execute(new DisplayNumber(500));
		excutor.execute(new DisplayChar('c', 500));

		excutor.shutdown();
	}

}
