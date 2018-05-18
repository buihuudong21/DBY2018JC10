package teacher.com.javacore.Swing_apps.demo_javaswing_at_class.demo_show_frame_gui;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AppTest {

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
		// End try..catch

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MainAppFrame();
			}
		});

		// Thử gọi
		// Loan loan = new Loan();
		// System.out.println("Lãi hàng tháng: " + loan.getMonthlyInterest());
		// System.out.println("Tổng lãi 1 năm: " + loan.getTotalinterest());

	}

}
