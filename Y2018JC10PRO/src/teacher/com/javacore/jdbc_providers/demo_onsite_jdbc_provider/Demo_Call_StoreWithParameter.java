package teacher.com.javacore.jdbc_providers.demo_onsite_jdbc_provider;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import teacher.com.javacore.jdbc_providers.library.SQLLibrary;

public class Demo_Call_StoreWithParameter {

	public static void main(String[] args) {

		// 1. Khoi tao ket noi
		List<Account> lstAccount = new ArrayList<Account>();

		Connection objConn = null;
		SQLLibrary sqlLibrary = new SQLLibrary();
		try {
			objConn = sqlLibrary.SQLOpenConnection("127.0.0.1", "sa", "dd", "demobanking", 1433);

			if (!objConn.isClosed()) {
				// 4. Khai báo các đối tượng
				ResultSet objRs;
				CallableStatement objCmst;
				// String sSQL = "SELECT EventName, Price, EventDay FROM cs_Events";

				// 5. Khởi tạo đối tượng CallableStatement qua Connection
				objCmst = objConn.prepareCall("{call getAllAccountByCustid(?)}");

				objCmst.setString("custid", "0400021863");
				// 6. Thuc thi Command
				objRs = objCmst.executeQuery();

				// 7. Duyệt và hiển thị
				if (objRs != null) {
					while (objRs.next()) {
						Account account = new Account(objRs.getString("custid"), objRs.getString("custname"),
								objRs.getString("acctno"), objRs.getDouble("balance"));
						lstAccount.add(account);

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Goi ham in
		printAccount(lstAccount);
	}

	public static void printAccount(List<Account> lstAccount) {

		for (Account account : lstAccount) {
			System.out.println(account);
		}

	}
}
