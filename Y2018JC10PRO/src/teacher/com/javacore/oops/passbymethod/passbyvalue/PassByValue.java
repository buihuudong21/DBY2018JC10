package teacher.com.javacore.oops.passbymethod.passbyvalue;

public class PassByValue {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		swap(a, b);

		// after &a, &b
		System.out.println("Gia tri cua x la: " + a); // 1? 2?
		System.out.println("Gia tri cua y la: " + b); //

	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Gia tri cua a la: " + a);
		System.out.println("Gia tri cua b la: " + b);

	}

}
