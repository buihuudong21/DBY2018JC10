package teacher.com.javacore.XML_module.XML_demo_class.read_file_xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList; //DOM (Document Object Model)

/*
 * Desc: Đọc dữ liệu từ file XML  có cấu trúc cho trước
 * */
public class Read_File_XML {

	public static void main(String[] args) {
		try {
			// 1. Mở cửa sổ để đọc file
			File pathFile = PathFileLib.OpenFile();
			String file;
			if (pathFile != null) {
				file = pathFile.getPath();
				// 2. Gọi tới thư viện của Java (Built-in)
				DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder documentBuilder = docBuilderFactory.newDocumentBuilder();
				// Bắt đọc vào file với đường dẫn mà ta đã lấy được
				Document doc = documentBuilder.parse(new File(file));
				// 3. Tiến hành parser từ doc (đã chứa nội dùng của file XML)
				// System.out.println(doc.getDocumentElement().getNodeName());

				// 4. Lấy tập các object từ document ra biến
				NodeList list = doc.getElementsByTagName("customer");
				// 5. Lấy chi tiết từng phần tử từ "list"
				// System.out.println(list.getLength());

				for (int i = 0; i < list.getLength(); i++) {
					Node node = list.item(i);
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						// Đọc các thành phần dữ liệu con bên trong một node (object)
						Element element = (Element) node; // Để đọc vào từng element
						// System.out.println(element.getNodeValue());
						// a. Lấy ra custid
						displayInfor(i, element);
					}

				}

			} else {
				System.out.println("Bạn đã hủy");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void displayInfor(int i, Element element) {
		System.out.println("ID của KH thứ " + (i + 1) + " là: " + element.getAttribute("id"));
		System.out.println(
				"Mã KH thứ " + (i + 1) + " là: " + element.getElementsByTagName("custid").item(0).getTextContent());
		System.out.println(
				"Tên KH thứ " + (i + 1) + " là: " + element.getElementsByTagName("custname").item(0).getTextContent());

		System.out.println("Lương của KH thứ " + (i + 1) + " là: "
				+ element.getElementsByTagName("salary").item(0).getTextContent());

		System.out.println("==========================================");
	}

}
