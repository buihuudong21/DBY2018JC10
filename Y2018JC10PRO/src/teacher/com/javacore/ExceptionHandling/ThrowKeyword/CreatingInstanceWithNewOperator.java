package teacher.com.javacore.ExceptionHandling.ThrowKeyword;

public class CreatingInstanceWithNewOperator {
	public static void main(String[] args) {
		try {
			Exception ex = new Exception("demo");
			throw ex;
		} catch (Exception ex) {
			System.out.println(ex.toString());// Handling
		}
	}
}
