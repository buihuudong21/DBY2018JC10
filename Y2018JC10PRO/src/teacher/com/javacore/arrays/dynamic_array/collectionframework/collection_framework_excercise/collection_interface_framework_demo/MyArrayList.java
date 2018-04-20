package com.teacher.collection_framework_excercise.collection_interface_framework_demo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList<E> extends MyAbstractList<E> implements IMyList<E> {

	private List<E> myData = new LinkedList<E>();

	public MyArrayList() {

	}

	@Override
	public E get(int index) {
		return this.myData.get(index);
	}

	@Override
	public void set(int index, E o) {
		this.myData.set(index, o);
	}

	@Override
	public int indexOf(E o) {

		return this.myData.indexOf(o);
	}

	@Override
	public int indexLastOf(E o) {

		return this.myData.lastIndexOf(o);
	}

	@Override
	public void add(E o) {
		this.myData.add(o);

	}

	@Override
	public void addAll(Collection<?> co) {
		this.myData.addAll((List) co);

	}

	@Override
	public void remove(E o) {
		this.myData.remove(o);

	}

	@Override
	public int size() {

		return this.myData.size();
	}

	@Override
	public boolean isEmpty() {

		return this.myData.isEmpty();
	}

	@Override
	public boolean contains(E o) {

		return this.myData.contains(o);
	}

}
