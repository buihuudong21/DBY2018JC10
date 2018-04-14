package com.teacher.generics.wildcardgeneric.SuperWildCardDemo;

import com.teacher.generics.generic_class.demoonsite.generic_class.StackGeneric;
import com.teacher.generics.wildcardgeneric.AnyWildCarDemo.AnyWildCardDemo;

public class SuperWildCardDemo {
	public static void main(String[] args) {
		StackGeneric<String> stack1 = new StackGeneric<>();
		StackGeneric<Object> stack2 = new StackGeneric<>();
		stack2.pushStack("Java");
		stack2.pushStack(2);
		stack1.pushStack("Sun");
		add(stack1, stack2);
		AnyWildCardDemo.print(stack2);
	}

	public static <T> void add(StackGeneric<T> stack1, StackGeneric<? super T> stack2) {
		while (!stack1.isEmptyStack())
			stack2.pushStack(stack1.popStack());
	}
}

/*
 * public static <T> void add(MyStackGeneric<? extends T> stack1,
 * MyStackGeneric<T> stack2)
 * 
 * 
 * 
 */
