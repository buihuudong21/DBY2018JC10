package teacher.com.javacore.XML_module.XML_demo_class.write_file_XML;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import teacher.com.javacore.XML_module.XML_demo_class.read_file_xml.PathFileLib;

public class Write_Object_To_File_XML {

	public static void main(String[] args) {
		try {
			// 1. Mở cửa sổ để lấy đường dẫn để lưu
			File file = PathFileLib.SaveFile();
			if (file != null) {
				String strFile = file.getAbsolutePath();

				// 2. Tạo ra một mảng chứa các đối tượng KH

				CustomerMetaData customerMetaData = new CustomerMetaData();
				List<Customer> arrData = new ArrayList<Customer>();
				Customer c1 = new Customer(1, "Bùi Hữu Đông", 123456);
				Customer c2 = new Customer(2, "Trần Văn Mèo", 123456);
				Customer c3 = new Customer(3, "Lâm Xung", 123423456);
				Customer c4 = new Customer(4, "Võ Tòng", 12345456);
				Customer c5 = new Customer(5, "Tống Giang", 12346456);
				Customer c6 = new Customer(6, "Lý Mạc Sầu", 123234456);
				Customer c7 = new Customer(7, "Năm Cam", 122343456);
				arrData.add(c1);
				arrData.add(c1);
				arrData.add(c2);
				arrData.add(c3);
				arrData.add(c4);
				arrData.add(c5);
				arrData.add(c6);
				arrData.add(c7);

				// Đưa mảng customer vào MetaData
				customerMetaData.setArrCustomer(arrData);
				customerMetaData.setStrPath(strFile);
				// 3. Ghi xuống file XML
				writeObjecToXML(customerMetaData);

			}

		} catch (Exception e) {

		}
	}

	public static void writeObjecToXML(CustomerMetaData arrMetaData) {
		try {
			// 1. Khoi tao document XML
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			// 2. Tao ra khuon dang cua file XML
			Document doc = docBuilder.newDocument(); // => được một document "empty"
			// 3. Bắt đầu ghi xuống
			Element rootNode = doc.createElement("customers");
			doc.appendChild(rootNode);

			for (Customer element : arrMetaData.getArrCustomer()) {
				Element customer = doc.createElement("customer");
				rootNode.appendChild(customer);
				// Đưa giá trị vào từng node con
				Element custid = doc.createElement("custid");
				custid.appendChild(doc.createTextNode(String.valueOf(element.getCustid())));
				customer.appendChild(custid);
				// Name
				Element custname = doc.createElement("custname");
				custname.appendChild(doc.createTextNode(element.getCustname()));
				customer.appendChild(custname);
				// Salary
				Element salary = doc.createElement("salary");
				salary.appendChild(doc.createTextNode(String.valueOf(element.getSalary())));
				customer.appendChild(salary);

			}
			// 4. Thực hiện việc write dữ liệu nằm troing rootNode (RAM) xuống file vật lý.

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			StreamResult result = new StreamResult(new File(arrMetaData.getStrPath()));
			// Ghi du lieu xuong file
			transformer.transform(source, result);
			System.out.println("Đã write thành công");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
