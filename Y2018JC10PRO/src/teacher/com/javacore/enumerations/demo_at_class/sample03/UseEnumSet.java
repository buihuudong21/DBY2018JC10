package teacher.com.javacore.enumerations.demo_at_class.sample03;

import java.util.EnumSet;
import java.util.Iterator;

public class UseEnumSet {
	public static void main(String[] args) {
		// Demo ve collection giong nhu collection framework
		EnumSet<Size> largeSize = EnumSet.of(Size.XL, Size.XXL, Size.XXXL);

		Iterator<Size> objIt = largeSize.iterator();
		while (objIt.hasNext()) {
			System.out.println(objIt.next() + " ");
		}

	}
}

// inner enum
enum Size {
	S, M, L, XL, XXL, XXXL; // Size of closthe
}
