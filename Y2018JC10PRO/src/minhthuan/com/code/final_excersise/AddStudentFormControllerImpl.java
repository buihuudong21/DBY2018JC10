package minhthuan.com.code.final_excersise;

public class AddStudentFormControllerImpl implements IAddStudentFormController {
	private AddStudentQuery addStudentQuery;

	public AddStudentFormControllerImpl() {
		this.addStudentQuery = new AddStudentQuery();
	}

	@Override
	public void insertStudent(Student student) {
		this.addStudentQuery.insertStudent(student);

	}

}
