package com.teacher.mvc.homework;

public class StudentView {

	public static void main(String[] args) {

		// 1. Tao doi tuong sinh vien
		StudentEntity sv1 = new StudentEntity(1, "A", 3.5);
		StudentEntity sv2 = new StudentEntity(1, "B", 9.5);
		StudentEntity sv3 = new StudentEntity(1, "C", 3.5);
		StudentEntity sv4 = new StudentEntity(1, "D", 3.5);
		StudentEntity sv5 = new StudentEntity(1, "E", 3.5);
		StudentEntity sv6 = new StudentEntity(1, "F", 7.5);
		StudentEntity sv7 = new StudentEntity(1, "G", 7.5);
		StudentEntity sv8 = new StudentEntity(1, "H", 3.5);
		StudentEntity sv9 = new StudentEntity(1, "I", 7.5);
		StudentEntity sv10 = new StudentEntity(1, "K", 8.5);
		StudentEntity sv11 = new StudentEntity(1, "M", 9.5);
		// 2. Dua vao mang
		StudentEntity[] arrStudent = new StudentEntity[11];
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
		// 3. Dua du lieu vao mang value object
		StudentsArray arrData = new StudentsArray();
		arrData.setArrStudents(arrStudent);
		arrData.setBtOpt((byte) 0);

		// 4. Goi controller

		StudentController objController = new StudentController();

		int[] vIndexValue = objController.getArrayIndex(arrData);
		System.out.println("Danh sach chi so co diem nho nhat: ");
		for (int i = 0; i < vIndexValue.length; i++) {
			System.out.println(arrStudent[vIndexValue[i]]);
		}

	}

}
