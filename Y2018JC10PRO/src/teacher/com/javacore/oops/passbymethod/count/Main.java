package com.teacher.oops.passbymethod.count;

public class Main {

	public static void main(String[] args) {
		Count myCount = new Count();
		int times = 0;
		for (int i = 0; i < 100; i++) {
			increment(myCount, times);
		}
		System.out.println("count is: " + myCount.count);
		System.out.println("time is: " + times);
	}

	public static void increment(Count c, int times) {
		c.count++;
		times++;
	}

}
