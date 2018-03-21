package teacher.com.javacore.structureprogramming.homework.decimaltohexa;

import java.util.Scanner;

public class DemoAgainDec2Hex {

	public static void main(String[] args) {
		/*
		 * Cách làm: Input: a => Decimals Ouput: b => Hexadecimals Bước 1: Lấy số a chia
		 * cho 16=> được phân thương và dư (>=0 và <=15) + Nếu dư between 0 => 9 => kí
		 * số 0 đến 9 => b + nếu dư >=10 và <=15 => chuyển số này thành ký tự theo ASCII
		 * Bước 2: Lặp lại như bước 1 cho đến khi phần thương = 0 (kết thúc lặp) =>
		 * return b?
		 * 
		 * 
		 */
		System.out.println("Input the number decimal:");
		int dec = new Scanner(System.in).nextInt();
		System.out.println("The hexadecimal is: " + dec2Octal(dec));
		// A: 10 - B: 11. C:12, D: 13, E: 14, F: 15

	}

	public static String dec2Hexa(int decimals) {
		String strResult = "";

		while (decimals != 0) {
			int hexValue = decimals % 16; // Remainder;
			char cDigit = (hexValue >= 0 && hexValue <= 9) ? (char) (hexValue + '0') : (char) (hexValue + 'A' - 10);
			strResult = cDigit + strResult; // Rat quan trong

			decimals /= 16; // Quotient (phan thuong)
		}

		return strResult;
	}

	public static String dec2Binary(int decimals) {
		String strResult = "";

		while (decimals != 0) {
			int hexValue = decimals % 2; // Remainder;
			char cDigit = (hexValue >= 0 && hexValue <= 1) ? (char) (hexValue + '0') : (char) (hexValue + 'A' - 10);
			strResult = cDigit + strResult; // Rat quan trong

			decimals /= 2; // Quotient (phan thuong)
		}

		return strResult;
	}

	public static String dec2Octal(int decimals) {
		String strResult = "";

		while (decimals != 0) {
			int hexValue = decimals % 8; // Remainder;
			char cDigit = (hexValue >= 0 && hexValue <= 7) ? (char) (hexValue + '0') : (char) (hexValue + 'A' - 10);
			strResult = cDigit + strResult; // Rat quan trong

			decimals /= 8; // Quotient (phan thuong)
		}

		return strResult;
	}

}
