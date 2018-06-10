package minhthuan.com.code.demofinal;

import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ute extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ute frame = new ute();
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
	public ute() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(196, 199, 4, 22);
		contentPane.add(textArea);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(110, 58, 28, 20);
		contentPane.add(comboBox);
		JCheckBox chckbxNewCheckBox = new JCheckBox("Nam");
		chckbxNewCheckBox.setBounds(146, 122, 97, 23);
		contentPane.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Nu");
		chckbxNewCheckBox_1.setBounds(265, 122, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);

		textField = new JTextField();
		textField.setBounds(191, 42, 86, 53);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(40, 11, 64, 14);
		contentPane.add(lblNewLabel);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(83, 179, 77, 42);
		contentPane.add(textArea_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(225, 180, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
	}
}
