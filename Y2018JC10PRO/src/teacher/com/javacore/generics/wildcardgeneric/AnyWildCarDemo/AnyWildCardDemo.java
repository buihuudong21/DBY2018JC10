package com.teacher.generics.wildcardgeneric.AnyWildCarDemo;

import com.teacher.generics.generic_class.demoonsite.generic_class.StackGeneric;

public class AnyWildCardDemo {
	public static void main(String[] args) {
		StackGeneric<Integer> intStack = new StackGeneric<>();
		intStack.pushStack(1); // 1 is autoboxed into new Integer(1)
		intStack.pushStack(2);
		intStack.pushStack(-2);

		print(intStack);
		System.out.println(intStack.isEmptyStack());
	}

	/** Prints objects and empties the stack */
	public static void print(StackGeneric<?> stack) {
		while (!stack.isEmptyStack()) {
			System.out.print(stack.popStack() + " ");
		}
	}
}