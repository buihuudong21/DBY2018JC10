package com.teacher.mvc.homework;

public class StudentEntity {
	private int id;
	private String sName;
	private double dMark;

	public StudentEntity() {

	}

	public StudentEntity(int id, String sName, double dMark) {

		this.id = id;
		this.sName = sName;
		this.dMark = dMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", sName=" + sName + ", dMark=" + dMark + "]";
	}

}
