package teacher.com.javacore.oops.abstract_class.demolive;

public class MainApp {

	public static void main(String[] args) {
		// 1. Khởi tạo đối tượng nhân viên
		People emp = new Employee(); // Là người mà là nhân viên
		emp.setName("Trần Quỳnh Trang");

		System.out.println("Lương của nhân viên tên " + emp.getName() + " là:" + emp.salary());
		// 2. Đối tượng Sếp

		People hiPeople = new HighEmployee();
		hiPeople.setName("Trần Văn Sếp");
		System.out.println("Lương của nhân viên tên " + hiPeople.getName() + " là:" + hiPeople.salary());

	}

}
