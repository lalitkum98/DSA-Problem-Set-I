package ProblemSetI;

import java.util.Stack;

public class InfixValidation {

	public boolean isOperand(char op) {
		for (int i = (int) 'A'; i < (int) 'Z'; i++) {
			if (i == (int) op) {
				return true;
			}
		}
		for (int i = (int) 'a'; i < (int) 'z'; i++) {
			if (i == (int) op) {
				return true;
			}
		}
		return false;
	}

	public boolean isOperator(char op) {

		switch (op) {

		case '+':
			return true;
		case '-':
			return true;
		case '*':
			return true;
		case '/':
			return true;
		case '^':
			return true;
		}
		return false;
	}

	public boolean isValidInfixExpressioncalculateExp(String expression) {
		Stack stack = new Stack();
		for (int i = 0; i < expression.length() - 1; i++) {
			if ((isOperand(expression.charAt(i)) && isOperand(expression
					.charAt(i + 1))))
				return false;
			if ((isOperator(expression.charAt(i)) && isOperator(expression
					.charAt(i + 1))))
				return false;
			if (expression.charAt(i) == '(' || expression.charAt(i) == '{') {
				stack.push(expression.charAt(i));
			} else if (expression.charAt(i) == ')'
					|| expression.charAt(i) == '}') {
				stack.pop();
			}
		}
		if(expression.charAt(expression.length() - 1) == ')' || expression.charAt(expression.length() - 1) == '}')
			stack.pop();
		
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String arg[]) {
		InfixValidation iv = new InfixValidation();
		String expression = "aa+cc*{(a+b)}";
		System.out.println(iv.isValidInfixExpressioncalculateExp(expression));

	}
}
