package teacher.com.javacore.generics.generic_class.demo_at_class;

import java.util.ArrayList;

public class GenericStack<E> {
	// 1. Lưu trữ dữ liệu
	private ArrayList<E> data = new ArrayList<E>();

	// 2. Trả cỡ của mảng data
	public int getSizeData() {
		return this.data.size();
	}

	// 3. Phương thức đưa dữ liệu vào
	public void addData(E e) {
		this.data.add(e);
	}

	// 4. Lấy một phần tử ra
	public E getElement(int index) {

		E e = this.data.get(index);

		return e;
	}

	// 5. Kiểm tra xem stack còn dữ liệu không
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
}
