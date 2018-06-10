package teacher.com.javacore.Swing_apps.Sample02_combobox;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ComboxCountry extends JFrame {
	private String[] countryList = { "Việt Nam", "USA", "Trung Quốc", "Nhật Bản", "Hàn Quốc", "Triều Tiên" };
	// chứa ảnh của các tổng thống
	/*
	 * private ImageIcon[] imageIcon = { new ImageIcon(
	 * "D:\\git\\Y2017JC85DB\\Y2017JC85PRO\\src\\com\\teacher\\Swing_apps\\image/VietNam_President.jpg"
	 * ), new ImageIcon(
	 * "D:\\git\\Y2017JC85DB\\Y2017JC85PRO\\src\\com\\teacher\\Swing_apps\\image/USA_President.jpg"
	 * ), new ImageIcon(
	 * "D:\\git\\Y2017JC85DB\\Y2017JC85PRO\\src\\com\\teacher\\Swing_apps\\image/China_President.jpg"
	 * ), new ImageIcon(
	 * "D:\\git\\Y2017JC79DB\\Y2017JC79PRO\\src\\Teacher\\Y2017JC79\\Swing_apps\\image/Japan_President.jpg"
	 * ), new ImageIcon(
	 * "D:\\git\\Y2017JC79DB\\Y2017JC79PRO\\src\\Teacher\\Y2017JC79\\Swing_apps\\image/Hanquoc_President.jpg"
	 * ), new ImageIcon(
	 * "D:\\git\\Y2017JC79DB\\Y2017JC79PRO\\src\\Teacher\\Y2017JC79\\Swing_apps\\image/Trieutien_President.jpg")
	 * };
	 */

	private JPanel contentPane;

	// private JComboBox<String> jcbo = new JComboBox<>(countryList);
	private JLabel jlableImage = new JLabel();
	private JComboBox<String> jcbo = new JComboBox<>(countryList);

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ComboxCountry() {
		jcbo.addItem("Thụy Điển");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		jlableImage.setBounds(50, 76, 478, 235);
		// contentPane.add(jlableImage);
		contentPane.add(jlableImage, JPanel.CENTER_ALIGNMENT);
		setContentPane(contentPane);

		jcbo.setBounds(130, 16, 311, 26);
		contentPane.add(jcbo);
		setLocationRelativeTo(null);
		setDisplay(0);

		jcbo.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				setDisplay(jcbo.getSelectedIndex());
			}
		});
		setVisible(true);

	}

	public void setDisplay(int index) {
		contentPane.setLayout(new BorderLayout(5, 5));
		// jlableImage.setIcon(imageIcon[index]);

	}

}
