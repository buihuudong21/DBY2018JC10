package com.teacher.Json_module.demoonsite.savefile_json_misc_object;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.codehaus.jackson.map.ObjectMapper;

import com.teacher.Json_module.demoonsite.libraryjson.FilePath;

public class Write_File_Misc_Object {

	public static void main(String[] args) {
		// 0. Khai bao
		EmployeeMetaData arrData = new EmployeeMetaData();
		List<Employee> lstEmp = new ArrayList<Employee>();

		// 1. Tao ra Cac doi tuong employee
		Employee emp1 = new Employee();

		emp1.setId(100);
		emp1.setsFullName("Tran Dong Vy");
		emp1.setSalary(1000);
		emp1.setAddress(new Address(1, "7A", "Hem 144 - Huynh Tan Phat - Quan 7 - TPHCM"));

		Employee emp2 = new Employee();

		emp2.setId(100);
		emp2.setsFullName("Nguyen Thang");
		emp2.setSalary(4000);
		emp2.setAddress(new Address(2, "8A", "Hem 145 - Huynh Tan Phat - Quan 7 - TPHCM"));

		Employee emp3 = new Employee();

		emp3.setId(100);
		emp3.setsFullName("Nguyen Mau Hoang Sang");
		emp3.setSalary(5000);
		emp3.setAddress(new Address(3, "145/4", "Hem 145 - Phan Dang Luu - Quan Binh Thanh - TPHCM"));

		// 2. Add vao List emp
		lstEmp.add(emp1);
		lstEmp.add(emp2);
		lstEmp.add(emp3);
		// 3. Add vao Meta data
		arrData.setReturnCode(0);
		arrData.setErrorMessage(null);
		arrData.setTotalRecord(lstEmp.size());
		arrData.setData(lstEmp);
		// 4. Tien hanh Write doi tuong misc ra file json (employees.json)

		File files = FilePath.SaveFilePath();
		if (files != null) {
			// 1 Lay duong dan file
			String strFile = files.getAbsolutePath();
			// 2 Khoi tao doi tuong ObjectMapper

			ObjectMapper objMapper = new ObjectMapper();
			try {
				objMapper.writeValue(new File(strFile), arrData);
				JOptionPane.showMessageDialog(null, "Da ghi file thanh cong !");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
