package teacher.com.javacore.oops.abstract_class.abstract_fruit;

public abstract class Fruit {
	private static int numberOfFruits = 0;
	protected String color;
	protected String taste;

	public Fruit(String color, String taste) {

		this.color = color;
		this.taste = taste;
		numberOfFruits++;
	}

	public abstract void setColor(String color);

	public String getTaste() {
		return taste;
	}

	public static int getNumberOfFruit() {
		return numberOfFruits;
	}
}
