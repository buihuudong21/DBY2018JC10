package teacher.com.javacore.mvc.demo_mvc_at_class_2;

public class StudentArray {
	private Student[] arrStudent;
	private double dMaxOrMin;
	private byte btIndexMaxorMin; // Cho biết là trả ra ds max hay min của điểm (0: Min; 1: Max)

	public Student[] getArrStudent() {
		return arrStudent;
	}

	public void setArrStudent(Student[] arrStudent) {
		this.arrStudent = arrStudent;
	}

	public double getdMaxOrMin() {
		return dMaxOrMin;
	}

	public void setdMaxOrMin(double dMaxOrMin) {
		this.dMaxOrMin = dMaxOrMin;
	}

	public byte getBtIndexMaxorMin() {
		return btIndexMaxorMin;
	}

	public void setBtIndexMaxorMin(byte btIndexMaxorMin) {
		this.btIndexMaxorMin = btIndexMaxorMin;
	}

}
