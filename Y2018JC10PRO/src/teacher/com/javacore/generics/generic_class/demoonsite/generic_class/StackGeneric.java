package com.teacher.generics.generic_class.demoonsite.generic_class;

import java.util.ArrayList;
import java.util.Iterator;

public class StackGeneric<T> {
	// 1. Khai bao doi tuong chua du lieu (mang dong)
	private ArrayList<T> myData = new ArrayList<T>();

	// 2. Tien hanh viet cac phuong input va out du lieu'

	public int getStackSize() {
		return this.myData.size();
	}

	// 3. Phuong thuc tra ra mot bo lap tren StackGeneric
	public Iterator<T> stackIterator() {
		return myData.iterator();
	}

	// 4. Them 1 phan tu T vao trong Stack
	public void pushStack(T o) {
		this.myData.add(o);
	}

	// 5. lay 1 phan tu ra nhung dong thoi xoa
	public T popStack() {
		int index = this.getStackSize() - 1;
		T o = this.myData.get(index);
		this.myData.remove(index);
		return o;
	}

	// 6. Lay ra mot phan tu <khong xoa>
	public T peekStack() {
		int index = this.getStackSize() - 1;
		T o = this.myData.get(index);
		return o;
	}

	// 7. Kiem tra xem stack co rong khong?
	public boolean isEmptyStack() {
		return this.myData.isEmpty();
	}
	// 8. Lay ra 1 phan tu theo index nao do

	public T getIndexOfStack(int index) {
		if (index >= this.getStackSize()) {
			index = this.getStackSize() - 1;
		}
		T o = this.myData.get(index);
		return o;
	}
}
