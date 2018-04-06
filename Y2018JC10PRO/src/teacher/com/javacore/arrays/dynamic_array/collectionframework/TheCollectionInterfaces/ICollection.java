package com.teacher.arrays.dynamic_array.collectionframework.TheCollectionInterfaces;

import java.util.Collection;

public interface ICollection<E> {
	boolean add(E obj);

	boolean addAll(Collection<?> C);

	E remove(E obj);

	boolean removeAll(Collection<?> C);

	boolean contains(E obj);

	boolean isEmpty();

	int size();
}
