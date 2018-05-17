package teacher.com.javacore.Swing_apps.Sample03_Jtable;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class MainFrameTable extends JFrame {

	private JPanel contentPane;
	private String[] columnNames = { "Country", "Capital", "Population in Millions", "Democracy" };
	private Object[][] data = { { "USA", "Washington DC", 280, true }, { "Canada", "Ottawa", 32, true },
			{ "United Kingdom", "London", 60, true }, { "Germany", "Berlin", 83, true },
			{ "France", "Paris", 60, true }, { "Norway", "Oslo", 4.5, true }, { "India", "New Delhi", 1046, true },
			{ "Norway", "Oslo", 4.5, true }, { "India", "New Delhi", 1046, true }, { "Norway", "Oslo", 4.5, true },
			{ "India", "New Delhi", 1046, true }, { "Norway", "Oslo", 4.5, true }, { "India", "New Delhi", 1046, true },
			{ "Norway", "Oslo", 4.5, true }, { "India", "New Delhi", 1046, true }, { "Norway", "Oslo", 4.5, true },
			{ "India", "New Delhi", 1046, true }, { "Norway", "Oslo", 4.5, true }, { "India", "New Delhi", 1046, true },
			{ "Norway", "Oslo", 4.5, true }, { "India", "New Delhi", 1046, true }, { "Norway", "Oslo", 4.5, true },
			{ "India", "New Delhi", 1046, true }, { "Norway", "Oslo", 4.5, true }, { "India", "New Delhi", 1046, true },
			{ "Norway", "Oslo", 4.5, true }, { "India", "New Delhi", 1046, true }, { "Norway", "Oslo", 4.5, true },
			{ "India", "New Delhi", 1046, true }, { "Norway", "Oslo", 4.5, true },
			{ "India", "New Delhi", 1046, true } };
	private JTable jTable1 = new JTable(data, columnNames);

	/**
	 * Create the frame.
	 */
	public MainFrameTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 853, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// jTable1.setGridColor(Color.BLUE);
		// jTable1.setSelectionForeground(Color.BLACK);

		add(new JScrollPane(jTable1));
		setVisible(true);
		this.setLocationRelativeTo(null);

	}

}
