package stackNqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호문자 제거
 */
public class Problem02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solution(str));

		scan.close();
	}

	public static String solution(String str) {
		StringBuilder sb = new StringBuilder();

		Stack<Character> stack = new Stack<>();

		for (char x : str.toCharArray()) {
			if (x == '(') {
				stack.push(x);
			} else if (x == ')') {
				stack.pop();
			} else {
				if (stack.isEmpty()) {
					sb.append(x);
				}
			}
		}

		return sb.toString();
	}

	public static String solving(String str) {
		String answer = "";

		Stack<Character> stack = new Stack<>();

		for (char x : str.toCharArray()) {
			if (x == ')') {
				while (stack.pop() != '(');
			} else {
				stack.push(x);
			}
		}

		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}

		return answer;
	}
}
