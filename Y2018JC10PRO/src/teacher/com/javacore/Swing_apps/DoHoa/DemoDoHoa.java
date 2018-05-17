package teacher.com.javacore.Swing_apps.DoHoa;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DemoDoHoa extends JFrame {

	private JPanel contentPane;
	private JTextField tfxNum01;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoDoHoa frame = new DemoDoHoa();
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
	public DemoDoHoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(15, 16, 533, 104);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNum = new JLabel("Num 01:");
		lblNum.setBounds(95, 0, 63, 20);
		panel.add(lblNum);

		tfxNum01 = new JTextField();
		tfxNum01.setBounds(180, -3, 146, 26);
		panel.add(tfxNum01);
		tfxNum01.setColumns(10);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Giá trị của Form là: " + tfxNum01.getText());
			}
		});
		btnNewButton.setBounds(87, 157, 115, 29);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(217, 157, 115, 29);
		contentPane.add(btnNewButton_1);
	}
}
