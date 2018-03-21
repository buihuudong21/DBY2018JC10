package teacher.com.javacore.structureprogramming.breakcontinue;

public class break_demo {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;

		while (number <= 1000) {
			number++;
			sum += number;
			if (sum > 200) {
				break;
			}
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The number is: " + number);

	}

}
