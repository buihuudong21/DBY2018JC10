package teacher.com.javacore.structureprogramming.homework.excercise01;

/*
 * Desc: Finding the Greatest Common Divisor
 * Author: Dongbh
 */
public class GreatestCommonDivisor {
	public static int gcd(int a, int b) {
		int gcd = 1;
		int k = 2;
		while (k <= a && k <= b) {
			if (a % k == 0 && b % k == 0)
				gcd = k;
			k++;
		}
		return gcd;
	}
}
