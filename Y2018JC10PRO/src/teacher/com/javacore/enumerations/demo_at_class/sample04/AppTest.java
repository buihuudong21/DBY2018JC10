package teacher.com.javacore.enumerations.demo_at_class.sample04;

import java.util.LinkedList;

public class AppTest {

	public static void main(String[] args) {
		ControllerGetData objController = new ControllerGetData();
		LinkedList<Student> data = objController.getListStudent();

		for (Student student : data) {
			System.out.println(student);
		}
	}

}
