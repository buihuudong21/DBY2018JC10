package teacher.com.javacore.generics.practice_number_generic;

//<T extends Number>: Class generic bounded;
public class NumberGeneric<T extends Number> {

	public T add(T o1, T o2) {
		// Check
		if (o1 == null || o2 == null) {
			return null;
		}

		// Kiem tra o1, va o2 co kieu du lieu la gi?
		if (o1 instanceof Double && o2 instanceof Double) {
			return (T) new Double((o1.doubleValue() + o2.doubleValue()));
		}
		if (o1 instanceof Integer && o2 instanceof Integer) {
			return (T) new Integer((o1.intValue() + o2.intValue()));
		}
		return null;
	}

	// <E extends Number: generic method bounded
	// <E>: Define kieu cho tham so cua phuong thuc
	public static <E extends Number> void diplayInfor(E[] arrData) {
		System.out.println("");
	}
}
