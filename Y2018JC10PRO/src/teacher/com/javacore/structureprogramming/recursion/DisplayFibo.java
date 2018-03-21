package teacher.com.javacore.structureprogramming.recursion;

public class DisplayFibo {

	public static void main(String[] args) {
		System.out.println("Gia tri fibo: " + fibo(10));
	}

	public static long fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

}
