package ProblemSetI;

import java.util.Stack;

public class StackReverce {
	// Do a reverse of a stack without using of any extra space ans:recursion
	public void reverse(Stack stack) {
		if (stack.isEmpty()) {
			return;
		} else {
			String value = (String) stack.pop();
			reverse(stack);
			reverseStack(stack, value);
		}

	}

	public void reverseStack(Stack stack, String value) {
		if (stack.isEmpty()) {
			stack.push(value);

		} else {
			String temp = (String) stack.pop();
			reverseStack(stack, value);
			stack.push(temp);
		}
	}

	public static void main(String arg[]) {
		Stack stack = new Stack();
		stack.push("g");
		stack.push("b");
		stack.push("e");
		stack.push("a");
		System.out.println("Before Reverse"+ stack);
		StackReverce sr = new StackReverce();
		sr.reverse(stack);
		System.out.println("After Reverse"+stack);

	}

}
