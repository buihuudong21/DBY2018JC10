package teacher.com.javacore.arrays.dynamic_array.practice_comparator_comparable.comparator;

public class Student {
	private int id;
	private String name;
	private double dMark;

	public Student() {

	}

	public Student(int id, String name, double dMark) {
		super();
		this.id = id;
		this.name = name;
		this.dMark = dMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

	@Override
	public String toString() {
		return String.format("Mã: %s, Tên: %s, Điểm: %s", this.getId(), this.getName(), this.getdMark());
	}

}
