package teacher.com.javacore.XML_module.XML_onsite.writefileXML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Read_XML_Files {

	public static void main(String[] args) {
		try {
			// 1. Mở hộp thoại Open để chọn tới file XML của ta
			File file = FilePath.OpenFilePath();
			if (file != null) {
				// Lấy địa chỉ của File XMLs
				String strFile = file.getAbsolutePath();

				// Khai báo các đối tượng của lớp xử lý XML
				DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
				Document doc = docBuilder.parse(new File(strFile));

				// Làm "mới" lại nội dung XML trong bộ nhớ (RAM)
				doc.getDocumentElement().normalize();

				// Hiển thị tên của rootNode
				System.out.println("Tên của nút gốc: " + doc.getDocumentElement().getNodeName());

				// Tiến hành lấy toàn bộ nội dung của XML
				NodeList nodeList = doc.getElementsByTagName("Student");

				// Lặp để đọc nọi dung trong xml file
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node = nodeList.item(i);
					System.out.println("Tên của node hiện tại: " + node.getNodeName());
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						// Ta tiến hành đọc content bên trong của Node (element)
						Element element = (Element) node;
						// 1. Lấy ra thuộc tính của một node
						System.out.println("Thuộc tính của element: " + element.getAttribute("id"));
						// 2. Lấy ra mã của sinh viên
						System.out.println(
								"Mã sinh viên: " + element.getElementsByTagName("id").item(0).getTextContent());
						// 3. Lấy fullname
						System.out.println(
								"Tên sinh viên: " + element.getElementsByTagName("fullname").item(0).getTextContent());
						// 4. Điểm sinh viên
						System.out.println(
								"Điểm của sinh viên: " + element.getElementsByTagName("mark").item(0).getTextContent());

						System.out.println("=================================================");

					}

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
