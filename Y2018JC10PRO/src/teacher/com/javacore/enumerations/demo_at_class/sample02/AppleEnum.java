package teacher.com.javacore.enumerations.demo_at_class.sample02;

public enum AppleEnum {
	A(1), B(3), C, D(90); // Lien quan toi enum

	// lien quan toi lop
	private int size = -1;

	private AppleEnum() {
		this.size = 0;
	}

	private AppleEnum(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	// Other Method....
	@Override
	public String toString() {

		return "Doi tuong co size la: " + this.size;
	}
}
