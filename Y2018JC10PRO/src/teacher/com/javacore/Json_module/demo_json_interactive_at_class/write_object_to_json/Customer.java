package teacher.com.javacore.Json_module.demo_json_interactive_at_class.write_object_to_json;

public class Customer {
	private String names;
	private int yearOfBirth;
	private double salary;

	public Customer() {

	}

	public Customer(String names, int yearOfBirth, double salary) {

		this.names = names;
		this.yearOfBirth = yearOfBirth;
		this.salary = salary;
	}

	public String getName() {
		return names;
	}

	public void setName(String name) {
		this.names = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Customer [name=" + names + ", yearOfBirth=" + yearOfBirth + ", salary=" + salary + "]";
	}

}
