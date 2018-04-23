package teacher.com.javacore.Json_module.demoonsite.show_window_save_open_file;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ShowWindowsSaveFile {

	public static void main(String[] args) {
		// 1. Khai bao doi tuong Chooser
		JFileChooser fileChoooer = new JFileChooser();
		// 2. Thiết lập các tham số cho window show
		// Thiết lập tiêu đề của hộp thoại
		fileChoooer.setDialogTitle("Save file Json");
		// Thiết lập đường dẫn mặc định cho hộp thoại
		fileChoooer.setCurrentDirectory(new File("C:\\Users\\dongbh\\Desktop\\FileJson"));
		// Thiết cho phép chọn multi file
		fileChoooer.setMultiSelectionEnabled(false);
		// Thiết lập cho phép nhìn thấy Thư mục và file trong hộp thoại
		fileChoooer.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		// Thiết lập lọc các file dưới dạng .Json, .XML
		String[] extensions = new String[] { "JSON", "XML" };
		FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Database json", extensions);
		fileChoooer.setFileFilter(fileFilter);
		// 3. Show hop thoai
		int intOptionShow = fileChoooer.showOpenDialog(null);
		if (intOptionShow == JFileChooser.APPROVE_OPTION) {
			System.out.println("Da chap nhan OK");
		}

	}

}
