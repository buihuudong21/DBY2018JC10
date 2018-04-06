package com.teacher.arrays.dynamic_array.samples.Baitoan04;

public class Models {
	// Xu ly viet ham tinh tong tien luong
	public Double totalSalary(ArrayEmployment arrayEmployment) {
		Double dTotalSalary = 0D;
		// Duyet mang da chieu de lay ra tong luong cua cac phan tu
		for (int i = 0; i < arrayEmployment.getArrEmploy().size(); i++) {
			for (int j = 0; j < arrayEmployment.getArrEmploy().get(i).size(); j++) {
				dTotalSalary += arrayEmployment.getArrEmploy().get(i).get(j).getSalary();
			}
		}
		return dTotalSalary;

	}
}

/*
 * 
 * 
 * 
 * { {{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}} }
 * 
 * 
 * 
 * 
 */
