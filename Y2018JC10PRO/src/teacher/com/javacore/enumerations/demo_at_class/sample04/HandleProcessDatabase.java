package teacher.com.javacore.enumerations.demo_at_class.sample04;

public enum HandleProcessDatabase {
	INSTANCE;
	private Database database = new Database();

	// Tao ra phuong thuc de get du lieu
	public Database getDataFromDB() {
		return this.database;
	}

}
