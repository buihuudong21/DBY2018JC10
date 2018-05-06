package teacher.com.javacore.multithreading.Demo_onsite.demo_create_thread_extends;

public class MainTestThread {

	public static void main(String[] args) {
		// 1. Khai báo nhiệm vụ phải làm
		PrintChar printCharA = new PrintChar('a', 200);
		PrintChar printCharB = new PrintChar('b', 200);
		PrintNumber printNumber = new PrintNumber(500);
		// 2. Đưa vào thread
		Thread task1 = new Thread(printCharA);
		Thread task2 = new Thread(printCharB);
		Thread task3 = new Thread(printNumber);
		// 3. Chạy đồng thời

		task3.start();
		task2.start();
		task1.start();

	}

}
