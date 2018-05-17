package teacher.com.javacore.Swing_apps.MenuDemoAgain;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainAppMenu {

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

			@Override
			public void run() {
				new MenuDemo();

			}
		});
	}

}
