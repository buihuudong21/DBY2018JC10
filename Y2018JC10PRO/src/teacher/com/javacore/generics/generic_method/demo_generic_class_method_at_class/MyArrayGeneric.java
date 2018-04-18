package teacher.com.javacore.generics.generic_method.demo_generic_class_method_at_class;

public class MyArrayGeneric<T> {
	private static final int INITIAL_CAPACITY = 10;
	private T[] arrData;
	private int size; // Số phần tử thật trong mảng arrData;

	public MyArrayGeneric() {
		this.size = 0;
		this.arrData = (T[]) new Object[INITIAL_CAPACITY];
	}

	public MyArrayGeneric(int size, T[] arrList) {
		this.size = size;
		this.arrData = arrList;
	}
	// Ham set & get

	private T[] getArrData() {
		return arrData;
	}

	public void setArrData(T[] arrData) {
		this.arrData = arrData;
		this.size = arrData.length;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	// Method return a element at index input
	public T getElement(int index) {
		T data = this.arrData[index];
		return data;
	}
}
