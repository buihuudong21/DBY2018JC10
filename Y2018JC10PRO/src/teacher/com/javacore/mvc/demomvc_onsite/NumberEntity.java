package com.teacher.mvc.demomvc_onsite;

public class NumberEntity {
	private double numberA;
	private double numberB;
	private String sOption;

	public NumberEntity() {

	}

	public NumberEntity(double numberA, double numberB, String sOption) {

		this.numberA = numberA;
		this.numberB = numberB;
		this.sOption = sOption;
	}

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

	public String getsOption() {
		return sOption;
	}

	public void setsOption(String sOption) {
		this.sOption = sOption;
	}

}
