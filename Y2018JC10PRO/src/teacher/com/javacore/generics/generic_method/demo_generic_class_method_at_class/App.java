package teacher.com.javacore.generics.generic_method.demo_generic_class_method_at_class;

public class App {

	public static void main(String[] args) {
		MyArray<Student> lst = new MyArray<>();
		Student[] lstData = new Student[] { new Student("Dong", 5.5), new Student("Hao", 6.5),
				new Student("Thuan", 8.5), new Student("Anh", 9.5), new Student("Vinh", 3.5),
				new Student("Quynh", 10), };

		lst.setArray(lstData);
		lst.displayInforArray(lst.getArray());

		MyArray lst1 = new MyArray(); // Raw type

		lst1.getSize();

		MyArray.displayInforArray(new Double[] { 3.4, 3.5, 25.0, 66.0 });

	}

}
