package teacher.com.javacore.jdbc_providers.demo_jdbc_at_class.demo_add_customer_test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class AddCustomerDemo {

	public static void main(String[] args) {
		// 1. Connecting to SQL DB
		// 1. Khoi tao ket noi
		Connection objConn = null;
		// 2. Thiet lap cac thong so de ket noi xuong DB SQL
		// Khai bao doi tuong Source cua DB
		SQLServerDataSource objData = new SQLServerDataSource();
		// Thiet lap cac thong tin
		objData.setServerName("127.0.0.1");
		objData.setUser("sa");
		objData.setPassword("sa");
		objData.setDatabaseName("demobanking");
		objData.setPortNumber(1433);

		// System.out.println("OK");
		try {
			objConn = objData.getConnection();
			// Kiem tra xem ket noi ok chua?
			if (!objConn.isClosed()) {
				// Goi store
				// Khai báo các đối tượng
				ResultSet objRs;
				CallableStatement objCmst;

				// 5. Khởi tạo đối tượng CallableStatement qua Connection
				objCmst = objConn.prepareCall("{call addCustomer(?,?)}");
				// 6. Khoi tao gia tri cho cac parameter

				objCmst.setString("custid", "0123456");
				objCmst.setString("custname", "Tran Van Du");

				// 7. Thực thi nhận về tập bản ghi --> đưa vào Resultset
				objCmst.execute();
				System.out.println("Inserted !");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
