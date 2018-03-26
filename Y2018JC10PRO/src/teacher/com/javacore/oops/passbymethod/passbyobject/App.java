package teacher.com.javacore.oops.passbymethod.passbyobject;

public class App {

	public static void main(String[] args) {
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(2);

		// --1, 2 or 2 - 1
		// swap1(c1, c2);
		// System.out.println("after change 1: c1= " + c1.radius + " c2 = " +
		// c2.radius);

		swap2(c1, c2);
		System.out.println("after change 2: c1= " + c1.radius + " c2 = " + c2.radius);

	}

	public static void swap1(Circle c1, Circle c2) {
		Circle temp = c1;
		c1 = c2;
		c2 = temp;
		System.out.println("Inner change 1: c1= " + c1.radius + " c2 = " + c2.radius);

	}

	public static void swap2(Circle x, Circle y) {
		double temp = x.radius;
		x.radius = y.radius;
		y.radius = temp;
	}

}
