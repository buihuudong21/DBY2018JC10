package teacher.com.javacore.XML_module.XML_demo_class.read_file_xml;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class PathFileLib {
	/*
	 * @ Desc: Thư viện cho phép mở cửa sổ để lưu hoặc mở file
	 * 
	 * @ Output: có các phương thức return đường dẫn tới file
	 * 
	 * @ Date:
	 * 
	 * @ Author:
	 */
	private static JFileChooser newInstance() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Chọn file");
		fileChooser.setCurrentDirectory(new File(
				"D:\\Imic\\JavaCore\\Y2018JC10\\git\\Y2018JC10PRO\\src\\teacher\\com\\javacore\\XML_module\\XML_demo_class\\create_file_xml"));
		fileChooser.setMultiSelectionEnabled(false);
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] extensions = new String[] { "json", "xml" };
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Database files", extensions);
		fileChooser.setFileFilter(filter);
		return fileChooser;
	}

	public static File OpenFile() {
		JFileChooser jfileChooser = newInstance();
		int result = jfileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			return jfileChooser.getSelectedFile();
		} else {
			return null;
		}

	}

	public static File SaveFile() {
		JFileChooser jfileChooser = newInstance();
		int result = jfileChooser.showSaveDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			return jfileChooser.getSelectedFile();
		} else {
			return null;
		}

	}

}
