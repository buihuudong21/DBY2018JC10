package teacher.com.javacore.oops.polymorphisms.Overiding;

public class People extends Object {
	private String name;
	private int age;

	public People() {

	}

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

}
