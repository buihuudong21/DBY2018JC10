package teacher.com.javacore.enumerations.demo_at_class.sample04;

import java.util.LinkedList;

public class ControllerGetData {
	private LinkedList<Student> lstData;
	// goi toi enum
	private Database database = HandleProcessDatabase.INSTANCE.getDataFromDB();

	public ControllerGetData() {
		this.lstData = this.database.getArrData();
	}

	public LinkedList<Student> getListStudent() {
		return this.lstData;
	}

}
