package com.teacher.jdbc_providers.demo_onsite_jdbc_provider;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class DemoConnectToSQL {

	public static void main(String[] args) {
		// 1. Khai bao doi tuong "ket noi"
		Connection objConn = null;
		// 2. Thiet lap cac thong so de ket noi xuong DB SQL
		// Khai bao doi tuong Source cua DB
		SQLServerDataSource objData = new SQLServerDataSource();
		// Thiet lap cac thong tin
		objData.setServerName("127.0.0.1");
		objData.setUser("sa");
		objData.setPassword("dd");
		objData.setDatabaseName("demobanking");
		objData.setPortNumber(1433);

		// 3. Khoi tao instance cho objConn
		try {
			objConn = objData.getConnection();
			if (!objConn.isClosed()) {
				System.out.println("Ket noi ok giua Java vs SQL Server");
			}

		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
