package minhthuan.com.code.final_excersise;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private IMainFrameController mainFrameCotroller;
	private TablePanel tablePanel;
	// private JPanel jPanel;
	// private JPanel jPanelButton;
	//
	// JButton btnCalculator = new JButton("Tính lãi");
	//
	// public void MainAppFrame() {
	//
	// jPanel = new JPanel(new GridLayout(5, 2)); // Tạo đối tượng JPanel
	//
	// jPanelButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	//
	// // Đưa đối tượng jPanel vào Frame
	//
	// this.add(jPanel, BorderLayout.CENTER);
	// // add jpanel2 vao frame
	// this.add(jPanelButton, BorderLayout.SOUTH);
	//
	// this.jPanelButton.add(new JButton("Làm lại"));
	// this.jPanelButton.add(btnCalculator);
	//
	// this.setLocationRelativeTo(null);
	// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//
	// this.setVisible(true); // Cho phep hien thi
	// this.pack();
	// }

	public MainFrame() {
		super(StringConstant.APP_NAME);
		contructAppWindow();
		setJMenuBar(new CreateMenuBar(this));
		initalizeVariable();
		// MainAppFrame();
		contructLayout();
		refreshTable();

	}

	public void refreshTable() {
		List<Student> students = this.mainFrameCotroller.getAllStudents();
		this.tablePanel.setTableModel(students);
		this.tablePanel.updateTable();

	}

	private void contructLayout() {
		this.setLayout(new BorderLayout());
		this.add(tablePanel, BorderLayout.CENTER);
	}

	private void initalizeVariable() {
		this.mainFrameCotroller = new MainFrameControllerImpl();
		this.tablePanel = new TablePanel();

	}

	private void contructAppWindow() {
		this.setSize(NumberConstant.APP_WINDOW_SIZE_WIDTH, NumberConstant.APP_WINDOW_SIZE_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
