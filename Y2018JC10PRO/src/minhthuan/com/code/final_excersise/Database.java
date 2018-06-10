package minhthuan.com.code.final_excersise;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private List<Student> students = new ArrayList<>();
	private Student stt;

	public Database() {
		this.students.add(new Student(1, "Bui Huu Dong", "Q7-TPHCM", "Y2018JC10", "1323464", "012545455"));
		this.students.add(new Student(2, "Nguyen Minh Thuan", "Ton Dan-Q4-TPHCM", "Y2018JC10", "4554546", "057494221"));
		this.students.add(new Student(3, "Bui Huu", " Tan Phat-Q7-TPHCM", "Y2018JC10", "1364", "012545"));
		this.students.add(new Student(4, "Bui  Dong", "Huynh -Q7-TPHCM", "Y2018JC10", "1334", "012545"));
		this.students.add(new Student(5, "Nguyen Van A", "Quan 10-TPHCM", "Y2018JC10", "4534354fds", "021541433"));
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void removeStudent(Student student) {
		this.students.remove(student);
	}
}
