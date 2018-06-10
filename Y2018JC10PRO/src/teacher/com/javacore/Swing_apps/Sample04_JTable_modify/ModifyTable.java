package teacher.com.javacore.Swing_apps.Sample04_JTable_modify;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class ModifyTable extends JFrame {
	private String[] columnNames = { "Stt", "Ho ten", "Dia chi", "Ten Lop", "So chung minh", "So dien thoai" };

	private Object[][] rowData = {
			{ "1", "Bui Huu Dong", "Huynh Tan Phat-Q7-TPHCM", "Y2018JC10", "1323464", "012545455" },
			{ "2", "Nguyen Huynh Minh Thuan", "Ton Dan-Q4-TPHCM", "Y2018JC10", "4554546", "057494221" },
			{ "3", "Bui Huu", " Tan Phat-Q7-TPHCM", "Y2018JC10", "1364", "012545" },
			{ "4", "Bui  Dong", "Huynh -Q7-TPHCM", "Y2018JC10", "1334", "012545" } };

	private DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames);
	private JTable jTable1 = new JTable(tableModel);
	private JButton jbtAddRow = new JButton("Add New Row");
	private JButton jbtAddColumn = new JButton("Add New Column");
	private JButton jbtDeleteRow = new JButton("Delete Selected Row");
	private JButton jbtDeleteColumn = new JButton("Delete Selected Column");
	private JButton jbtSave = new JButton("Save");
	private JButton jbtClear = new JButton("Clear");
	private JButton jbtRestore = new JButton("Restore");
	private JComboBox jcboSelectionMode = new JComboBox(
			new String[] { "SINGLE_SELECTION", "SINGLE_INTERVAL_SELECTION", "MULTIPLE_INTERVAL_SELECTION" });
	private JCheckBox jchkRowSelectionAllowed = new JCheckBox("RowSelectionAllowed", true);
	private JCheckBox jchkColumnSelectionAllowed = new JCheckBox("ColumnSelectionAllowed", false);

	public ModifyTable() {
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 2));
		panel1.add(jbtAddRow);
		panel1.add(jbtAddColumn);
		panel1.add(jbtDeleteRow);
		panel1.add(jbtDeleteColumn);
		JPanel panel2 = new JPanel();
		panel2.add(jbtSave);
		panel2.add(jbtClear);
		panel2.add(jbtRestore);
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout(5, 0));
		panel3.add(new JLabel("Selection Mode"), BorderLayout.WEST);
		panel3.add(jcboSelectionMode, BorderLayout.CENTER);
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel4.add(jchkRowSelectionAllowed);
		panel4.add(jchkColumnSelectionAllowed);
		JPanel panel5 = new JPanel();
		panel5.setLayout(new GridLayout(2, 1));
		panel5.add(panel3);
		panel5.add(panel4);

		JPanel panel6 = new JPanel();
		panel6.setLayout(new BorderLayout());
		panel6.add(panel1, BorderLayout.SOUTH);
		panel6.add(panel2, BorderLayout.CENTER);

		getContentPane().add(panel5, BorderLayout.NORTH);
		getContentPane().add(new JScrollPane(jTable1), BorderLayout.CENTER);
		getContentPane().add(panel6, BorderLayout.SOUTH);
		jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jbtAddRow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jTable1.getSelectedRow() >= 0)
					tableModel.insertRow(jTable1.getSelectedRow(), new Vector());
				else
					tableModel.addRow(new Vector());

			}
		});
		jbtAddColumn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("New Column Name");
				tableModel.addColumn(name, new java.util.Vector());
			}
		});
		jbtDeleteRow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (jTable1.getSelectedRow() >= 0) {
					tableModel.removeRow(jTable1.getSelectedRow());
				}

			}
		});
		jbtDeleteColumn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (jTable1.getSelectedRow() >= 0) {
					TableColumnModel columnModel = jTable1.getColumnModel();
					TableColumn tableColumn = columnModel.getColumn(jTable1.getSelectedColumn());
					columnModel.removeColumn(tableColumn);
				}
			}
		});
		jbtSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tablemodel.dat"));
					out.writeObject(tableModel.getDataVector());
					out.writeObject(getColumnNames());
					out.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		jbtClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tableModel.setRowCount(0);
			}
		});
		jbtRestore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ObjectInputStream in = new ObjectInputStream(new FileInputStream("tablemodel.dat"));
					Vector rowData = (Vector) in.readObject();
					Vector columnNames = (Vector) in.readObject();
					tableModel.setDataVector(rowData, columnNames);
					in.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}
		});
		jchkRowSelectionAllowed.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTable1.setRowSelectionAllowed(jchkRowSelectionAllowed.isSelected());

			}
		});
		jchkColumnSelectionAllowed.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTable1.setColumnSelectionAllowed(jchkColumnSelectionAllowed.isSelected());

			}
		});
		jcboSelectionMode.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String selectedItem = (String) jcboSelectionMode.getSelectedItem();
				if (selectedItem.equals("SINGLE_SELECTION")) {
					jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

				} else if (selectedItem.equals("SINGLE_INTERVAL_SELECTION"))
					jTable1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				else if (selectedItem.equals("MULTIPLE_INTERVAL_SELECTION"))
					jTable1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			}
		});

		setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
	}

	private Vector getColumnNames() {
		Vector<String> columnNames = new Vector<String>();
		for (int i = 0; i < jTable1.getColumnCount(); i++) {
			columnNames.add(jTable1.getColumnName(i));
		}
		return columnNames;
	}
}
