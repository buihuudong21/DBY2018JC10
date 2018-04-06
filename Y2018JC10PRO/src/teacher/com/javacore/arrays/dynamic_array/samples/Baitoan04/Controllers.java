package com.teacher.arrays.dynamic_array.samples.Baitoan04;

public class Controllers {
	private Models model;

	public Controllers() {
		model = new Models();
	}

	public Double sumSalary(ArrayEmployment arrayEmployment) {
		return model.totalSalary(arrayEmployment);
	}

}
