package hoangminhnam.connect;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class ConnectDB {
	public static Connection getConnection() {
		Connection conn = null;
		SQLServerDataSource objData = new SQLServerDataSource();
		objData.setServerName("localhost");
		objData.setUser("sa");
		objData.setPassword("123");
		objData.setDatabaseName("QuanLySV");
		objData.setPortNumber(1433);
		try {
			conn = objData.getConnection();
			if (!conn.isClosed()) {
				System.out.println("Connect Successful!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		getConnection();
	}
}
