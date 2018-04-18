package teacher.com.javacore.generics.practice_all_wildcard;

public class MyListPerson<T> {
	private T data;

	public MyListPerson() {

	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
