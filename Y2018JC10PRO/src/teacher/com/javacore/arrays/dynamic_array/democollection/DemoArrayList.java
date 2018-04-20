package teacher.com.javacore.arrays.dynamic_array.democollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoArrayList {

	public static void main(String[] args) {
		// Khai baos
		ArrayList<Double> lstData = new ArrayList<Double>(); // Tinh da hinh
		// dua cac phan tu vao trong
		lstData.add(125.2);
		lstData.add(125.2);
		lstData.add(125.2);
		lstData.add(134235.2);
		lstData.add(12345.2);
		lstData.add(1234525.2);
		lstData.add(12234235.2);
		lstData.add(1123125.2);
		lstData.add(121231235.2);
		lstData.add(12123125.2);

		// Return chieu dai cua mang
		System.out.println("So luong phan tu trong mang: " + lstData.size());

		// Duyet va in ra cac phan tu
		// for (Double number : lstData) {
		// System.out.println(number);
		// }
		// Dung Lap Co san cua Java de sap xep cac phan tu trong lstData
		Collections.sort(lstData);
		// for (Double number : lstData) {
		// System.out.println(number);
		// }

		// Dung thuoc tinh Lap (Iterable) de duyet qua cac phan tu trong list
		Iterator<Double> copyData = lstData.iterator();
		while (copyData.hasNext()) {
			System.out.println("gia tri la: " + copyData.next());
		}

		for (int i = 0; i < lstData.size(); i++) {
			System.out.println(lstData.get(i));
		}
		// Double[] data = { 12.2, 154.5 };
		// Double[] newData = lstData.toArray(data);

	}

}
