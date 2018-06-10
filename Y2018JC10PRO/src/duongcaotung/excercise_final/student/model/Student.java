package duongcaotung.excercise_final.student.model;

public class Student {
	private String Name, Address, idNumber, phoneNumber, gender, classID;

	public Student(String name, String address, String idNumber, String phoneNumber, String gender, String classID) {
		Name = name;
		Address = address;
		this.idNumber = idNumber;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.classID = classID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getClassID() {
		return classID;
	}

	public void setClassID(String classID) {
		this.classID = classID;
	}

	public String isGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
