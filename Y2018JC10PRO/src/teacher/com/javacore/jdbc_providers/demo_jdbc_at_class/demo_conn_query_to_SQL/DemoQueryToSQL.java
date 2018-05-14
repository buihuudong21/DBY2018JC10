package teacher.com.javacore.jdbc_providers.demo_jdbc_at_class.demo_conn_query_to_SQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class DemoQueryToSQL {

	public static void main(String[] args) {
		// Purpose: Kết nối và lấy dữ liệu thông câu lệnh SQL
		// 1. Define bộ kết nối
		Connection objConn = null;
		// 2. Khởi tạo lớp kết nối
		SQLServerDataSource objData = new SQLServerDataSource();
		// Dùng các phương thức để thiết lập các thông số
		objData.setServerName("localhost");
		objData.setUser("sa");
		objData.setPassword("sa");
		objData.setDatabaseName("demobanking");
		objData.setPortNumber(1433);
		// 3. Khai báo biến chứa câu lệnh SQL
		String vSQL = "select top(10)custid,custname from tblcustomers";

		// 4. Thực hiện get dữ liệu
		try {
			ResultSet rsDataSet = null; // Bộ chứa tập dữ liệu trả ra
			CallableStatement objCmst; // Đối tượng để thực hiện câu lệnh
			objConn = objData.getConnection(); // Gọi kết nối
			objCmst = objConn.prepareCall(vSQL);

			// Lấy dữ liệu ra
			rsDataSet = objCmst.executeQuery();

			// lặp rsDataset để lấy từng phần tử dữ liệu ra
			if (rsDataSet != null) {
				while (rsDataSet.next()) {
					System.out.println(rsDataSet.getString("custid") + " " + rsDataSet.getString("custname"));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
