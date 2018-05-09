package teacher.com.javacore.enumerations.demo_at_class.sample04;

import java.util.LinkedList;

public class Database {
	private LinkedList<Student> arrData = new LinkedList<>();

	public Database() {
		arrData.add(new Student(1, "Nguyen Van A", 8.5));
		arrData.add(new Student(2, "Nguyen Van B", 7.5));
		arrData.add(new Student(3, "Nguyen Van C", 6.5));
		arrData.add(new Student(4, "Nguyen Van D", 5.5));
		arrData.add(new Student(5, "Nguyen Van E", 4.5));
		arrData.add(new Student(6, "Nguyen Van F", 3.5));
		arrData.add(new Student(7, "Nguyen Van G", 9.5));
	}

	public LinkedList<Student> getArrData() {
		return arrData;
	}

}
