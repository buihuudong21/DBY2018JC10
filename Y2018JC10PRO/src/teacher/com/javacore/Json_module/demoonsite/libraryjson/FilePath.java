package com.teacher.Json_module.demoonsite.libraryjson;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class FilePath {
	// 1. Tao ra mot phuong thuc tinh => return JFileChooser

	@SuppressWarnings("unused") // anotation
	private static JFileChooser newInstanceJFileChooser() {

		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Chọn file");
		fileChooser.setCurrentDirectory(new File("."));
		fileChooser.setMultiSelectionEnabled(false);
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] extensions = new String[] { "json", "xml" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Database files", extensions);
		fileChooser.setFileFilter(filter);
		return fileChooser;
	}

	// 2. Tra ra mot doi tuong File (Save file)

	@SuppressWarnings("unused")
	public static File SaveFilePath() {
		// Khoi tao JFileChooser
		JFileChooser fileChooser = newInstanceJFileChooser();
		// Hien thi hop thoai
		int resultFile = fileChooser.showSaveDialog(null);

		if (resultFile == JFileChooser.APPROVE_OPTION) {
			return fileChooser.getSelectedFile();

		} else {
			return null;
		}

	}
	// 3. Tra ra mot doi tuong File (Open file)

	@SuppressWarnings("unused")
	public static File OpenFilePath() {
		JFileChooser fileChooser = newInstanceJFileChooser();
		int resultFile = fileChooser.showOpenDialog(null);
		if (resultFile == JFileChooser.APPROVE_OPTION) {
			return fileChooser.getSelectedFile();
		} else {
			return null;
		}

	}

}
