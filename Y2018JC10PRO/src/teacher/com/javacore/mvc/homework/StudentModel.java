package com.teacher.mvc.homework;

public class StudentModel {
	// 1. Tim ra diem lon nhat cua cac sinh vien
	public double findMaxValue(StudentsArray o) {
		double dResult = 0;
		// 1. Khai bao mang du lieu sinh vien
		StudentEntity[] arrStudent = o.getArrStudents();
		// 2. Thuc hien tim diem lon nhat
		dResult = arrStudent[0].getdMark();

		for (int i = 1; i < arrStudent.length; i++) {
			if (arrStudent[i].getdMark() > dResult) {
				dResult = arrStudent[i].getdMark();
			}
		}

		return dResult;
	}

	// 2. Tim ra diem nho nhat cua cac sinh vien
	public double findMinValue(StudentsArray o) {
		double dResult = 0;
		// 1. Khai bao mang du lieu sinh vien
		StudentEntity[] arrStudent = o.getArrStudents();
		// 2. Thuc hien tim diem lon nhat
		dResult = arrStudent[0].getdMark();

		for (int i = 1; i < arrStudent.length; i++) {
			if (arrStudent[i].getdMark() < dResult) {
				dResult = arrStudent[i].getdMark();
			}
		}

		return dResult;
	}

	// 3. Phuong thu tra ra danh chi so lon nhat or nho nhat

	public int[] getListIndexMinOrMax(StudentsArray o) {
		int[] vIndexReturn = null;

		// 1. Lay ra list cac sv tu mang sinh vien
		StudentEntity[] arrStudent = o.getArrStudents();
		// 2. So dem xem co bao nhieu SV co diem thap or diem cao
		int iCount = 0;
		// 3. Khai bao va khoi tao mang chua sv co diem cao nhat or thap nhat
		int[] vIndexTemp = new int[arrStudent.length];
		// 4. Thuc hien tim chi so max or min
		for (int i = 0; i < arrStudent.length; i++) {
			if (arrStudent[i].getdMark() == o.getdMarkMaxorMin()) {
				vIndexTemp[iCount] = i;
				iCount++;

			}
		}
		// 5. Khoi tao lai so luong phan tu cua mang tra ra
		vIndexReturn = new int[iCount];
		System.arraycopy(vIndexTemp, 0, vIndexReturn, 0, iCount);
		// 6. Return ra ket qua

		return vIndexReturn;
	}

}
