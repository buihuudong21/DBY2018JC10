package teacher.com.javacore.oops.polymorphisms.Overiding;

public class MainTest {

	public static void main(String[] args) {
		// 1. Tạo ra đối tượng sv cụ thể
		Student st = new Student();

		Student student = new Student("Nguyễn Văn A", 20, "ABC001", 8.5d);
		// 2. gọi hàm toString để in ra thông sinh viên
		System.out.println(student.toString());
	}

}
