
package hoangminhnam.student_management;

import java.awt.Color;
import java.awt.SystemColor;
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
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import hoangminhnam.connect.ConnectDB;

public class SuaSinhVien extends javax.swing.JFrame {

	ConnectDB con = new ConnectDB();
	Connection cn = con.getConnection();
	ResultSet rs = null;
	PreparedStatement ps = null;

	public SuaSinhVien() {
		setForeground(new Color(0, 128, 0));
		setBackground(new Color(0, 128, 0));
		initComponents();
		setLocation(253, 100);
		setTitle("Danh Sách Sinh Viên");
		settable();
		getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(911, 592);
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
			Logger.getLogger(SuaSinhVien.class.getName()).log(Level.SEVERE, null, ex);
		}
		jTable1.setModel(new DefaultTableModel(data, cot));
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		btsua = new javax.swing.JButton();
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

		btsua.setIcon(new ImageIcon(getClass().getResource("/hoangminhnam/item/save.png"))); // NOI18N
		btsua.setText("Lưu");
		btsua.setToolTipText("lưu");
		btsua.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btsuaActionPerformed(evt);
			}
		});

		btthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hoangminhnam/item/out.png"))); // NOI18N
		btthoat.setText("Thoát");
		btthoat.setToolTipText("thoát");
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

		textName = new JTextField();
		textName.setColumns(10);

		textAdd = new JTextField();
		textAdd.setColumns(10);

		textLop = new JTextField();
		textLop.setColumns(10);

		textCMND = new JTextField();
		textCMND.setColumns(10);

		textPhone = new JTextField();
		textPhone.setColumns(10);

		textSex = new JTextField();
		textSex.setColumns(10);

		JLabel lblTnSinhVin = new JLabel("Tên Sinh Viên");

		JLabel lblaCh = new JLabel("Địa Chỉ");

		JLabel lblTnLp = new JLabel("Tên Lớp");

		JLabel lblCmnd = new JLabel("CMND");

		JLabel lblSinThoi = new JLabel("Số Điện Thoại");

		JLabel lblGiiTnh = new JLabel("Giới Tính");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(10)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(txttimkiem, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(232).addComponent(btsua).addGap(179)
										.addComponent(btthoat))
								.addGroup(layout.createSequentialGroup().addGap(72)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblaCh, GroupLayout.PREFERRED_SIZE, 64,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblTnLp, GroupLayout.PREFERRED_SIZE, 64,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblTnSinhVin))
										.addGap(37)
										.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(textLop).addComponent(textAdd).addComponent(textName,
														GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
										.addGap(82)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblSinThoi, GroupLayout.PREFERRED_SIZE, 111,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblGiiTnh, GroupLayout.PREFERRED_SIZE, 97,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCmnd, GroupLayout.PREFERRED_SIZE, 64,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(textSex).addComponent(textPhone).addComponent(textCMND,
														GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(134, Short.MAX_VALUE))))
				.addGroup(layout.createSequentialGroup().addGap(26)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 834, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(29, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2).addComponent(txttimkiem,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(20).addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textCMND, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCmnd)
						.addComponent(textName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTnSinhVin))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(lblaCh)
						.addComponent(textAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSinThoi).addComponent(textPhone, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(lblTnLp)
						.addComponent(textLop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGiiTnh).addComponent(textSex, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(btsua).addComponent(btthoat))
				.addGap(26)));
		getContentPane().setLayout(layout);

		// pack();
	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		int index = jTable1.getSelectedRow();

		textName.setText((String) jTable1.getValueAt(index, 0));
		textAdd.setText((String) jTable1.getValueAt(index, 1));
		textLop.setText((String) jTable1.getValueAt(index, 2));
		textCMND.setText((String) jTable1.getValueAt(index, 3));
		textPhone.setText((String) jTable1.getValueAt(index, 4));
		textSex.setText((String) jTable1.getValueAt(index, 5));

	}

	private void btthoatActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();

	}

	private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		if (jTable1.getSelectedRow() == -1) {
			if (jTable1.getRowCount() == 0) {
			} else {
			}
		} else {
			String ss = "UPDATE Student SET name=?,address=?,classname=?,idnumber=?,phonenumber=?,gender=?,TRANGTHAI=? WHERE name='"
					+ textName.getText() + "'";
			int rr = 0;
			try {
				ps = cn.prepareStatement(ss);

				ps.setString(1, textName.getText());
				ps.setString(2, textAdd.getText());
				ps.setString(3, textLop.getText());
				ps.setString(4, textCMND.getText());
				ps.setString(5, textPhone.getText());
				ps.setString(6, textSex.getText());
				ps.setString(7, "C");
				rr = ps.executeUpdate();

				model.setValueAt(textName.getText(), jTable1.getSelectedRow(), 0);
				model.setValueAt(textAdd.getText(), jTable1.getSelectedRow(), 1);
				model.setValueAt(textLop.getText(), jTable1.getSelectedRow(), 2);
				model.setValueAt(textCMND.getText(), jTable1.getSelectedRow(), 3);
				model.setValueAt(textPhone.getText(), jTable1.getSelectedRow(), 4);
				model.setValueAt(textSex.getText(), jTable1.getSelectedRow(), 5);

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
				Logger.getLogger(SuaSinhVien.class.getName()).log(Level.SEVERE, null, ex);
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
			java.util.logging.Logger.getLogger(SuaSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SuaSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SuaSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SuaSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SuaSinhVien().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btsua;
	private javax.swing.JButton btthoat;
	private javax.swing.JLabel jLabel2;

	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField txttimkiem;
	private JTextField textName;
	private JTextField textAdd;
	private JTextField textLop;
	private JTextField textCMND;
	private JTextField textPhone;
	private JTextField textSex;
}
