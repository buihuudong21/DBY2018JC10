package teacher.com.javacore.oops.inheritance.demoextends;

public class Person {
	// 1. Khai báo thuộc tính
	private String sFullName;
	private short age;
	private double height;
	private double weight;
	private Address address; // Mối quan hệ giữa person và address là HAS-A

	// 2. Định nghĩa hàm tạo
	protected Person() {

	}

	protected Person(String sFullName, short age, double height, double weight, Address address) {

		this.sFullName = sFullName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.address = address;
	}
	// 3. Định nghĩa các hàm get/set

	protected String getsFullName() {
		return sFullName;
	}

	protected void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	protected short getAge() {
		return age;
	}

	protected void setAge(short age) {
		this.age = age;
	}

	protected double getHeight() {
		return height;
	}

	protected void setHeight(double height) {
		this.height = height;
	}

	protected double getWeight() {
		return weight;
	}

	protected void setWeight(double weight) {
		this.weight = weight;
	}

	protected Address getAddress() {
		return address;
	}

	protected void setAddress(Address address) {
		this.address = address;
	}

}
