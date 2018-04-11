package teacher.com.javacore.mvc.demo_mvc_at_class_2;

public class ViewApp {
	// 5,3.5,9,8,8,6,8,3.5,8,9,9,3.5,9
	public static void main(String[] args) {
		// 1. Tao doi tuong sinh vien
		Student sv1 = new Student(1, "A", 5);
		Student sv2 = new Student(1, "B", 3.5f);
		Student sv3 = new Student(1, "C", 9);
		Student sv4 = new Student(1, "D", 8);
		Student sv5 = new Student(1, "E", 8);
		Student sv6 = new Student(1, "F", 6);
		Student sv7 = new Student(1, "G", 8);
		Student sv8 = new Student(1, "H", 3.5f);
		Student sv9 = new Student(1, "I", 8);
		Student sv10 = new Student(1, "K", 9);
		Student sv11 = new Student(1, "M", 9);
		Student sv12 = new Student(1, "M", 3.5f);
		Student sv13 = new Student(1, "M", 9);
		// 2. Đưa vào mảng
		Student[] arrStudent = new Student[13];
		arrStudent[0] = sv1;
		arrStudent[1] = sv2;
		arrStudent[2] = sv3;
		arrStudent[3] = sv4;
		arrStudent[4] = sv5;
		arrStudent[5] = sv6;
		arrStudent[6] = sv7;
		arrStudent[7] = sv8;
		arrStudent[8] = sv9;
		arrStudent[9] = sv10;
		arrStudent[10] = sv11;
		arrStudent[11] = sv12;
		arrStudent[12] = sv13;
		// 3. Đưa vào mảng đối tượng (để truyền đi)
		StudentArray arrData = new StudentArray();
		arrData.setArrStudent(arrStudent);
		arrData.setBtIndexMaxorMin((byte) 0);
		arrData.setdMaxOrMin(0);
		// Gọi controller để trả ra

		ControllerStudent controllerStudent = new ControllerStudent();

		int[] arrReturn = controllerStudent.getArrayIndex(arrData);

		// in ra
		for (int i = 0; i < arrReturn.length; i++) {
			System.out.print(arrReturn[i] + " ");
		}

	}

}
