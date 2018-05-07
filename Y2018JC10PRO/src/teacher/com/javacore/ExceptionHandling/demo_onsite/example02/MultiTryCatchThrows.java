package teacher.com.javacore.ExceptionHandling.demo_onsite.example02;

public class MultiTryCatchThrows {

	public static void main(String[] args) {
		int[] arr = { 10, 5 };
		try {
			updateArray(arr);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		} catch (ArithmeticException e1) {
			System.out.println(e1.getMessage());
		}
	}

	public static void updateArray(int[] arr) {
		try {
			arr[3] = arr[1] / 1;
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Lỗi chia 0");
			// TODO: handle exception
		} catch (IndexOutOfBoundsException e2) {
			throw new IndexOutOfBoundsException("Out of bound of the array input !");
		}

	}

}
