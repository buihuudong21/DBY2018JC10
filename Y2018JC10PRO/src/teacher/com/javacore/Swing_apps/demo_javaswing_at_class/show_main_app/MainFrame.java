package teacher.com.javacore.Swing_apps.demo_javaswing_at_class.show_main_app;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Click");
		btnNewButton.setBounds(39, 23, 89, 23);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(257, 24, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblHVTn = new JLabel("Họ và tên");
		lblHVTn.setBounds(182, 27, 65, 14);
		contentPane.add(lblHVTn);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(39, 77, 365, 73);
		contentPane.add(textArea);

		table = new JTable();
		table.setBounds(39, 161, 365, 89);
		contentPane.add(table);
	}
}
