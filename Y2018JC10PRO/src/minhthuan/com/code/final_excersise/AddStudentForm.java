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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AddStudentForm extends JDialog implements ActionListener {
	int stt = 5;
	private JButton saveButton;
	private JButton resetButton;
	private JButton closeButton;

	private JLabel stdnameLable, addressLable, licenseLable, phoneLable, sexLable, classLable;
	private JTextField stdnameField, addressField, licenseField, phoneField;
	private JCheckBox sexCheck1, sexCheck2;

	private String[] sex = { "Nam", "Nu" };
	private JComboBox<String> sexComboBox = new JComboBox<>(sex);

	private String[] classList = { "Java Core", "Y2018JC10", "Y2017JC79" };
	private JComboBox<String> classComboBox = new JComboBox<>(classList);

	private IAddStudentFormController addStudentFormController;
	private IAddStudentCallBack addStudentCallBack = null;

	public AddStudentForm(JFrame parentFrame) {
		super(parentFrame, StringConstant.STUDENT_FROM_TITLE, false);
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
		studentInfoPanel.add(stdnameLable, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(stdnameField, gc);

		// =========== Dong 2 ================
		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(addressLable, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(addressField, gc);
		// =========== Dong 3 ==================
		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 1;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(licenseLable, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(licenseField, gc);

		// =========== Dong 4 ==================
		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(phoneLable, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(phoneField, gc);

		// =========== Dong 5 ==================
		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 0;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(sexLable, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		// studentInfoPanel.add(sexCheck1, gc);
		studentInfoPanel.add(sexComboBox, gc);

		// =========== Dong 6 ==================
		gc.gridy++;

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
		studentInfoPanel.add(classComboBox, gc);

		// Xu ly JPanel

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
		this.stdnameLable = new JLabel(StringConstant.STUDENT_FORM_NAME);
		this.stdnameField = new JTextField(NumberConstant.STUDENT_FORM_FIELD_NAME_LENGTH);

		this.addressLable = new JLabel(StringConstant.STUDENT_FORM_ADDRESS);
		this.addressField = new JTextField(NumberConstant.STUDENT_FORM_FIELD_ADDRESS_LENGTH);

		this.licenseLable = new JLabel(StringConstant.STUDENT_FORM_LICENSE);
		this.licenseField = new JTextField(NumberConstant.STUDENT_FORM_FIELD_LICENSE_LENGTH);

		this.phoneLable = new JLabel(StringConstant.STUDENT_FORM_PHONE);
		this.phoneField = new JTextField(NumberConstant.STUDENT_FORM_FIELD_PHONE_LENGTH);

		// khoi tao checkbox

		this.sexLable = new JLabel(StringConstant.STUDENT_FORM_SEX);
		this.sexComboBox = new JComboBox<>(sex);
		// this.sexCheck1 = new JCheckBox("Nam");
		// this.sexCheck2 = new JCheckBox("Nu");

		// khoi tao combobox
		this.classLable = new JLabel(StringConstant.STUDENT_FORM_CLASS);
		this.classComboBox = new JComboBox<>(classList);
		this.addStudentFormController = new AddStudentFormControllerImpl();

		closeButton.addActionListener(this);
		resetButton.addActionListener(this);
		saveButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.closeButton) {
			this.setVisible(false);
		} else if (e.getSource() == resetButton) {
			this.stdnameField.setText(null);
			this.addressField.setText(null);
			this.licenseField.setText(null);
			this.phoneField.setText(null);
			this.sexComboBox.setSelectedIndex(0);
			this.classComboBox.setSelectedIndex(0);
			this.stdnameField.setFocusCycleRoot(true);

		} else if (e.getSource() == this.saveButton) {
			String strStdName = this.stdnameField.getText();
			String strAddress = this.addressField.getText();
			String strLicense = this.licenseField.getText();
			String strPhone = this.phoneField.getText();
			String strSex = (String) this.sexComboBox.getSelectedItem();
			String strClass = (String) this.classComboBox.getSelectedItem();

			Student student = new Student(++stt, strStdName, strAddress, strClass, strLicense, strPhone);
			this.addStudentFormController.insertStudent(student);
			this.addStudentCallBack.studentSaved();
			this.setVisible(false);
		}
	}

	public void setCallBack(IAddStudentCallBack addStudentCallBack) {
		this.addStudentCallBack = addStudentCallBack;
	}

}
