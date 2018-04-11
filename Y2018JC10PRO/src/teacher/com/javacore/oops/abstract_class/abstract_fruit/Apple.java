package teacher.com.javacore.oops.abstract_class.abstract_fruit;

public class Apple extends Fruit {
	public Apple(String color, String taste) {
		super(color, taste);
	}

	@Override
	public void setColor(String color) {
		super.color = color;

	}

}
