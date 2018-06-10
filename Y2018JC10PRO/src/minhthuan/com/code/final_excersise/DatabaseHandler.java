package minhthuan.com.code.final_excersise;

public enum DatabaseHandler {
	INSTANCE;
	private Database database = new Database();

	public Database getInstance() {
		return database;
	}

}
