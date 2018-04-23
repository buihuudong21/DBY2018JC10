package com.teacher.Json_module.demoonsite.sava_read_list_object;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

import com.teacher.Json_module.demoonsite.savefile_json_object.Student;

public class WriteListObjectToJson {

	public static void main(String[] args) {
		// 1. Ta tao ra danh sach cac sinh vien
		List<Student> lstStudent = new ArrayList<>();

		lstStudent.add(new Student(100, "Mai Tai Phen", 8.5));
		lstStudent.add(new Student(200, "Ly Lien Kiet", 3.5));
		lstStudent.add(new Student(300, "Dam Vinh Hung", 4.5));
		lstStudent.add(new Student(400, "Lam Tam Nhu", 6.5));
		lstStudent.add(new Student(500, "Ly Hien Long", 9.5));
		lstStudent.add(new Student(600, "Ma Van Meo", 2.5));
		// 2. Goi hop thoai luu
		JFileChooser fileChoooer = new JFileChooser();

		fileChoooer.setDialogTitle("Save a object to json file");

		fileChoooer.setCurrentDirectory(new File("C:\\Users\\dongbh\\Desktop\\FileJson"));

		fileChoooer.setMultiSelectionEnabled(false);

		fileChoooer.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] extensions = new String[] { "JSON", "XML" };
		FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Database json", extensions);
		fileChoooer.setFileFilter(fileFilter);

		int intOption = fileChoooer.showSaveDialog(null);

		if (intOption == JFileChooser.APPROVE_OPTION) {
			// Lay duong dan file de luu
			String filePath = fileChoooer.getSelectedFile().getAbsolutePath();
			try {
				new ObjectMapper().writeValue(new File(filePath), lstStudent);
				JOptionPane.showMessageDialog(null, "Da luu thanh cong !", "Luu file", JOptionPane.OK_OPTION);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

}
