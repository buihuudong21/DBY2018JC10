package com.teacher.jdbc_providers.DemoJDBC.Sample01TestConnectSQLServer;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class DemoConnectSQLByJDBC {

	public static void main(String[] args) {
		// 1. Khai báo đối tượng connection
		Connection objConnection = null;
		// 2. Ta khai báo
		SQLServerDataSource objData = new SQLServerDataSource();
		objData.setServerName("localhost");
		objData.setUser("sa");
		objData.setPassword("abc@123");
		objData.setDatabaseName("DEMO");
		objData.setPortNumber(1433);

		// 3. Thực hiện mở kết nối
		try {
			objConnection = objData.getConnection();
			if (!objConnection.isClosed()) {
				System.out.println("Ket noi thanh cong");
			}
		} catch (SQLServerException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
