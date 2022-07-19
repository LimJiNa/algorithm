package stackNqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 올바른 괄호
 * 
 * (()(()))(()
 */
public class Problem01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solving(str));

		scan.close();
	}

	public static String solution(String str) {
		String answer = "YES";

		Stack<Character> stack = new Stack<>();

		for (char x : str.toCharArray()) {
			if (x == '(') {
				stack.push(x);
			} else {
				if (stack.isEmpty()) {
					return "NO";
				}

				stack.pop();
			}
		}

		if (stack.size() > 0) {
			return "NO";
		}

		return answer;
	}

	public static String solving(String str) {
		String answer = "YES";

		Stack<Character> stack = new Stack<>();

		for (char x : str.toCharArray()) {
			if (x == '(') {
				stack.push(x);
			} else {
				if (stack.isEmpty()) {
					return "NO";
				}

				stack.pop();
			}
		}

		if (!stack.isEmpty()) {
			return "NO";
		}

		return answer;
	}
}
