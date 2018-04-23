package com.teacher.Json_module.demoonsite.sava_read_list_object;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.teacher.Json_module.demoonsite.savefile_json_object.Student;

public class ReadListObjectFromJsonFile {

	public static void main(String[] args) {
		// 0 Khai bao doi tuong Jackson
		ObjectMapper objMapper = new ObjectMapper();
		// 1 Hien thi hop thoai de tim file Json
		JFileChooser fileChoooer = new JFileChooser();

		fileChoooer.setDialogTitle("Save a object to json file");

		fileChoooer.setCurrentDirectory(new File("C:\\Users\\dongbh\\Desktop\\FileJson"));

		fileChoooer.setMultiSelectionEnabled(false);

		fileChoooer.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] extensions = new String[] { "JSON", "XML" };
		FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Database json", extensions);
		fileChoooer.setFileFilter(fileFilter);

		// 2. Hien thi hop thoai Open file
		int iOption = fileChoooer.showOpenDialog(null);
		if (iOption == JFileChooser.APPROVE_OPTION) {
			// Lay duong dan de doc
			String filePath = fileChoooer.getSelectedFile().getAbsolutePath();
			try {
				List<Student> lstStudent = objMapper.readValue(new File(filePath), new TypeReference<List<Student>>() {

				});

				// In ra man hinh du lieu tu file

				Iterator<Student> iter = lstStudent.iterator();
				while (iter.hasNext()) {
					System.out.println(iter.next());
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
