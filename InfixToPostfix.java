package ProblemSetI;

public class InfixToPostfix {

	public static char[] stack = new char[10];
	public static int top = 0;

	public void push(char stack[], int length, int top, char operand) {
		if (top == length - 1) {
			System.out.println("Stack over flow");
		} else {
			stack[top] = operand;
			// System.out.println(stack.toString());
			top++;
		}
	}

	public char pop(char stack[], int lenght, int top) {
		char popValue = '\0';
		if (top == top - 1) {
			System.out.println("Stack under flow");
		} else {
			popValue = stack[top];
			stack[top] = 0;
			top--;
		}
		return popValue;

	}

	public int priority(char operator) {
		int priority = 0;
		switch (operator) {
		case '^':
			priority = '1';
			break;
		case '*':
			priority = '2';
			break;
		case '/':
			priority = '2';
			break;
		case '+':
			priority = '3';
			break;
		case '-':
			priority = '3';
			break;
		}
		return priority;
	}

	public boolean isEmpty() {

		for (int i = 0; i < stack.length - 1; i++) {

			if (!(stack[i] == 0)) {
				return false;
			}
		}
		return true;
	}

	public void infixToPostfixConversion(String str) {
		char input[] = str.toCharArray();
		int length = input.length;
		int symb = 0;
		while (!(symb == length)) {
			if ((input[symb] >= 'a' && input[symb] <= 'z')
					|| (input[symb] >= 'A' && input[symb] <= 'Z')) {
				System.out.print(input[symb]);
				symb++;
			} else {
				while (!isEmpty()
						&& priority(stack[top]) > priority(input[symb])) {
					char value = pop(stack, stack.length, top);
					System.out.print(value);
				}
				if (isEmpty()) {
					push(stack, stack.length, top, input[symb]);
					symb++;
				} else {
					if (priority(stack[top]) < priority(input[symb])) {
						push(stack, stack.length, top, input[symb]);
						symb++;
					}
				}
			}
		}

	}

	public static void main(String stra[]) {
		String str = "a+b*c^d";
		InfixToPostfix ip = new InfixToPostfix();
		ip.infixToPostfixConversion(str);
	}
}
