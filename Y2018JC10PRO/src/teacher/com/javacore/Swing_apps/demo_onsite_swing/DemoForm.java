package teacher.com.javacore.Swing_apps.demo_onsite_swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DemoForm extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoForm frame = new DemoForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Add");

		//
		// btnNewButton.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// Double numA = Double.parseDouble(textField.getText());
		// Double numB = Double.parseDouble(textField_1.getText());
		// Double KQ = numA + numB;
		// textField_2.setText(KQ.toString());
		//
		// }
		// });

		btnNewButton.addActionListener(this);

		btnNewButton.setBounds(160, 158, 115, 29);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Closed");
		btnNewButton_1.setBounds(316, 158, 115, 29);
		contentPane.add(btnNewButton_1);

		textField = new JTextField();
		textField.setName("txtNumA");
		textField.setBounds(101, 38, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setName("TxtNumB");
		textField_1.setBounds(369, 38, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setName("TxtKq");
		textField_2.setBounds(236, 98, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblSoA = new JLabel("So A");
		lblSoA.setBounds(15, 41, 69, 20);
		contentPane.add(lblSoA);

		JLabel lblSoB = new JLabel("So B");
		lblSoB.setBounds(290, 41, 69, 20);
		contentPane.add(lblSoB);

		JLabel lblKetQua = new JLabel("Ket Qua");
		lblKetQua.setBounds(124, 101, 69, 20);
		contentPane.add(lblKetQua);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Double numA = Double.parseDouble(textField.getText());
		Double numB = Double.parseDouble(textField_1.getText());
		Double KQ = numA + numB;
		textField_2.setText(KQ.toString());
	}
}
