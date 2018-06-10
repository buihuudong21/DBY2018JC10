package minhthuan.com.code.final_excersise;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AddClassForm extends JDialog implements ActionListener {
	private JButton saveButton;
	private JButton resetButton;
	private JButton closeButton;
	private JLabel classLable, specialLable, departmentLable;
	private JTextField classField, specialField, departmentField;

	public AddClassForm(JFrame parentFrame) {
		super(parentFrame, StringConstant.CLASS_FROM_TITLE, false);
		initalizesVariable();
		constructLayout();
		setWindow(parentFrame);
	}

	private void constructLayout() {
		JPanel studentInfoPanel = new JPanel();
		JPanel buttonPanel = new JPanel();

		Border spaceBorder = BorderFactory.createEmptyBorder(15, 15, 15, 15);
		Border titleBorder = BorderFactory.createTitledBorder(StringConstant.STUDENT_FORM_SUBTITLE);

		studentInfoPanel.setBorder(BorderFactory.createCompoundBorder(spaceBorder, titleBorder));
		studentInfoPanel.setLayout(new GridLayout(6, 2));
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridy = 0;
		Insets rightPadding = new Insets(0, 0, 0, 15);
		Insets noPadding = new Insets(0, 0, 0, 0);
		// ============ Dong 1 ================
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(classLable, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(classField, gc);

		// =========== Dong 2 ================
		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(specialLable, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(specialField, gc);
		// =========== Dong 3 ==================
		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 1;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(departmentLable, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(departmentField, gc);

		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(saveButton);
		buttonPanel.add(resetButton);
		buttonPanel.add(closeButton);

		// tu dong thay doi do dai cua nut
		Dimension btnsize = closeButton.getPreferredSize();
		saveButton.setSize(btnsize);
		resetButton.setSize(btnsize);

		// Dua 2 JPanel vao form add

		this.setLayout(new BorderLayout());
		this.add(studentInfoPanel, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.SOUTH);

	}

	private void setWindow(JFrame parentFrame) {
		setSize(NumberConstant.STUDENT_FORM_WINDOW_WIDTH, NumberConstant.STUDENT_FORM_WINDOW_HEIGHT);
		setLocationRelativeTo(parentFrame);

	}

	private void initalizesVariable() {
		// khoi tao cac nut
		this.saveButton = new JButton(StringConstant.STUDENT_FROM_SAVE);
		this.closeButton = new JButton(StringConstant.STUDENT_FROM_CLOSE);
		this.resetButton = new JButton(StringConstant.STUDENT_FROM_RESET);
		// khoi tao lable va textfield
		this.classLable = new JLabel(StringConstant.STUDENT_FORM_ADD_CLASS);
		this.classField = new JTextField(NumberConstant.STUDENT_FORM_FIELD_CLASS_LENGTH);

		this.specialLable = new JLabel(StringConstant.STUDENT_FORM_SPECIAL);
		this.specialField = new JTextField(NumberConstant.STUDENT_FORM_FIELD_SPECIAL_LENGTH);

		this.departmentLable = new JLabel(StringConstant.STUDENT_FORM_DEPARTMANET);
		this.departmentField = new JTextField(NumberConstant.STUDENT_FORM_FIELD_DEPARTMANET_LENGTH);

		closeButton.addActionListener(this);
		resetButton.addActionListener(this);
		saveButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.closeButton) {
			this.setVisible(false);
		} else if (e.getSource() == resetButton) {
			this.classField.setText(null);
			this.specialField.setText(null);
			this.departmentField.setText(null);

		} else if (e.getSource() == this.saveButton) {
			String strClass = this.classField.getText();
			String strSpecial = this.specialField.getText();
			String strDepartment = this.departmentField.getText();

			this.setVisible(false);
		}
	}

}
