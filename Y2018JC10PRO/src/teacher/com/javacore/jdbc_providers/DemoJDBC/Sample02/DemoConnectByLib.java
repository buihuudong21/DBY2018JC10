package Teacher.Y2017JC79.jdbc_providers.DemoJDBC.Sample02;

import java.sql.Connection;

import Teacher.Y2017JC79.Lib.SQLLibrary;

public class DemoConnectByLib {

	public static void main(String[] args) {
		Connection objConnection;
		SQLLibrary objData = new SQLLibrary();

		try {
			objConnection = objData.SQLOpenConnection("localhost", "sa", "abc@123", "DEMO", 1433);
			if (!objConnection.isClosed()) {
				System.out.println("Da ket noi");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
