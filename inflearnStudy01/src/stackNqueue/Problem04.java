package stackNqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산(postfix)
 */
public class Problem04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solution(str));

		scan.close();
	}

	public static int solution(String str) {
		int answer = 0;

		Stack<Integer> stack = new Stack<>();
		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) {
				stack.push(parseInt(x));
				continue;
			}

			int right = stack.pop();
			int left = stack.pop();

			switch (x) {
				case '+':
					answer = (left + right);
					break;
				case '-':
					answer = (left - right);
					break;
				case '*':
					answer = (left * right);
					break;
				case '/':
					answer = (left / right);
					break;
			}

			stack.push(answer);
		}

		return answer;
	}

	public static int parseInt(char x) {
		return Integer.parseInt(Character.toString(x));
	}
}
