package teacher.com.javacore.jdbc_providers.demo_onsite_jdbc_provider;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class Demo_Execute_StoreProcedure {

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
		// 3. Goi ket noi xuong CSDL bang store

		try {
			objConn = objData.getConnection();
			// 4. Khai báo các đối tượng
			ResultSet objRs;
			CallableStatement objCmst;
			// 5. Khởi tạo đối tượng CallableStatement qua Connection
			objCmst = objConn.prepareCall("{call getCustNameBalance()}");

			// 6. Thực thi nhận về tập bản ghi --> đưa vào Resultset
			objRs = objCmst.executeQuery();

			// 7. Duyệt và hiển thị
			if (objRs != null) {
				while (objRs.next()) {
					System.out.println("- Custid: " + objRs.getString("custid") + " custname "
							+ objRs.getString("custname") + " Balance " + objRs.getString("Bal"));

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
