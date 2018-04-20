package com.teacher.collection_framework_excercise.collection_interface_framework_demo;

import java.util.Collection;

public interface IMyCollection<E> {
	// Chua mot so phuong thuc de cac thanh phan sau no phai implements
	// 1. Ham them moi 1 doi tuong vao
	public void add(E o);

	// 2. Ham them moi map
	public void addAll(Collection<?> o);

	// 3. Ham remove mot object
	public void remove(E o);

	// 4. Tra ra co cua collection
	public int size();

	// 5. Kiem tra co phan tu nao ko?
	public boolean isEmpty();

	// 6. Kiem tra xem 1 phan tu co ton tai trong collection ?
	public boolean contains(E o);

}
