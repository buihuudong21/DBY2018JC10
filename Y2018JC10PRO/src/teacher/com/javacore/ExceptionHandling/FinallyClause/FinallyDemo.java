package Teacher.Y2017JC79.ExceptionHandling.FinallyClause;

public class FinallyDemo {
	public static void main(String[] args) {

		try {
			int c = 10 / 0;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("NGuyen Van A");

		}
	}
}
