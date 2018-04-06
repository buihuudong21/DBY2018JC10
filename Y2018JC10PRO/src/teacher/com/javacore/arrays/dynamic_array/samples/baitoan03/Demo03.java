package com.teacher.arrays.dynamic_array.samples.baitoan03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo03 {
	public static void main(String[] args) {
		// 1. Khai bao va khoi tao du lieu
		List<Employment> listEmp = new ArrayList<Employment>();
		List<Double> listDouble = new ArrayList<Double>();

		listEmp.add(new Employment(1, "Obama", "USA", 1500));
		listEmp.add(new Employment(2, "Nguyễn Văn A", "Việt Nam", 3500));
		listEmp.add(new Employment(3, "Trần Đông Vy", "Việt Nam", 6500));
		listEmp.add(new Employment(4, "Nguyễn Thắng", "Canada", 4500));

		listDouble.add(2908934938493.5);
		listDouble.add(332.5);
		listDouble.add(2233.5);
		listDouble.add(2333.5);
		listDouble.add(23324342.5);
		listDouble.add(223423.5);
		listDouble.add(2.54);
		listDouble.add(2.23425);
		listDouble.add(23423422.5);
		listDouble.add(223423423324.5);

		// 2. Sắp xếp mảng các đối tượng

		Collections.sort(listDouble); // Tang dan

		// 3. in ra
		Iterator<Double> iterator = listDouble.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ; ");
		}
	}

}
