package teacher.com.javacore.oops.demoobject;

public class Student {
	// 1. Khai báo thuộc tính/ data fields
	private String sFullName; // Tên sinh viên ""
	private boolean sex;// Default = false
	private float fMark;// 0.0
	// 2. Xây dựng các hàm tạo (constructor)

	public Student(String sFullName, boolean sex, float fMark) {
		this.sFullName = sFullName;
		this.sex = sex;
		this.fMark = fMark;
	}
	// 3. Tạo các hàm thiết lập/lấy ra các thành phần dữ liệu

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public float getfMark() {
		return fMark;
	}

	public void setfMark(float fMark) {
		this.fMark = fMark;
	}
	// 4. Hàm tra ra thông tin của sinh viên

	public String displayInforStudent() {
		String sReturn;
		sReturn = "Họ và tên: " + this.getsFullName() + " Điểm: " + this.getfMark();
		return sReturn;
	}

}
