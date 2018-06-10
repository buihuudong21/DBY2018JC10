package minhthuan.com.code.final_excersise;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	private List<Student> studentsList;
	private String[] colNames = { "Stt", "Ho va Ten", "Dia chi", "Ten Lop", "So chung minh", "So dien thoai" };

	public TableModel() {
		studentsList = new ArrayList<Student>();

	}

	@Override
	public String getColumnName(int column) {
		return this.colNames[column];
	}

	@Override
	public int getColumnCount() {

		return NumberConstant.NUM_OF_COLUMN;
	}

	@Override
	public int getRowCount() {

		return this.studentsList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student student = this.studentsList.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return student.getStt();
		case 1:
			return student.getsFullName();
		case 2:
			return student.getsAddress();
		case 3:
			return student.getsClass();
		case 4:
			return student.getsLicense();
		case 5:
			return student.getsPhoneNumber();

		default:
			return null;
		}
	}

	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

	public void updateTable() {
		fireTableDataChanged();
	}

}
