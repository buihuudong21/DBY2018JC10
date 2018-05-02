package teacher.com.javacore.XML_module.XML_onsite.writefileXML;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Write_Object_To_XML_File {

	public static void main(String[] args) {
		// 1. Di xay dung doi tuong du lieu de chuan bi write xuong file duoi dang XML
		StudentMetaData arrData = new StudentMetaData();

		List<Student> lstStudent = new ArrayList<>();
		Student sv1 = new Student(1, "01", "Nguyen Van A", 8.5);
		Student sv2 = new Student(2, "02", "Nguyen Van B", 7.5);
		Student sv3 = new Student(3, "03", "Nguyen Van C", 6.5);
		Student sv4 = new Student(4, "04", "Nguyen Van D", 5.5);
		Student sv5 = new Student(5, "05", "Nguyen Van E", 4.5);
		lstStudent.add(sv1);
		lstStudent.add(sv2);
		lstStudent.add(sv3);
		lstStudent.add(sv4);
		lstStudent.add(sv5);
		// 2. Lay duong dan de luu file
		File file = FilePath.SaveFilePath();
		if (file != null) {
			// Fill thong tin du lieu vao Metadata
			arrData.setmLisStudent(lstStudent);
			arrData.setsFileName(file.getAbsolutePath());

			// Thuc hien write xuong xml file
			try {
				writeDataToXML(arrData);
				JOptionPane.showMessageDialog(null, "Da ghi file XML thanh cong !");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	private static void writeDataToXML(StudentMetaData arrData) {
		// Bat dau code for write XML
		try {
			// 1. Khoi tao document XML
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			// 2. Tao ra khuon dang cua file XML
			Document doc = docBuilder.newDocument();
			// 3. Tao ra nut goc (rootNode)
			Element rootNode = doc.createElement("Students");
			doc.appendChild(rootNode);

			// 4. Fill cac Element (node con) vao trong file XML
			for (Student objStudent : arrData.getmLisStudent()) {
				// Khoi tao cac phan tu

				// student elements
				Element student = doc.createElement("Student");
				rootNode.appendChild(student);

				// Thiết lập attribute cho student element
				Attr attr = doc.createAttribute("Id");
				attr.setValue("" + objStudent.getId());
				student.setAttributeNode(attr);

				// RollNo Elements
				Element rollNo = doc.createElement("RollNo");
				rollNo.appendChild(doc.createTextNode(objStudent.getRollNo()));
				student.appendChild(rollNo);

				// FullName Elements
				Element fullName = doc.createElement("FullName");
				fullName.appendChild(doc.createTextNode(objStudent.getFullName()));
				student.appendChild(fullName);

				// Mark Elements
				Element mark = doc.createElement("Mark");
				mark.appendChild(doc.createTextNode("" + objStudent.getMark()));
				student.appendChild(mark);

			}
			// 5. Thuc hien ghi file tu bo nho trong (RAM) xuong file vat ly.
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			// StreamResult result = new StreamResult(objMetadata.getsFileName());

			StreamResult result = new StreamResult(new File(arrData.getsFileName()));
			// Ghi du lieu xuong file
			transformer.transform(source, result);

		} catch (Exception e) {

		}
	}

}
