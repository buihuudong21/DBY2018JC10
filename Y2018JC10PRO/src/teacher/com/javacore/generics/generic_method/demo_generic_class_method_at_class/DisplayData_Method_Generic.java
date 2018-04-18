package teacher.com.javacore.generics.generic_method.demo_generic_class_method_at_class;

public class DisplayData_Method_Generic {
	public static void main(String[] args) {
		Student[] lstData = new Student[] { new Student("Dong", 5.5), new Student("Hao", 6.5),
				new Student("Thuan", 8.5), new Student("Anh", 9.5), new Student("Vinh", 3.5),
				new Student("Quynh", 7.5), };
		Integer[] lstNumber = { 545, 6865312, 2332, 6841, 332 };

		displayData(lstData);
		displayData(lstNumber);

		// AutoBoxing
		int data = 452; // "452"
		Integer number = data;
		System.out.println(number + 125);
		// Auto UnBoxing
		int intNumber = number; // Chuyen ve kieu nguyen thuy

	}

	// 2 Viet Generic o muc phuong thuc
	public static <T> void displayData(T[] lst) {
		T[] data = lst;
		for (T t : data) {
			System.out.println(t);
		}
	}

}
