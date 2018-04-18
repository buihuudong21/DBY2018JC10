package teacher.com.javacore.generics.generic_method.demo_generic_class_method_at_class;

public class MyArray<T> {
	private T[] array;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public MyArray() {
	}

	public MyArray(T[] array, int size) {
		this.array = array;
		this.size = size;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
		this.size = array.length;
	}

	// Return phan tu tai vi tri i cua mang
	public T getElement(int index) {
		return array[index];
	}

	// In noi dung mang T ra ngoai
	public static <E> void displayInforArray(E[] e) {
		for (E element : e) {
			System.out.println(element);
		}
	}

}
