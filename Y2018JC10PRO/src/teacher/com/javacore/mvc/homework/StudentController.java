package com.teacher.mvc.homework;

public class StudentController {

	private StudentModel studentModels;

	public StudentController() {
		studentModels = new StudentModel();
	}

	public int[] getArrayIndex(StudentsArray o) {
		switch (o.getBtOpt()) {
		case 0: // Tim Min
			o.setdMarkMaxorMin(studentModels.findMinValue(o));
			break;
		case 1: // tim Max
			o.setdMarkMaxorMin(studentModels.findMaxValue(o));
			break;
		}
		return studentModels.getListIndexMinOrMax(o);

	}

}
