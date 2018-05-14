package com.teacher.jdbc_providers.DemoJDBC.Sample04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.teacher.jdbc_providers.library.SQLLibrary;

public class MOD04DEMO1 {
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
				// String sSQL = "SELECT EventName, Price, EventDay FROM cs_Events";

				// 5. Khởi tạo đối tượng CallableStatement qua Connection
				objCmst = objConnection.prepareCall("{call spAddCustomer(?,?)}");
				objCmst.setString("custid", "0101010");
				objCmst.setString("custname", "Tran Van Du");

				// 6. Thực thi nhận về tập bản ghi --> đưa vào Resultset
				objCmst.execute();

				// 7.
				short shOpt = (short) JOptionPane.showConfirmDialog(null, "Bạn có xem dữ liệu ko?", "Thông báo",
						JOptionPane.YES_NO_OPTION);

				if (shOpt == 0) {
					// 5. Khởi tạo đối tượng CallableStatement qua Connection
					objCmst = objConnection.prepareCall("{call spGetTopCustomers()}");

					// 6. Thực thi nhận về tập bản ghi --> đưa vào Resultset
					objRs = objCmst.executeQuery();

					// 7. Duyệt và hiển thị
					if (objRs != null) {
						while (objRs.next()) {
							System.out.println("- Custid: " + objRs.getString("custid"));
							System.out.println("- Custname: " + objRs.getString("custname"));
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Thanks");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
