package com.teacher.arrays.dynamic_array.examples.example01;

import java.util.List;

public class Controllers {
	private Models m_objModel;

	public Controllers() {
		m_objModel = new Models();
	}

	public double TotalDouble(List<List<Double>> lisDouble) {
		return m_objModel.TotalElements(lisDouble);
	}

	public double TotalProduct(List<List<Product>> lisProduct) {
		return m_objModel.TotalProductElements(lisProduct);
	}
}
