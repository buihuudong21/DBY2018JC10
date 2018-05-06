package teacher.com.javacore.multithreading.Sample03_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import teacher.com.javacore.multithreading.Sample01.DisplayChar;
import teacher.com.javacore.multithreading.Sample01.DisplayNumber;

public class MainExecutor {

	public static void main(String[] args) {
		// ExecutorService executor = Executors.newFixedThreadPool(4);
		ExecutorService executor = Executors.newCachedThreadPool();

		executor.execute(new DisplayChar('a', 400));
		executor.execute(new DisplayChar('b', 500));
		executor.execute(new DisplayNumber(500));

		executor.shutdown(); // Thuc hien dong pool nhung cho cho xong het cac task

	}

}
