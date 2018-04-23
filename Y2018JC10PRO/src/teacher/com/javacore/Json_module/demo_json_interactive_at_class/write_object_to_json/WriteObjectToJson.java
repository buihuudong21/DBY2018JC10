package teacher.com.javacore.Json_module.demo_json_interactive_at_class.write_object_to_json;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class WriteObjectToJson {

	public static void main(String[] args) {
		// 1. Hiển thị cửa sổ để chọn nơi lưu file // Tạo đối tượng cửa sổ (JOptionPane)
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
		// 2. Tạo đối tượng trong thư viện Jackson để gọi hàm write xuống file
		ObjectMapper objMapper = new ObjectMapper();

		// 3. Tạo đối tượng customer => write to json
		Customer customer = new Customer("Bùi Hữu Đông", 1983, 12542);

		if (result == JFileChooser.APPROVE_OPTION) {
			// Lấy đường dẫn tới chỗ ta lưu
			File strFile = jFileChoose.getSelectedFile();
			String strPath = strFile.getAbsolutePath();
			// Write to file (customer.json)
			try {
				objMapper.writeValue(new File(strPath), customer);
				// Hien thi hop thoi bao ok?
				JOptionPane.showMessageDialog(null, "Đã lưu thành công");

			} catch (JsonGenerationException e) {

				e.printStackTrace();
			} catch (JsonMappingException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
