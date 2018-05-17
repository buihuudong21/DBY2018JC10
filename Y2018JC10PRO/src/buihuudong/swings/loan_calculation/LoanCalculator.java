package buihuudong.swings.loan_calculation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class LoanCalculator extends JFrame {
	private JTextField jtfAnnualInterestRate = new JTextField();
	private JTextField jtfNumberOfYears = new JTextField();
	private JTextField jtfLoanAmount = new JTextField();
	private JTextField jtfMonthlyPayment = new JTextField();
	private JTextField jtfTotalPayment = new JTextField();

	private JButton jbtComputeLoan = new JButton("Compute Payment");

	public LoanCalculator() {
		// Panel p1 to hold labels and text fields
		JPanel p1 = new JPanel(new GridLayout(5, 2));
		p1.add(new JLabel("Annual Interest Rate"));
		p1.add(jtfAnnualInterestRate);
		p1.add(new JLabel("Number of Years"));
		p1.add(jtfNumberOfYears);
		p1.add(new JLabel("Loan Amount"));
		p1.add(jtfLoanAmount);
		p1.add(new JLabel("Monthly Payment"));
		p1.add(jtfMonthlyPayment);
		p1.add(new JLabel("Total Payment"));
		p1.add(jtfTotalPayment);
		p1.setBorder(new TitledBorder("Enter loan amount, interest rate, and year"));

		// Panel p2 to hold the button
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));

		p2.add(jbtComputeLoan);
		// Add the panels to the frame
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		jbtComputeLoan.addActionListener(new ButtonListener());

		//
		this.pack();
		this.setTitle("LoanCalculator");
		this.setLocationRelativeTo(null); // Center the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Get values from text fields
			double interest = Double.parseDouble(jtfAnnualInterestRate.getText());
			int year = Integer.parseInt(jtfNumberOfYears.getText());
			double loanAmount = Double.parseDouble(jtfLoanAmount.getText());

			// Create a loan object
			Loan loan = new Loan(interest, year, loanAmount);
			jtfMonthlyPayment.setText(String.format("%.2f", loan.getMonthlyPayment()));
			// Display monthly payment and total payment
			jtfTotalPayment.setText(String.format("%.2f", loan.getTotalPayment()));
		}
	}

}
