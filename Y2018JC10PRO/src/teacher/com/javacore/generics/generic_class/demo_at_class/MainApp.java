package teacher.com.javacore.generics.generic_class.demo_at_class;

public class MainApp {

	public static void main(String[] args) {
		// GenericStack<String> lst = new GenericStack<>();
		//
		// // Đưa dữ liệu vào Stack
		// lst.addData("A");
		// lst.addData("B");
		// lst.addData("C");
		// lst.addData("D");
		// lst.addData("E");
		// lst.addData("F");
		// lst.addData("G");
		// lst.addData("H");
		// lst.addData("I");
		// lst.addData(222);
		//
		// // lặp để lấy và in ra màn hình
		// for (int i = 0; i < lst.getSizeData(); i++) {
		// System.out.println(lst.getElement(i));
		// }
		// Cách 2. Add vào Stack danh sách các đối tương
		// GenericStack<Student> lstStudent = new GenericStack<>();
		// lstStudent.addData(new Student("Dong"));
		// lstStudent.addData(new Student("Trang"));
		// lstStudent.addData(new Student("Thuan"));
		// lstStudent.addData(new Student("Thống"));

		GenericStack<Student> lstStudent = new GenericStack<>();
		Student st1 = new Student();
		Student st2 = new Student();

		st1.setName("Dong");
		st2.setName("Son");
		lstStudent.addData(st1);
		lstStudent.addData(st2);

		// In ra
		for (int i = 0; i < lstStudent.getSizeData(); i++) {
			System.out.println(lstStudent.getElement(i));
		}

	}

}
