package minhthuan.com.code.final_excersise;

public class AddStudentQuery {
	private Database database = DatabaseHandler.INSTANCE.getInstance();

	public void insertStudent(Student student) {
		this.database.addStudent(student);
	}
}
