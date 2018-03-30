package teacher.com.javacore.oops.castingobject_instanceof;

import teacher.com.javacore.oops.demoobject.Student;

public class CastingObject_01 {

	public static void main(String[] args) {
		Object obj = new Student(); // Implicit casting. Ok because student is instance of object
		printInforObject(obj);

		// Student b = obj; why ocur error?
		Student b = (Student) obj; // Explicit casting
		printInforObject(b);

	}

	public static void printInforObject(Object x) {
		System.out.println(x);
	}

}
