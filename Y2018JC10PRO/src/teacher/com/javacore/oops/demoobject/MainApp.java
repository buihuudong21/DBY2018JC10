package teacher.com.javacore.oops.demoobject;

public class MainApp {

	public static void main(String[] args) {

		// 1. Tạo ra đối tượng cụ thể
		// Student sv01 = new Student("Nguyễn Văn A", true, 8.5f);
		Student sv01 = new Student();
		sv01.setsFullName("Nguyễn Văn B");
		sv01.setSex(true);
		sv01.setfMark(9.2f);

		// 2. Gọi hàm hiển thị thông tin
		System.out.println(sv01.displayInforStudent());
		System.out.println(sv01.getsFullName());

	}

}
