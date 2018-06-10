package duongcaotung.excercise_final.student.model;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class DataBase {
	public static void main(String[] args) {
		connected();
	}

	public static Connection connected() {
		SQLServerDataSource dataSource = new SQLServerDataSource();
		dataSource.setServerName("127.0.0.1");
		dataSource.setUser("sa");
		dataSource.setPassword("123");
		dataSource.setDatabaseName("iMic_final_excercise");
		Connection connection = null;
		dataSource.setServerName("127.0.0.1");
		dataSource.setUser("sa");
		dataSource.setPassword("123");
		dataSource.setDatabaseName("iMic_final_excercise");
		try {
			connection = dataSource.getConnection();
			if (!connection.isClosed()) {
				System.out.println("connected");
			}

		} catch (Exception e2) {
			// TODO: handle exception
			e2.getStackTrace();
		}
		return connection;
	}
}
