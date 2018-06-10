
package hoangminhnam.student_management;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;

import hoangminhnam.connect.ConnectDB;

public class ThemSinhVien extends javax.swing.JFrame {
	private Border lineBorder = BorderFactory.createLineBorder(Color.blue);
	ConnectDB con = new ConnectDB();
	Connection cn = con.getConnection();
	ResultSet rs = null;
	PreparedStatement ps = null;

	public ThemSinhVien() {
		getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		setBackground(SystemColor.inactiveCaptionBorder);

		setTitle("Thêm Sinh Viên");
		initComponents();
		setResizable(true);
		setSize(825, 430);

		setLocationRelativeTo(null);
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(SystemColor.inactiveCaptionBorder);
		jPanel1.setBorder(lineBorder);
		lbName = new javax.swing.JLabel();
		lbAddress = new javax.swing.JLabel();
		lbIdNumber = new javax.swing.JLabel();
		lbPhoneNumber = new javax.swing.JLabel();
		lbGender = new javax.swing.JLabel();
		lbClassName = new javax.swing.JLabel();
		tfName = new javax.swing.JTextField();
		tfAddress = new javax.swing.JTextField();
		tfIdNumber = new javax.swing.JTextField();
		tfPhoneNumber = new javax.swing.JTextField();
		rdbFemale = new javax.swing.JRadioButton();
		rdbMale = new javax.swing.JRadioButton();
		cbClass = new javax.swing.JComboBox<>();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		lbName.setText("Họ Và Tên");

		lbAddress.setText("Địa Chỉ");

		lbIdNumber.setText("Số Chứng Minh");

		lbPhoneNumber.setText("Số Điện Thoại");

		lbGender.setText("Giới Tính");

		lbClassName.setText("Lớp Học");

		rdbFemale.setText("Nữ");
		rdbMale.setText("Nam");
		ButtonGroup btg = new ButtonGroup();
		btg.add(rdbFemale);
		btg.add(rdbMale);

		// xá»­ lÃ½ combo box
		List<String> list = new ArrayList<>();
		try {
			String sql = "select Name from Class";
			Statement statement = cn.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				list.add(resultSet.getString("Name"));
			}
			for (String item : list) {
				cbClass.addItem(item);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(90)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lbPhoneNumber, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lbAddress, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lbName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lbIdNumber, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
								.addComponent(lbClassName, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbGender, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
								.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(tfPhoneNumber, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
										.addComponent(tfIdNumber, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
										.addComponent(tfAddress, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 421,
												Short.MAX_VALUE)
										.addComponent(tfName, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
								.addGap(67))
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false).addGroup(
										Alignment.LEADING,
										jPanel1Layout.createSequentialGroup().addComponent(rdbMale)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(rdbFemale))
										.addComponent(cbClass, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 125,
												GroupLayout.PREFERRED_SIZE)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(lbName).addComponent(
						tfName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lbAddress))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfIdNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lbIdNumber))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfPhoneNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lbPhoneNumber))
				.addGap(29)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(lbGender)
						.addComponent(rdbMale).addComponent(rdbFemale))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(cbClass,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbClassName))
				.addGap(21)));
		jPanel1.setLayout(jPanel1Layout);
		jbtSave = new javax.swing.JButton();

		jbtSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hoangminhnam/item/save.png")));

		jbtSave.setText("Lưu");
		jbtSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btthemActionPerformed(evt);
			}
		});
		jbtCancel = new javax.swing.JButton();
		jbtCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hoangminhnam/item/delete.png")));

		jbtCancel.setText("Hủy");
		jbtCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfName.setText("");
				tfIdNumber.setText("");
				tfPhoneNumber.setText("");
				tfAddress.setText("");
				cbClass.setSelectedItem(null);
			}
		});
		jbtClose = new javax.swing.JButton();

		jbtClose.setText("Thoát");
		jbtClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hoangminhnam/item/out.png")));
		jbtClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				;
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap(124, Short.MAX_VALUE).addComponent(jbtSave)
						.addGap(158).addComponent(jbtCancel).addGap(145).addComponent(jbtClose).addGap(159))
				.addGroup(layout.createSequentialGroup().addGap(55)
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 692, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(62, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(37)
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jbtSave)
										.addComponent(jbtCancel).addComponent(jbtClose))
								.addContainerGap(23, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		// pack();
	}// </editor-fold>

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btthemActionPerformed(java.awt.event.ActionEvent evt) {

		String stdName = tfName.getText();
		String stdAddress = tfAddress.getText();
		String stdIdNumber = tfIdNumber.getText();
		String stdPhoneNumber = tfPhoneNumber.getText();
		// String tt = "ChÆ°a XÃ³a";

		// gender
		String stdgender = "";
		if (rdbFemale.isSelected()) {
			stdgender = "Nữ";
		} else {
			stdgender = "Nam";
		}
		// Class
		String stdClass = cbClass.getSelectedItem().toString();
		//
		try {
			ps = cn.prepareStatement("INSERT [dbo].[Student] VALUES" + "(N'" + stdName + "',N'" + stdAddress + "','"
					+ stdClass + "','" + stdIdNumber + "','" + stdPhoneNumber + "',N'" + stdgender + "','C')");
			int rr = ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Đã thêm sinh viên : " + tfName.getText());
		} catch (SQLException e) {

			e.printStackTrace();
		}

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
			java.util.logging.Logger.getLogger(ThemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ThemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ThemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ThemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ThemSinhVien().setVisible(true);

			}
		});
	}

	private javax.swing.JButton jbtSave;
	private javax.swing.JButton jbtCancel;
	private javax.swing.JButton jbtClose;
	private javax.swing.JComboBox<String> cbClass;
	private javax.swing.JLabel lbName;
	private javax.swing.JLabel lbAddress;
	private javax.swing.JLabel lbIdNumber;
	private javax.swing.JLabel lbPhoneNumber;
	private javax.swing.JLabel lbGender;
	private javax.swing.JLabel lbClassName;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JRadioButton rdbFemale;
	private javax.swing.JRadioButton rdbMale;
	private javax.swing.JTextField tfName;
	private javax.swing.JTextField tfAddress;
	private javax.swing.JTextField tfIdNumber;
	private javax.swing.JTextField tfPhoneNumber;

}
