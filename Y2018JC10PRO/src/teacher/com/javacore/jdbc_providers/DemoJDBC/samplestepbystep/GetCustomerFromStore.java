package Teacher.Y2017JC79.jdbc_providers.DemoJDBC.samplestepbystep;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import Teacher.Y2017JC79.Lib.SQLLibrary;

public class GetCustomerFromStore {

	public static void main(String[] args) {
		// 1. Khai báo đối tượng
		Connection objConnection;
		ResultSet resultSet = null; // Nhan tap du lieu tra ve tu CSDL
		CallableStatement cmStatement = null; // Doi tuong thuc hien cau lenh SQL

		// 2. Khai báo & thiết lập các tham số kết nối
		SQLLibrary objData = new SQLLibrary();

		try {
			objConnection = objData.SQLOpenConnection("127.0.0.1", "sa", "abc@123", "DEMOBANKING", 1433);
			if (!objConnection.isClosed()) {
				cmStatement = objConnection.prepareCall("{call getLimitCustomer()}");
				resultSet = cmStatement.executeQuery();

				if (resultSet != null) {
					while (resultSet.next()) {
						System.out.println("- Custid: " + resultSet.getString("custid"));
						System.out.println("- Custname: " + resultSet.getString("custname"));
					}
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
