package teacher.com.javacore.ExceptionHandling.Sample04_MultiTryCatchException;

public class MutiTryCatchException {
	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2 };
			arr[1] = 3 / 0;
		} catch (ArrayIndexOutOfBoundsException ex) // This block is unreachable
		{
			System.out.println("array index out of bound exception");
		} catch (ArithmeticException e) // This block handles all Exception
		{
			System.out.println("Generic exception");
		}
	}
}
