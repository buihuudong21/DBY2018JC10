package teacher.com.javacore.arrays.dynamic_array.excercises.EX01;

import java.util.ArrayList;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		// 1. Khai báo mảng động 1 chiều
		List<Integer> lisInt = new ArrayList<>();
		List<Integer> lisInt02 = new ArrayList<>();
		// 2. Đưa các phần tử vào trong mảng
		lisInt.add(10);
		lisInt.add(20);
		lisInt.add(30);

		// 3.
		lisInt.clear();
		lisInt02.addAll(lisInt);

	}
}
