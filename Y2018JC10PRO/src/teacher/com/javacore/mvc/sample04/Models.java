package com.teacher.mvc.sample04;

public class Models {
	public boolean CheckElement(NumberEntity obj) {
		return (obj.getiNumber() % 2 == 0) ? true : false;
	}
}
