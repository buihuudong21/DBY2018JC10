package teacher.com.javacore.mvc.demo_mvc_at_class_2;

public class ControllerStudent {
	private ModelStudent studentModels;

	public ControllerStudent() {
		studentModels = new ModelStudent();
	}

	public int[] getArrayIndex(StudentArray o) {

		return studentModels.listIndexMax(o);

	}
}
