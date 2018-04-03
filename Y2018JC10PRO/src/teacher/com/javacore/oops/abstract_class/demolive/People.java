package teacher.com.javacore.oops.abstract_class.demolive;

public abstract class People {
	private String name;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public abstract double salary();
}
