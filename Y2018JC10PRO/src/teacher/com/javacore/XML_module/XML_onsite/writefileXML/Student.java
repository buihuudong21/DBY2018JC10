package teacher.com.javacore.XML_module.XML_onsite.writefileXML;

public class Student {
	private int Id; // So tu tang trong DB
	private String RollNo; // Ma sinh vien
	private String FullName; // Ten sinh vien
	private double Mark; // Diem sinh vien

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String rollNo, String fullName, double mark) {

		Id = id;
		RollNo = rollNo;
		FullName = fullName;
		Mark = mark;
	}

	public Student(String rollNo, String fullName, double mark) {
		RollNo = rollNo;
		FullName = fullName;
		Mark = mark;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getRollNo() {
		return RollNo;
	}

	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public double getMark() {
		return Mark;
	}

	public void setMark(double mark) {
		Mark = mark;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", RollNo=" + RollNo + ", FullName=" + FullName + ", Mark=" + Mark + "]";
	}

}
