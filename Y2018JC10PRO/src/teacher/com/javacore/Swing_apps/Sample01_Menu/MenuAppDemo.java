package teacher.com.javacore.Swing_apps.Sample01_Menu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuAppDemo extends JFrame implements ActionListener {
	private JTextField jtfNum01, jtfNum02, jtfResult;
	private JButton jbtAdd, jbtSub, jbtMul, jbtDiv;
	private JMenuItem jmiAdd, jmiSub, jmiMul, jmiDiv, jmiClose;

	public MenuAppDemo() {
		JMenuBar jmb = new JMenuBar();
		this.setJMenuBar(jmb);
		JMenu operationMenu = new JMenu("Operation");
		operationMenu.setEnabled(true);
		operationMenu.setMnemonic('O');
		jmb.add(operationMenu);
		this.setSize(808, 205);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Menu exit
		JMenu exitMenu = new JMenu("Close");
		jmb.add(exitMenu);

		//
		operationMenu.add(jmiAdd = new JMenuItem("Add", 'A'));
		operationMenu.add(jmiSub = new JMenuItem("Subtract", 'S'));
		operationMenu.add(jmiMul = new JMenuItem("Multiply", 'M'));
		operationMenu.add(jmiDiv = new JMenuItem("Divide", 'D'));
		exitMenu.add(jmiClose = new JMenuItem("Close", 'C'));

		// jmiAdd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
		// ActionEvent.CTRL_MASK));
		// jmiSub.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
		// ActionEvent.CTRL_MASK));
		// jmiMul.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,
		// ActionEvent.CTRL_MASK));
		// jmiDiv.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,
		// ActionEvent.CTRL_MASK));

		JPanel p1 = new JPanel(new FlowLayout());

		p1.add(new JLabel("Number 1"));
		p1.add(jtfNum01 = new JTextField(5));
		p1.add(new JLabel("Number 2"));
		p1.add(jtfNum02 = new JTextField(5));
		p1.add(new JLabel("Result"));
		p1.add(jtfResult = new JTextField(6));
		jtfResult.setEditable(false);

		JPanel p2 = new JPanel(new FlowLayout());
		p2.add(jbtAdd = new JButton("Add"));
		p2.add(jbtSub = new JButton("Subtract"));
		p2.add(jbtMul = new JButton("Multiply"));
		p2.add(jbtDiv = new JButton("Divide"));

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(p1, BorderLayout.CENTER);
		getContentPane().add(p2, BorderLayout.SOUTH);

		jmiClose.addActionListener(this);
		jmiAdd.addActionListener(this);
		jmiMul.addActionListener(this);
		jmiSub.addActionListener(this);
		jmiDiv.addActionListener(this);

		jbtAdd.addActionListener(this);
		jbtSub.addActionListener(this);
		jbtMul.addActionListener(this);
		jbtDiv.addActionListener(this);
	}

	private void calculate(char c) {
		int num01 = Integer.parseInt(jtfNum01.getText().trim());
		int num02 = Integer.parseInt(jtfNum02.getText().trim());
		int result = 0;
		switch (c) {
		case '+':
			result = num01 + num02;
			break;
		case '-':
			result = num01 - num02;
			break;
		case '*':
			result = num01 * num02;
			break;
		case '/':
			result = num01 / num02;
			break;
		default:
			result = 0;
			break;
		}
		jtfResult.setText(String.valueOf(result));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.jmiClose) {
			int iObt = JOptionPane.showConfirmDialog(this.getParent(), "Do you want to close this form?",
					"Close window", JOptionPane.OK_CANCEL_OPTION);
			if (iObt == JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		} else if (e.getSource() == this.jbtAdd) {
			calculate('+');
		} else if (e.getSource() == this.jbtSub) {
			calculate('-');
		} else if (e.getSource() == this.jbtMul) {
			calculate('*');
		} else if (e.getSource() == this.jbtDiv) {
			calculate('/');
		}
	}

}
