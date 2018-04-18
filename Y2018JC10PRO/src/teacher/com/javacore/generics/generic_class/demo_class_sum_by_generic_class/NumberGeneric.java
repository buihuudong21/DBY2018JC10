package teacher.com.javacore.generics.generic_class.demo_class_sum_by_generic_class;

public final class NumberGeneric<T, E> {
	// Viet ham tinh tong
	public Double toTal(T t, E e) {
		return (Double) t + (Double) e;
	}
}
