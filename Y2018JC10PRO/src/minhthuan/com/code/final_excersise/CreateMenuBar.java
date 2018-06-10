package minhthuan.com.code.final_excersise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class CreateMenuBar extends JMenuBar implements ActionListener, IAddStudentCallBack {
	private JMenu fileMenu = null;
	private JMenuItem openItem = null;
	private JMenuItem exitItem = null;

	private JMenu student = null;
	private JMenuItem addItem = null;
	private JMenuItem removeItem = null;

	private JMenu view = null;
	private JMenu help = null;

	private AddStudentForm addStudentForm = null;
	private MainFrame mainFrame = null;

	public CreateMenuBar(MainFrame parentFrame) {
		fileMenu = new JMenu(StringConstant.MAIN_MENU_FILE);
		openItem = new JMenuItem(StringConstant.MAIN_MENU_OPEN);
		exitItem = new JMenuItem(StringConstant.MAIN_MENU_EXIT);

		fileMenu.add(openItem);
		fileMenu.add(exitItem);
		student = new JMenu(StringConstant.MAIN_MENU_STUDENT);
		addItem = new JMenuItem(StringConstant._MAIN_MENU_ADD_STUDENT);
		removeItem = new JMenuItem(StringConstant._MAIN_MENU_REMOVE_STUDENT);

		student.add(addItem);
		student.add(removeItem);

		view = new JMenu(StringConstant.MAIN_MENU_VIEW);
		help = new JMenu(StringConstant.MAIN_MENU_HELP);

		this.add(fileMenu);
		this.add(student);
		this.add(view);
		this.add(help);
		openItem.addActionListener(this);
		exitItem.addActionListener(this);
		addItem.addActionListener(this);

		addStudentForm = new AddStudentForm(parentFrame);

		this.mainFrame = parentFrame;
		setCallBack();
	}

	private void setCallBack() {
		this.addStudentForm.setCallBack(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exitItem) {
			int action = JOptionPane.showConfirmDialog(getParent(), StringConstant.MAIN_MENU_EXIT_TEXT,
					StringConstant.MAIN_MENU_EXIT_TITLE, JOptionPane.OK_CANCEL_OPTION);
			if (action == JOptionPane.OK_OPTION) {
				System.gc();
				System.exit(0);
			}
		} else if (e.getSource() == addItem) {
			addStudentForm.setVisible(true);
		}

	}

	@Override
	public void studentSaved() {
		this.mainFrame.refreshTable();

	}

}
