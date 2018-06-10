package minhthuan.com.code.final_excersise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class TablePanel extends JPanel {
	private JTable studentsTable;
	private TableModel tableModel;

	public TablePanel() {
		intitalizeVariable();
		initalizeLayout();
		initalizeHeaderAlignment();
		intitalizeTableAlignment();
	}

	private void intitalizeTableAlignment() {
		DefaultTableCellRenderer tableCellRenderer = new DefaultTableCellRenderer();
		tableCellRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		this.studentsTable.getColumnModel().getColumn(0).setCellRenderer(tableCellRenderer);
		this.studentsTable.getColumnModel().getColumn(1).setCellRenderer(tableCellRenderer);
		this.studentsTable.getColumnModel().getColumn(2).setCellRenderer(tableCellRenderer);
		this.studentsTable.getColumnModel().getColumn(3).setCellRenderer(tableCellRenderer);
		this.studentsTable.getColumnModel().getColumn(4).setCellRenderer(tableCellRenderer);
		this.studentsTable.getColumnModel().getColumn(5).setCellRenderer(tableCellRenderer);
	}

	private void initalizeHeaderAlignment() {
		DefaultTableCellRenderer headerCellRenderer = new DefaultTableCellRenderer();
		headerCellRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		headerCellRenderer.setBackground(Color.orange);
		this.studentsTable.getTableHeader().setDefaultRenderer(headerCellRenderer);
	}

	private void intitalizeVariable() {
		this.tableModel = new TableModel();
		this.studentsTable = new JTable(tableModel);

	}

	private void initalizeLayout() {
		this.setLayout(new BorderLayout());
		this.setBorder(new EmptyBorder(10, 30, 10, 30));
		this.add(new JScrollPane(studentsTable), BorderLayout.CENTER);
	}

	public void updateTable() {
		this.tableModel.updateTable();
	}

	public void setTableModel(List<Student> studentsList) {
		this.tableModel.setStudentsList(studentsList);
	}
}
