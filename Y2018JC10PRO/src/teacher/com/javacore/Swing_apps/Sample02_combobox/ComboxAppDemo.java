package teacher.com.javacore.Swing_apps.Sample02_combobox;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboxAppDemo extends JFrame {
	// Hiển thị tên tổng thống/chủ tịch của từng quốc gia
	private String[] countryList = { "Việt Nam", "USA", "Trung Quốc", "Nhật Bản", "Hàn Quốc", "Triều Tiên" };
	// chứa ảnh của các tổng thống
	private ImageIcon[] imageIcon = { new ImageIcon("image/VietNam_President.jpg"),
			new ImageIcon("image/USA_President.jpg"), new ImageIcon("image/China_President.jpg"),
			new ImageIcon("image/Japan_President.jpg"), new ImageIcon("image/Hanquoc_President.jpg"),
			new ImageIcon("image/Trieutien_President.jpg") };

	private JComboBox<String> jcbo;
	private JPanel descriptionPanel = new JPanel();
	private JLabel jlableImage = new JLabel();

	public ComboxAppDemo() {

		this.descriptionPanel.add(jlableImage);
		setDisplay(0);
		this.add(jcbo, BorderLayout.NORTH);
		this.add(descriptionPanel, BorderLayout.CENTER);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		jcbo = new JComboBox<String>(countryList);
		setDisplay(0);
		this.setVisible(true);

	}

	public void setDisplay(int index) {
		descriptionPanel.setLayout(new BorderLayout(15, 15));
		jlableImage.setIcon(imageIcon[index]);

	}
}
