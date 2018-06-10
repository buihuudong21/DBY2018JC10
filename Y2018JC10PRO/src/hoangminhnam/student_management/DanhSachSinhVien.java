
package hoangminhnam.student_management;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import hoangminhnam.connect.ConnectDB;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class DanhSachSinhVien extends javax.swing.JFrame {

	ConnectDB con = new ConnectDB();
	Connection cn = con.getConnection();
	ResultSet rs = null;
	PreparedStatement ps = null;

	public DanhSachSinhVien() {
		setForeground(new Color(0, 128, 0));
		setBackground(new Color(0, 128, 0));
		initComponents();
		setLocationRelativeTo(null);
		setTitle("Danh Sách Sinh Viên");
		settable();
		getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void settable() {
		Vector cot = new Vector();
		Vector data = new Vector();
		try {
			cot.addElement("Tên Sinh Viên");
			cot.addElement("Địa Chỉ");
			cot.addElement("Tên Lớp");
			cot.addElement("Số Chứng Minh");
			cot.addElement("Số Điện Thoại");
			cot.addElement("Giới Tính");
			ps = cn.prepareStatement("SELECT * FROM Student where TrangThai = 'C'");
			rs = ps.executeQuery();
			while (rs.next()) {
				Vector dong = new Vector();
				dong.add(rs.getString("name"));
				dong.add(rs.getString("Address"));
				dong.add(rs.getString("className"));
				dong.add(rs.getString("idNumber"));
				dong.add(rs.getString("phoneNumber"));
				dong.add(rs.getString("Gender"));
				data.add(dong);
			}

		} catch (Exception ex) {
			Logger.getLogger(DanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
		}
		jTable1.setModel(new DefaultTableModel(data, cot));
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		btthem = new javax.swing.JButton();
		btsua = new javax.swing.JButton();
		btxoa = new javax.swing.JButton();
		btthoat = new javax.swing.JButton();
		txttimkiem = new javax.swing.JTextField();

		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTable1.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));

		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		btthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hoangminhnam/item/add.png"))); // NOI18N
		btthem.setText("Thêm");
		btthem.setToolTipText("Thêm mới sinh viên");
		btthem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btthemActionPerformed(evt);
			}
		});

		btsua.setIcon(new ImageIcon(getClass().getResource("/hoangminhnam/item/fix.png"))); // NOI18N
		btsua.setText("Sửa");
		btsua.setToolTipText("Sửa thông tin sinh viên");
		btsua.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btsuaActionPerformed(evt);
			}
		});

		btxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hoangminhnam/item/delete.png"))); // NOI18N
		btxoa.setText("Xóa");
		btxoa.setToolTipText("Xóa Sinh Viên");
		btxoa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btxoaActionPerformed(evt);
			}
		});

		btthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hoangminhnam/item/out.png"))); // NOI18N
		btthoat.setText("Thoát");
		btthoat.setToolTipText("Thoát");
		btthoat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btthoatActionPerformed(evt);
			}
		});

		txttimkiem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txttimkiemActionPerformed(evt);
			}
		});
		txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				txttimkiemKeyReleased(evt);
			}
		});

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hoangminhnam/item/finder.png"))); // NOI18N
		jLabel2.setText("Tìm Kiếm");

		JButton btnPrint = new JButton("Print");
		btnPrint.setIcon(new ImageIcon(getClass().getResource("/hoangminhnam/item/in.png")));
		btnPrint.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int a = 0;
				JFileChooser chooser = new JFileChooser();
				int i = chooser.showSaveDialog(chooser);
				if (i == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					try {
						WritableWorkbook wb = Workbook.createWorkbook(file);
						WritableSheet st = wb.createSheet("Report", 0);

						//
						st.addCell(new Label(0, 0, "Danh Sách Sinh Viên "));
						st.addCell(new Label(0, 1, "Tên Sinh Viên"));
						st.addCell(new Label(1, 1, "Địa Chỉ"));
						st.addCell(new Label(2, 1, "Tên Lớp"));
						st.addCell(new Label(3, 1, "Số Chứng Minh"));
						st.addCell(new Label(4, 1, "Số Điện Thoại"));
						st.addCell(new Label(5, 1, "Giới Tính"));

						//
						DefaultTableModel bangdiem = (DefaultTableModel) jTable1.getModel();
						// LÆ°u dá»¯ liá»‡u báº£ng vÃ o máº£ng data[]
						int number = jTable1.getRowCount() * jTable1.getColumnCount();
						String data[] = new String[number];
						for (int j = 0; j < jTable1.getRowCount(); j++) {
							for (int k = 0; k < jTable1.getColumnCount(); k++) {
								data[a] = (String) String.valueOf(jTable1.getValueAt(j, k));
								a++;
							}
						}
						a = 0;
						// Ghi dá»¯ liá»‡u máº£ng data[] vÃ o file
						for (int j = 2; j < jTable1.getRowCount() + 2; j++) {
							for (int k = 0; k < jTable1.getColumnCount(); k++) {
								st.addCell(new Label(k, j, data[a]));
								a++;
							}
						}
						wb.write();
						//
						wb.close();
						//
						JOptionPane.showMessageDialog(null, "Lưu File Thành Công!");
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Lỗi!");
					}
				}

			}
		});

		btnRefesh = new JButton("Refresh");
		btnRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hoangminhnam/item/refresh.png")));
		btnRefesh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Vector cot = new Vector();
				Vector data = new Vector();
				try {
					cot.addElement("Tên Sinh Viên");
					cot.addElement("Địa Chỉ");
					cot.addElement("Tên Lớp");
					cot.addElement("Số Chứng Minh");
					cot.addElement("Số Điện Thoại");
					cot.addElement("Giới Tính");
					ps = cn.prepareStatement("SELECT * FROM Student where TrangThai = 'C'");
					rs = ps.executeQuery();
					while (rs.next()) {
						Vector dong = new Vector();
						dong.add(rs.getString("name"));
						dong.add(rs.getString("Address"));
						dong.add(rs.getString("className"));
						dong.add(rs.getString("idNumber"));
						dong.add(rs.getString("phoneNumber"));
						dong.add(rs.getString("Gender"));
						data.add(dong);
					}

				} catch (Exception ex) {
					Logger.getLogger(DanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
				}
				jTable1.setModel(new DefaultTableModel(data, cot));
			}

		});

		textField = new JTextField();
		textField.setColumns(10);

		textField.hide();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE).addGap(1)
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addGap(81).addComponent(btthem)
						.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
						.addComponent(btsua, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE).addGap(91)
						.addComponent(btxoa, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE).addGap(106)
						.addComponent(btthoat).addGap(96))
						.addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addComponent(btnPrint)
										.addPreferredGap(ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
										.addComponent(txttimkiem, GroupLayout.PREFERRED_SIZE, 135,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 93,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnRefesh)))
								.addContainerGap()))));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(btnPrint)
										.addComponent(txttimkiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel2).addComponent(btnRefesh))
								.addGap(18).addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 258,
										GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(btthem).addComponent(btthoat)
						.addComponent(btxoa).addComponent(btsua))
				.addGap(31)));
		getContentPane().setLayout(layout);

		pack();
	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		int index = jTable1.getSelectedRow();

		textField.setText((String) jTable1.getValueAt(index, 0));

	}

	private void btthoatActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();

	}

	private void btthemActionPerformed(java.awt.event.ActionEvent evt) {

		ThemSinhVien add = new ThemSinhVien();
		add.show();
		this.validate();

	}

	private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {
		SuaSinhVien edit = new SuaSinhVien();
		edit.show();
	}

	private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		if (jTable1.getSelectedRow() == -1) {
			if (jTable1.getRowCount() == 0) {
			} else {

			}
		} else {
			try {

				model.removeRow(jTable1.getSelectedRow());
				JOptionPane.showMessageDialog(this, "Xóa Thành Công: " + textField.getText());
				String ss = "UPDATE dbo.Student SET TRANGTHAI=N'R' WHERE name='" + textField.getText() + "'";

				ps = cn.prepareStatement(ss);

				int rr = ps.executeUpdate();
			} catch (SQLException ex) {

				Logger.getLogger(DanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {
		if (txttimkiem.getText().isEmpty()) {
			settable();
		} else {
			try {
				ps = cn.prepareStatement("SELECT * FROM Student WHERE CHARINDEX ('" + txttimkiem.getText().trim()
						+ "',name)>0 or CHARINDEX ('" + txttimkiem.getText().trim() + "',idnumber)>0");
				rs = ps.executeQuery();
				Vector rowData2;
				String data2[] = { "Tên Sinh Viên", "Địa Chỉ", "Tên Lớp", "Số Chứng Minh", "Số Điện Thoại",
						"Giới Tính" };
				DefaultTableModel model2 = new DefaultTableModel(data2, 0);
				while (rs.next()) {
					rowData2 = new Vector();

					rowData2.add(rs.getString("name"));
					rowData2.add(rs.getString("address"));
					rowData2.add(rs.getString("classname"));
					rowData2.add(rs.getString("idnumber"));
					rowData2.add(rs.getString("phonenumber"));
					rowData2.add(rs.getString("gender"));
					model2.addRow(rowData2);
				}
				jTable1.setModel(model2);
			} catch (SQLException ex) {
				Logger.getLogger(DanhSachSinhVien.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {

	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(DanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DanhSachSinhVien.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DanhSachSinhVien().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btsua;
	private javax.swing.JButton btthem;
	private javax.swing.JButton btthoat;
	private javax.swing.JButton btxoa;
	private javax.swing.JLabel jLabel2;

	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField txttimkiem;
	private JButton btnRefesh;
	private JTextField textField;
}
