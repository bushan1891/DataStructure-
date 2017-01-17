package io.bush.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BracesBalance {

	public static boolean isBalanced(String braces) {

		Stack<Character> container = new Stack<Character>();

		char[] charArray = braces.toCharArray();

		for (char ch : charArray) {
			if (ch == '[' || ch == '{' || ch == '(') {
				container.push(ch);
				// System.out.println("Pushing :" + ch);
			} else if ((ch == ']' || ch == '}' || ch == ')') && !container.isEmpty()) {

				switch (ch) {
				case ']':
					if (container.peek() == '[') {
						container.pop();
						// System.out.println("Poped :" + ch);
					}
					break;
				case '}':
					if (container.peek() == '{') {
						container.pop();
						// System.out.println("Poped :" + ch);
					}
					break;
				case ')':
					if (container.peek() == '(') {
						container.pop();
						// System.out.println("Poped :" + ch);
					}
					break;
				}

			}

		}

		if (container.isEmpty()) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		List<String> braces = new ArrayList<String>();
		braces.add("[[[[[]]]]]");
		braces.add("[[[[[{{{{}}}}}]]]]]");
		braces.add("[[[[[]]]]]{{{}}}}}{{{}}}");
		braces.add("{{{}}}()()");
		braces.add("(((()))){}{}[][]");
		braces.add("{{{{{{}}}}}}");
		braces.add("[");
		braces.add("[}}}}");
		braces.add("[}}}}[[[[");
		braces.add("[]");

		boolean balanced = false;
		try {
			for (String it : braces) {
				balanced = BracesBalance.isBalanced(it);
				System.out.println("Balanced :" + it + " = " + balanced);
			}

		} catch (Exception e) {
			System.err.println(e.getCause());
		}

	}
}
