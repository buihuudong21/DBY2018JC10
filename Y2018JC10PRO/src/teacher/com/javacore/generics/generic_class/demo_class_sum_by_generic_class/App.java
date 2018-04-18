package teacher.com.javacore.generics.generic_class.demo_class_sum_by_generic_class;

public class App {

	public static void main(String[] args) {
		NumberGeneric<Double, Double> data = new NumberGeneric<>();
		System.out.println(data.toTal(15.2, 20.6));

	}

}
