package teacher.com.javacore.oops.interface_object.demo_interface;

public class AppMain {

	public static void main(String[] args) {
		// 1. Dung tinh nang Da hinh
		IShape circle = new Circle(5.6);
		// 2. Khoi tao doi tuong circle tu chinh no
		Circle circle2 = new Circle();
		circle2.setRadius(5.6);

		// System.out.println(circle.toString() + " and has color is: " + circle.COLOR);
		// System.out.println(circle2.toString() + " (circle 2) and has color is: " +
		// circle2.COLOR);

		DiplayInforShape(circle);
		DiplayInforShape(circle2);
		// HInh chu nhat

		IShape rectangle = new Rectangle(5, 25);
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setHeight(4);
		rectangle2.setWidth(25);

		// System.out.println(rectangle.toString() + " and has color is: " +
		// rectangle.COLOR);
		// System.out.println(rectangle2.toString() + " and has color is: " +
		// rectangle2.COLOR);
		DiplayInforShape(rectangle);
		DiplayInforShape(rectangle2);

	}

	public static void DiplayInforShape(IShape iShape) {
		System.out.println(iShape.toString());
	}

}
