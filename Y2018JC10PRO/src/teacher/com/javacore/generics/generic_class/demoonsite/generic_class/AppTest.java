package teacher.com.javacore.generics.generic_class.demoonsite.generic_class;

import java.util.Iterator;

public class AppTest {

	public static void main(String[] args) {

		Integer myNumber = 125;// int => AUTOBOXING
		int k = myNumber; // UNAUTOBOXING

		// 1. Khai bao Stack
		StackGeneric<String> myStack = new StackGeneric<>();
		// 2. Them phan tu vao Stack
		myStack.pushStack("Nguyen Van A");
		myStack.pushStack("Nguyen Van B");
		myStack.pushStack("Nguyen Van C");
		myStack.pushStack("Nguyen Van D");
		myStack.pushStack("Nguyen Van E");
		myStack.pushStack("Nguyen Van F");

		// 3. Lay ra
		Iterator<String> loopItor = myStack.stackIterator();
		while (loopItor.hasNext()) {
			System.out.print(loopItor.next() + " ; ");
		}

	}

}
