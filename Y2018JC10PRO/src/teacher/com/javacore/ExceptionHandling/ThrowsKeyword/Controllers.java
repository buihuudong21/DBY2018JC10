package teacher.com.javacore.ExceptionHandling.ThrowsKeyword;

public class Controllers {
	public boolean Calculator() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int arr[] = { 1, 2 };
		arr[2] = 3 / 0;
		return true;
	}
}
