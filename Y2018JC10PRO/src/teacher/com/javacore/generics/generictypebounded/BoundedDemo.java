package teacher.com.javacore.generics.generictypebounded;

public class BoundedDemo {

	public static void main(String[] args) {
		Shape rectange = new Rectangle(10, 20);
		Shape triangle = new Triangle(10);
		SubRectangle subRec = new SubRectangle();

		String ret = equalArea(subRec, triangle) ? "bang nhau" : "khong bang nhau";

		System.out.println("So sanh dien tich: " + ret);

	}

	// Phuong thuc so sanh dien tich cua 2 hinh
	public static <E extends Shape> boolean equalArea(E o1, E o2) {
		return o1.Area() == o2.Area();
	}

}
