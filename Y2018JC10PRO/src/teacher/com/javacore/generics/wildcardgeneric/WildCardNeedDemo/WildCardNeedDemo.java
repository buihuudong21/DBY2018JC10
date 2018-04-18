package teacher.com.javacore.generics.wildcardgeneric.WildCardNeedDemo;

import teacher.com.javacore.generics.generic_class.demoonsite.generic_class.StackGeneric;

public class WildCardNeedDemo {
	public static void main(String[] args) {

		StackGeneric<Integer> intStack = new StackGeneric<>();

		intStack.pushStack(1); // 1 is autoboxed into new Integer(1)
		intStack.pushStack(2);
		intStack.pushStack(-2);

		System.out.print("The max number is " + max(intStack));
	}

	/** Find the maximum in a stack of numbers <? extends Number> */
	public static double max(StackGeneric<? extends Number> stack) {
		double max = stack.popStack().doubleValue(); // Initialize max

		while (!stack.isEmptyStack()) {
			double value = stack.popStack().doubleValue();
			if (value > max)
				max = value;
		}

		return max;
	}
}

// Tuc Number la super type cua Integer: StackGeneric<Number> vs
// StackGeneric<Integer>