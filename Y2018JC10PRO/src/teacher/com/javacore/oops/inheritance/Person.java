package teacher.com.javacore.oops.inheritance;

public class Person {
	private String sName; // Họ và tên
	protected int age; // Tuổi
	protected double height; // Chiêu cao
	protected double weight; // cân nặng
	protected String address; // địa chỉ
	protected AddressComp addressCompp;// chua addresCom - Has - A

	public Person() {

	}

	public Person(String sName, int age, double height, double weight, String address) {
		this.sName = sName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.address = address;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
