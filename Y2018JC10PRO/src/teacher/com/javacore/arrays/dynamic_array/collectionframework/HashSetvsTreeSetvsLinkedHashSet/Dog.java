package com.teacher.arrays.dynamic_array.collectionframework.HashSetvsTreeSetvsLinkedHashSet;

public class Dog implements Comparable<Dog> {
	int size;

	public Dog(int s) {
		size = s;
	}

	public String toString() {
		return size + "";
	}

	@Override
	public int compareTo(Dog o) {
		return size - o.size;
	}
}
