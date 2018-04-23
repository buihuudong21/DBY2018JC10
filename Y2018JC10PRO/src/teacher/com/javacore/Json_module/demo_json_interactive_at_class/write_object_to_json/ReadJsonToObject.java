package teacher.com.javacore.Json_module.demo_json_interactive_at_class.write_object_to_json;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ReadJsonToObject {

	public static void main(String[] args) {
		// Khai báo đối tượng Jackson json
		ObjectMapper objMapper = new ObjectMapper();
		// Show cửa sổ để đọc
		JFileChooser jFileChoose = new JFileChooser();
		jFileChoose.setDialogTitle("Open file"); // tiêu đề của sổ
		// Thiết lập đường dẫn mặc định khi mở hộp thoại
		jFileChoose.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop\\jsonfile"));
		jFileChoose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		String[] arrExtension = new String[] { "json", "xml" };
		// Đưa vào bộ lọc
		FileNameExtensionFilter filters = new FileNameExtensionFilter("DataBase only", arrExtension);
		jFileChoose.setFileFilter(filters);

		// Yêu cầu hiển thị hộp thoại lên (GUI)
		int result = jFileChoose.showOpenDialog(null);
		// Xu ly doc toi file
		if (result == JFileChooser.APPROVE_OPTION) {
			String strPath = jFileChoose.getSelectedFile().getPath();
			try {
				Customer outputCustomer = objMapper.readValue(new File(strPath), Customer.class);
				// write to client

				System.out.println(outputCustomer);

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
