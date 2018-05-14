package teacher.com.javacore.jdbc_providers.demo_jdbc_at_class.demo_connect_sql_by_jdbc;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class MicrosoftSQLConnect {

	public static void main(String[] args) {
		// 1. Khai báo đối tượng thực hiện kết nối với SQL
		Connection objConn = null;
		// 2. Khởi tạo lớp kết nối
		SQLServerDataSource objData = new SQLServerDataSource();
		// Dùng các phương thức để thiết lập các thông số
		objData.setServerName("localhost");
		objData.setUser("sa");
		objData.setPassword("sa");
		objData.setDatabaseName("demobanking");
		objData.setPortNumber(1433);
		// 3. Kết nối thử
		try {
			objConn = objData.getConnection();
			if (!objConn.isClosed()) {
				System.out.println("Đã kết nối ok với SQL");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
