package minhthuan.com.code.final_excersise;

import java.util.List;

public class MainFrameQuery {
	private Database database = DatabaseHandler.INSTANCE.getInstance();

	public List<Student> getStudents() {
		return this.database.getStudents();
	}
}
