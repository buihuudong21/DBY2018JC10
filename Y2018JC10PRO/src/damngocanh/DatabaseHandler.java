package com.damngocanh.customers.model;

public enum DatabaseHandler {
	INSTANCE;
	private Database database = new Database();

	public Database getInstance() {
		return database;

	}
}
