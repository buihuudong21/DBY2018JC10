package com.teacher.Json_module.demoonsite.savefile_json_misc_object;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.teacher.Json_module.demoonsite.libraryjson.FilePath;

public class Read_Misc_From_JsonFIle {
	public static void main(String[] args) {
		// 1. Khai bao doi tuong Mapper
		ObjectMapper objMapper = new ObjectMapper();
		// 2. Mo cua so
		File file = FilePath.OpenFilePath();
		if (file != null) {
			try {
				EmployeeMetaData lstData = objMapper.readValue(new File(file.getPath()), EmployeeMetaData.class);

				System.out.println("Return code " + lstData.getReturnCode());
				System.out.println("Message err code " + lstData.getErrorMessage());
				System.out.println("Total Record " + lstData.getTotalRecord());

				// Write ra console
				Iterator<Employee> iter = lstData.getData().iterator();
				while (iter.hasNext()) {
					System.out.println(iter.next());
				}

			} catch (JsonParseException e) {

				e.printStackTrace();
			} catch (JsonMappingException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
