package com.teacher.jdbc_providers.demo_onsite_jdbc_provider;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class Demo_Pass_QuerySQL {

	public static void main(String[] args) {
		// 1. Khoi tao ket noi
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
		// 3. Tao cau lenh vSQL de truy van xuong CSDL
		try {
			ResultSet objRs; // De chua tap du lieu tra ve tu CSDL
			CallableStatement objCmst; // Thuc hien cau lenh truy van xuong CSDL
			objConn = objData.getConnection();
			String vSQL = "SELECT top(10)custid, custname FROM tblcustomers"; // Cau lenh

			// Khởi tạo đối tượng CallableStatement qua Connection
			objCmst = objConn.prepareCall(vSQL);

			// Thực thi nhận về tập bản ghi --> đưa vào Resultset
			objRs = objCmst.executeQuery();

			// 7. Duyệt và hiển thị
			if (objRs != null) {
				while (objRs.next()) {
					System.out.println(objRs.getString("custid") + "-" + objRs.getString("custname"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
