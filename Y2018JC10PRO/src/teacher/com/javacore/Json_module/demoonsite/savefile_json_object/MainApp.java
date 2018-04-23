package com.teacher.Json_module.demoonsite.savefile_json_object;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.map.ObjectMapper;

public class MainApp {

	public static void main(String[] args) {
		// 0. Khao doi tuong trong thu vien Jackson...
		ObjectMapper objMapper = new ObjectMapper();
		// 1. Khoi tao 1 doi tuong
		Student student = new Student(100, "Kim Jong Un", 9.5);

		// 2. Mo hop thoai den browse toi thu muc ma ta can luu

		JFileChooser fileChoooer = new JFileChooser();

		fileChoooer.setDialogTitle("Save a object to json file");

		fileChoooer.setCurrentDirectory(new File("C:\\Users\\dongbh\\Desktop\\FileJson"));

		fileChoooer.setMultiSelectionEnabled(false);

		fileChoooer.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] extensions = new String[] { "JSON", "XML" };
		FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Database json", extensions);
		fileChoooer.setFileFilter(fileFilter);

		// 3. Chon hop thoai duong dang Save
		int iOption = fileChoooer.showSaveDialog(null);

		if (iOption == JFileChooser.APPROVE_OPTION) {
			// Lay duong dan cua thu muc can luu
			File file = fileChoooer.getSelectedFile();
			String filePath = file.getAbsolutePath();
			// Thuc hien luu vao file do ta dat ten
			try {

				objMapper.writeValue(new File(filePath), student);
				// Hien thi hop thoai thong bao
				JOptionPane.showMessageDialog(null, "Da luu thanh cong !", "Luu file", JOptionPane.OK_OPTION);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
