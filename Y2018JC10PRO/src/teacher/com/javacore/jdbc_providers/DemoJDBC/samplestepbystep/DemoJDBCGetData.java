package Teacher.Y2017JC79.jdbc_providers.DemoJDBC.samplestepbystep;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Teacher.Y2017JC79.Lib.SQLLibrary;

public class DemoJDBCGetData {

	public static void main(String[] args) {
		// 1. Khai doi tuong ket noi
		Connection objConnection = null;
		ResultSet resultSet = null; // Nhan tap du lieu tra ve tu CSDL
		CallableStatement cmStatement = null; // Doi tuong thuc hien cau lenh SQL

		// 2. Ta goi ket noi toi CSDL SQL
		SQLLibrary objData = new SQLLibrary();
		try {
			objConnection = objData.SQLOpenConnection("127.0.0.1", "sa", "abc@123", "demobanking", 1433);
			if (!objConnection.isClosed()) {
				String vSQL = "select top(10) custid, custname from tblcustomers";
				// Thuc hien sinh doi tuong thuc hien cau lenh SQL
				cmStatement = objConnection.prepareCall(vSQL);
				// Lay du lieu tra ve
				resultSet = cmStatement.executeQuery();
				// Kiem tra ve xu ly du lieu

				if (resultSet != null) {
					while (resultSet.next()) {
						System.out.println("Ma khach hang: " + resultSet.getString("custid"));
						System.out.println("Ten khach hang: " + resultSet.getString("custname"));

					}
					resultSet.close();
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
