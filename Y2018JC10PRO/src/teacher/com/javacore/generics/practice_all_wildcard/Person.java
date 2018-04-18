package teacher.com.javacore.generics.practice_all_wildcard;

public class Person {
	private String name;
	private double weight;

	public Person() {

	}

	Person(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(Lop Person)Ho ten " + name + " can nang: " + weight;
	}
}
