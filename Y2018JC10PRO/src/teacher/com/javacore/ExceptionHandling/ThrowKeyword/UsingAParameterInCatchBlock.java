package teacher.com.javacore.ExceptionHandling.ThrowKeyword;

public class UsingAParameterInCatchBlock {

	public static void main(String[] args) {
		try {
			new LoginController().CheckLogin("", "");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}

class LoginController {
	public boolean CheckLogin(String userName, String passWord) {
		try {
			String sValue = null;
			int iValue = Integer.parseInt(sValue);
		} catch (Exception ex) {
			throw ex; // khong truc tiep xu ly o day
		}
		return true;
	}
}
