package teacher.com.javacore.Swing_apps.demo_javaswing_at_class.demo_show_frame_gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class MainAppFrame extends JFrame {

	// 1. Định nghĩa các đối tượng mà nó chứa
	// JPanel
	private JPanel jPanel;
	private JPanel jPanelButton;
	// private JLabel jLabelIntRate = new JLabel("Lãi suất(theo năm): ");
	// private JTextField jTextFieldIntRate = new JTextField();
	//
	// private JLabel jLabelNumberOfYear = new JLabel("Số năm tính lãi: ");
	// private JTextField jTextFieldNumberOfYear = new JTextField();
	//
	// private JLabel jLabelBalance = new JLabel("Số nợ vay: ");
	// private JTextField jTextFieldBalance = new JTextField();
	//
	// private JLabel jLabelMonthlyInterest = new JLabel("Lãi trả hàng tháng: ");
	// private JTextField jTextFieldMonthlyInterest = new JTextField();
	//
	// private JLabel jLabelTotalInterest = new JLabel("Tổng lãi phải trả: ");
	// private JTextField jTextFieldTotalInterest = new JTextField();

	// Button
	JButton btnCalculator = new JButton("Tính lãi");

	// Thiet lap thuoc tinh cho Frame
	public MainAppFrame() {

		// Xử lý với JPanel
		jPanel = new JPanel(new GridLayout(5, 2)); // Tạo đối tượng JPanel
		jPanel.setBorder(new TitledBorder("Tính lãi tiền vay theo lãi suất năm"));

		jPanelButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));

		// Đưa đối tượng jPanel vào Frame

		this.add(jPanel, BorderLayout.CENTER);
		// add jpanel2 vao frame
		this.add(jPanelButton, BorderLayout.SOUTH);

		this.jPanelButton.add(new JButton("Làm lại"));
		this.jPanelButton.add(btnCalculator);

		// Add các đối tượng vào JPanel
		// this.jPanel.add(jLabelIntRate);
		// this.jPanel.add(jTextFieldIntRate);
		//
		// this.jPanel.add(jLabelNumberOfYear);
		// this.jPanel.add(jTextFieldNumberOfYear);
		//
		// this.jPanel.add(jLabelBalance);
		// this.jPanel.add(jTextFieldBalance);
		//
		// this.jPanel.add(jLabelMonthlyInterest);
		// this.jPanel.add(jTextFieldMonthlyInterest);
		//
		// this.jPanel.add(jLabelTotalInterest);
		// this.jPanel.add(jTextFieldTotalInterest);

		// this.setTitle("The first programing java swing");
		// this.setSize(600, 500); // Thiet lap do rong va do cai cho Frame
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true); // Cho phep hien thi
		this.pack();
		// btnCalculator.addActionListener(this);
		// Xử lý khi click vào nút "tính"
		// btnCalculator.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// // Tính toán nghiệp vụ ở đây
		// // Define biến lưu lãi suất
		// Double dblIntRate = Double.parseDouble(jTextFieldIntRate.getText());
		// Double dblBalance = Double.parseDouble(jTextFieldBalance.getText());
		// Integer numberOfYear = Integer.parseInt(jTextFieldNumberOfYear.getText());
		//
		// Loan loan = new Loan();
		// loan.setIntrate(dblIntRate);
		// loan.setBalance(dblBalance);
		// loan.setNumberOfYear(numberOfYear);
		// // Hiển thị ra giao diện
		// // jTextFieldMonthlyInterest.setText("");
		// jTextFieldMonthlyInterest.setText(String.format("%.2f",
		// loan.getMonthlyInterest()));
		// jTextFieldTotalInterest.setText(String.format("%.2f",
		// loan.getTotalinterest()));
		// }
		// });

	}

	// @Override
	// public void actionPerformed(ActionEvent e) {
	// if (e.getSource() == btnCalculator) {
	// // Define biến lưu lãi suất
	// Double dblIntRate = Double.parseDouble(jTextFieldIntRate.getText());
	// Double dblBalance = Double.parseDouble(jTextFieldBalance.getText());
	// Integer numberOfYear = Integer.parseInt(jTextFieldNumberOfYear.getText());
	//
	// Loan loan = new Loan();
	// loan.setIntrate(dblIntRate);
	// loan.setBalance(dblBalance);
	// loan.setNumberOfYear(numberOfYear);
	// // Hiển thị ra giao diện
	// // jTextFieldMonthlyInterest.setText("");
	// jTextFieldMonthlyInterest.setText(String.format("%.2f",
	// loan.getMonthlyInterest()));
	// jTextFieldTotalInterest.setText(String.format("%.2f",
	// loan.getTotalinterest()));
	//
	// }
	//
	// }

}
