package teacher.com.javacore.structureprogramming.recursion;

import java.math.BigInteger;

public class DemoGiaiThua {

	public static void main(String[] args) {
		int k = 20;
		System.out.println("Gia thua cua 5 la: " + giaiThua(k));
		BigInteger x = new BigInteger("11111111111111111111111111111111111111111111111111111111111111111111");
	}

	public static long giaiThua(int n) {
		if (n == 0) {
			return 1; // Dieu kien dung (co so - base case)
		} else {
			return n * giaiThua(n - 1);
		}
	}
}

// Parameter vs argruments
