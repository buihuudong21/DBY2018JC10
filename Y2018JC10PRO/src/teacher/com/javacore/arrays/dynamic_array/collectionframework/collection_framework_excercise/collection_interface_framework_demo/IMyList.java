package com.teacher.collection_framework_excercise.collection_interface_framework_demo;

public interface IMyList<E> extends IMyCollection<E> {
	// 1. Lay ra 1 phan tu theo index
	public E get(int index);

	// 2. Add mot object vao Collection voi mot vi tri index nao do
	public void set(int index, E o);

	// 3. tra ra mot vi tri cua mot doi duong
	public int indexOf(E o);

	// 4. tra ra vi tri cuoi cung cua Object
	public int indexLastOf(E o);

}
