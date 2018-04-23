package teacher.com.javacore.Json_module.demo_json_interactive_at_class.showwindow;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ShowWindow {

	public static void main(String[] args) {
		// Tạo đối tượng cửa sổ (JOptionPane)
		JFileChooser jFileChoose = new JFileChooser();
		jFileChoose.setDialogTitle("Save as"); // tiêu đề của sổ
		// Thiết lập đường dẫn mặc định khi mở hộp thoại
		jFileChoose.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop\\jsonfile"));
		jFileChoose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] arrExtension = new String[] { "json", "xml" };
		// Đưa vào bộ lọc
		FileNameExtensionFilter filters = new FileNameExtensionFilter("DataBase only", arrExtension);
		jFileChoose.setFileFilter(filters);

		// Yêu cầu hiển thị hộp thoại lên (GUI)
		int result = jFileChoose.showSaveDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {
			// Lấy đường dẫn tới chỗ ta lưu
			File strFile = jFileChoose.getSelectedFile();
			String strPath = strFile.getAbsolutePath();

			System.out.println(strPath);

		}

	}

}
