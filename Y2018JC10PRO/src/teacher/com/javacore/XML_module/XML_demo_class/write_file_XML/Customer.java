package teacher.com.javacore.XML_module.XML_demo_class.write_file_XML;

public class Customer {
	private int custid;
	private String custname;
	private double salary;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custid, String custname, double salary) {

		this.custid = custid;
		this.custname = custname;
		this.salary = salary;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", salary=" + salary + "]";
	}

}
