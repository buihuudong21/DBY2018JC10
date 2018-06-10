
package hoangminhnam.student_management;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import hoangminhnam.connect.ConnectDB;

public class ThemLop extends javax.swing.JFrame {
	private Border lineBorder = BorderFactory.createLineBorder(Color.blue);
	ConnectDB con = new ConnectDB();
	Connection cn = con.getConnection();
	ResultSet rs = null;
	PreparedStatement ps = null;

	public ThemLop() {
		getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		setBackground(SystemColor.inactiveCaptionBorder);

		setTitle("Thêm Lớp");
		initComponents();
		setResizable(true);
		setSize(825, 301);

		setLocationRelativeTo(null);
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(SystemColor.inactiveCaptionBorder);
		jPanel1.setBorder(lineBorder);
		lbName = new javax.swing.JLabel();
		lbAddress = new javax.swing.JLabel();
		lbIdNumber = new javax.swing.JLabel();
		tfName = new javax.swing.JTextField();
		tfAddress = new javax.swing.JTextField();
		tfIdNumber = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		lbName.setText("Tên Lơps");

		lbAddress.setText("Chuyên Ngành");

		lbIdNumber.setText("Khoa");
		ButtonGroup btg = new ButtonGroup();

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(90)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lbAddress, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lbName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(lbIdNumber, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(tfIdNumber, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
						.addComponent(tfAddress, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
						.addComponent(tfName, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
				.addGap(67)));
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
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(tfIdNumber,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbIdNumber))
				.addGap(134)));
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
				tfAddress.setText("");

			}
		});
		jbtClose = new javax.swing.JButton();

		jbtClose.setText("Thoát");
		jbtClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hoangminhnam/item/out.png")));
		jbtClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();
				;
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(55).addComponent(jPanel1,
										GroupLayout.PREFERRED_SIZE, 692, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(134).addComponent(jbtSave).addGap(135)
										.addComponent(jbtCancel).addGap(138).addComponent(jbtClose)))
						.addContainerGap(62, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(37)
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
								.addGap(38)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(jbtCancel)
										.addComponent(jbtClose).addComponent(jbtSave))
								.addContainerGap(153, Short.MAX_VALUE)));
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
		try {
			String stdName = tfName.getText();
			String stdAddress = tfAddress.getText();
			String stdIdNumber = tfIdNumber.getText();

			ps = cn.prepareStatement("INSERT INTO [dbo].[Class] VALUES" + "(N'" + stdName + "',N'" + stdAddress + "',N'"
					+ stdIdNumber + "')");
			int rr = ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Đã thêm lớp :" + tfName.getText());
		} catch (SQLException e) {

			e.printStackTrace();
		}
		DanhSachSinhVien ds = new DanhSachSinhVien();
		ds.validate();

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
			java.util.logging.Logger.getLogger(ThemLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ThemLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ThemLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ThemLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ThemLop().setVisible(true);

			}
		});
	}

	private javax.swing.JButton jbtSave;
	private javax.swing.JButton jbtCancel;
	private javax.swing.JButton jbtClose;
	private javax.swing.JLabel lbName;
	private javax.swing.JLabel lbAddress;
	private javax.swing.JLabel lbIdNumber;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField tfName;
	private javax.swing.JTextField tfAddress;
	private javax.swing.JTextField tfIdNumber;

}
