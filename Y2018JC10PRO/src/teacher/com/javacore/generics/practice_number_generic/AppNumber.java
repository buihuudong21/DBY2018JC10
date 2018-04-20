package teacher.com.javacore.generics.practice_number_generic;

public class AppNumber {

	public static void main(String[] args) {
		NumberGeneric<Double> numberGeneric = new NumberGeneric<>();

		System.out.println("Total 2 number a and b is: " + numberGeneric.add(new Double(15), 12.2));

	}

}
