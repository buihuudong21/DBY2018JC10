package teacher.com.javacore.generics.practice_all_wildcard;

public class AppTest {

	public static void main(String[] args) {
		Student st = new Student(10.5, "Dong", 75.5);
		StudentSpec stsp = new StudentSpec();
		Person ps = new Person();

		MyListPerson<Student> student = new MyListPerson<>();
		MyListPerson<Person> person = new MyListPerson<>();
		MyListPerson<StudentSpec> studentSpect = new MyListPerson<>();
		MyListPerson<Customer> customer = new MyListPerson<>();
		// Call display
		displayInfor(student);
		displayInfor(person);
		displayInfor(studentSpect);
		displayInfor(customer);

	}

	// Phuong thuc demo truong hop 1 (?)
	public static void displayInfor(MyListPerson<? super Student> arrData) {

	}

}
