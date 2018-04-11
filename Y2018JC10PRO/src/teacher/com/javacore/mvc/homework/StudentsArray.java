package com.teacher.mvc.homework;

public class StudentsArray {
	private StudentEntity[] arrStudents;
	private double dMarkMaxorMin;
	private byte btOpt; // 0: tim min, 1: tim max;

	public StudentsArray() {
		// TODO Auto-generated constructor stub
	}

	public StudentEntity[] getArrStudents() {
		return arrStudents;
	}

	public void setArrStudents(StudentEntity[] arrStudents) {
		this.arrStudents = arrStudents;
	}

	public double getdMarkMaxorMin() {
		return dMarkMaxorMin;
	}

	public void setdMarkMaxorMin(double dMarkMaxorMin) {
		this.dMarkMaxorMin = dMarkMaxorMin;
	}

	public byte getBtOpt() {
		return btOpt;
	}

	public void setBtOpt(byte btOpt) {
		this.btOpt = btOpt;
	}

}
