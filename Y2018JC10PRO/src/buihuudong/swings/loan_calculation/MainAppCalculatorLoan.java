package buihuudong.swings.loan_calculation;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainAppCalculatorLoan {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {

			e.printStackTrace();
		}

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new LoanCalculator();
			}
		});

	}

}
