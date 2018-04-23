package teacher.com.javacore.Json_module.demo_json_interactive_at_class.write_read_misc_object;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import teacher.com.javacore.Json_module.demo_json_interactive_at_class.write_object_to_json.Customer;

public class WriteMiscObjectToFile {

	public static void main(String[] args) {
		// 1. Tạo n đối tượng customer để đưa vào mảng
		Customer ct1 = new Customer("Bùi Hữu Đông", 1983, 123456);
		Customer ct2 = new Customer("Nguyễn Đức Vinh", 1980, 10000);
		Customer ct3 = new Customer("Võ Thống", 1983, 5465545);
		Customer ct4 = new Customer("Ma Văn Mèo", 1983, 1250255);

		ArrayList<Customer> lstCustomer = new ArrayList<Customer>();

		lstCustomer.add(ct1);
		lstCustomer.add(ct2);
		lstCustomer.add(ct3);
		lstCustomer.add(ct4);

		// Đưa vào mảng (meta data)
		MetaListCustomer arrCustomer = new MetaListCustomer();
		arrCustomer.setReturnCode(0);
		arrCustomer.setErrorMessage("");
		arrCustomer.setTotalRecord(lstCustomer.size());
		arrCustomer.setData(lstCustomer);
		// Thực hiện write xuống

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

		if (result == JFileChooser.APPROVE_OPTION) {
			// Lấy đường dẫn tới chỗ ta lưu
			File strFile = jFileChoose.getSelectedFile();
			String strPath = strFile.getAbsolutePath();
			// Write to file (customer.json)
			try {
				objMapper.writeValue(new File(strPath), arrCustomer);
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
