package teacher.com.javacore.arrays.dynamic_array.practice_comparator_comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AppTest {

	public static void main(String[] args) {
		// 1 Khai báo một mảng các sinh viên
		ArrayList<Student> arrData = new ArrayList<>();
		// 2. Add sinh viên vào

		arrData.add(new Student(1, "A", 2.5));
		arrData.add(new Student(2, "E", 4.5));
		arrData.add(new Student(3, "F", 26.5));
		arrData.add(new Student(4, "D", 4.5));
		arrData.add(new Student(5, "C", 32.5));
		arrData.add(new Student(6, "M", 56.5));
		arrData.add(new Student(7, "N", 6.5));
		arrData.add(new Student(8, "T", 3.5));
		arrData.add(new Student(9, "V", 7.5));
		// 3 In ra khi chua sap xep
		showStudent(arrData);

		// 4. Sắp xếp
		// Collections.sort(arrData, new ComparatorStudent());

		// 5. Thử dùng với biểu thức Lambda Expression
		// Collections.sort(arrData, new Comparator<Student>() {
		//
		// @Override
		// public int compare(Student o1, Student o2) {
		//
		// if (o1.getdMark() == o2.getdMark()) {
		// return 0;
		// } else if (o1.getdMark() < o2.getdMark()) {
		// return 1;
		// } else {
		// return -1;
		// }
		// }
		//
		// });

		Collections.sort(arrData, (o1, o2) -> {
			if (o1.getdMark() == o2.getdMark()) {
				return 0;
			} else if (o1.getdMark() > o2.getdMark()) {
				return 1;
			} else {
				return -1;
			}

		});

		System.out.println("=================================");
		showStudent(arrData);

	}

	public static <T extends Student> void showStudent(ArrayList<? extends T> arr) {
		Iterator<T> copyData = (Iterator<T>) arr.iterator();
		while (copyData.hasNext()) {
			System.out.println(copyData.next());
		}
	}

}
