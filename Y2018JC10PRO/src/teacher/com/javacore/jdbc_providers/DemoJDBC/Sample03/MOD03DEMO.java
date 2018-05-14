package com.teacher.jdbc_providers.DemoJDBC.Sample03;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import Teacher.Y2017JC79.Lib.SQLLibrary;

public class MOD03DEMO {
	public static void main(String[] args) {
		// 1. Khai báo đối tượng
		Connection objConnection;

		// 2. Khai báo & thiết lập các tham số kết nối
		SQLLibrary objData = new SQLLibrary();

		// 3. Thực thi mở kết nối tới csdl SQL
		try {
			objConnection = objData.SQLOpenConnection("127.0.0.1", "sa", "abc@123", "DEMOBANKING", 1433);
			if (!objConnection.isClosed()) {
				// 4. Khai báo các đối tượng
				ResultSet objRs;
				CallableStatement objCmst;
				String sSQL = "SELECT top(10)custid, custname FROM tblcustomers";

				// 5. Khởi tạo đối tượng CallableStatement qua Connection
				objCmst = objConnection.prepareCall(sSQL);

				// 6. Thực thi nhận về tập bản ghi --> đưa vào Resultset
				objRs = objCmst.executeQuery();

				// 7. Duyệt và hiển thị
				if (objRs != null) {
					while (objRs.next()) {
						System.out.println("- Custid: " + objRs.getString("custid"));
						System.out.println("- Custname: " + objRs.getString("custname"));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
