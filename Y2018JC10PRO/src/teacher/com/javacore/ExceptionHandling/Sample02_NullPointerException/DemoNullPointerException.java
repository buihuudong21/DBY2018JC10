package teacher.com.javacore.ExceptionHandling.Sample02_NullPointerException;

public class DemoNullPointerException {

	public static void main(String[] args) {

		try {
			String strText2 = getString();

			int iLength = strText2.length(); // => loi o day

			System.out.println("Length is: " + iLength);
		} catch (NullPointerException err) {
			System.out.println(err.getMessage());
			System.out.println(err.getClass());

			// err.printStackTrace();
		}

	}

	public static String getString() {
		return null;
	}
}
