package buihuudong.generic.numbergeneric;

public class GenericNumber<T extends Number> {

	public T add(T x, T y) {

		if (x == null || y == null) {
			return null;
		}

		if (x instanceof Double) {
			return (T) new Double(x.doubleValue() + y.doubleValue());
		} else if (x instanceof Integer) {
			return (T) new Integer(x.intValue() + y.intValue());
		} 
	}

}
