package teacher.com.javacore.XML_module.XML_onsite.writefileXML;

import java.util.List;

public class StudentMetaData {
	private List<Student> mLisStudent; // Danh sach cac sinh vien
	private String sFileName; // Duong dan de luu file

	public List<Student> getmLisStudent() {
		return mLisStudent;
	}

	public void setmLisStudent(List<Student> mLisStudent) {
		this.mLisStudent = mLisStudent;
	}

	public String getsFileName() {
		return sFileName;
	}

	public void setsFileName(String sFileName) {
		this.sFileName = sFileName;
	}
}
