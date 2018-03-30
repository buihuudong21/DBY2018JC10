package teacher.com.javacore.oops.inheritance.demoextends;

public class MainTest {

	public static void main(String[] args) {
		// 1. Khởi tạo đối tượng
		// Student student = new Student();

		// 2. Truyền dữ liệu cụ thể cho object student

		// student.setdMark(9.5);
		// student.setAddress("Số 1 - Hàm Nghi - Quận 1");
		// student.setAge((short) (20));
		// student.setsFullName("Nguyễn Văn A");
		// student.setHeight(1.75);
		// student.setWeight(80);

		Address address = new Address("Phù Tải", "Thanh Giang", "Thanh Miện", "Hải Dương");

		Student student = new Student(8.5, "Nguyễn Văn B", (short) 22, 1.75, 65.5, address);

		// 3. In thông tin từ đối tương student

		System.out.println("Tên sinh viên là: " + student.getsFullName() + " Điểm: " + student.getdMark()
				+ student.getAddress().displayInforAddress());

	}

}
