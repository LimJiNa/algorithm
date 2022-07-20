package step19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 균형잡힌 세상
 */
public class P4949 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		while (!(str = br.readLine()).equals(".")) {
			System.out.println(solution(str));
		}
	}

	public static String solution(String str) {
		Stack<Character> stack = new Stack<>();

		for (char x : str.toCharArray()) {
			if (x == '(' || x == '[') {
				stack.push(x);
			} else if (x == ')') {
				if (stack.isEmpty()) {
					return "no";
				}

				if (stack.peek() == '(') {
					stack.pop();
				} else {
					stack.push(x);
				}
			} else if (x == ']') {
				if (stack.isEmpty()) {
					return "no";
				}

				if (stack.peek() == '[') {
					stack.pop();
				} else {
					stack.push(x);
				}
			}
		}

		if (stack.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
