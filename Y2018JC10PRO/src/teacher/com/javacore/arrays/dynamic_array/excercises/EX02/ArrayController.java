package com.teacher.arrays.dynamic_array.excercises.EX02;

public class ArrayController {
	private ArrayModel mModel;

	public ArrayController() {
		mModel = new ArrayModel();
	}

	public double Sum(ArrayEntity objEntity) {
		return mModel.SumElements(objEntity);
	}
}
