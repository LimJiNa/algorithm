package stackNqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 쇠막대기
 */
public class Problem05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solution(str));

		scan.close();
	}

	public static int solution(String str) {
		int answer = 0;

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			} else {
				if (str.charAt(i - 1) == '(') {
					stack.pop();
					answer += stack.size();
				} else {
					stack.pop();
					answer += 1;
				}
			}
		}

		return answer;
	}

	public static int solving(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(')
				stack.push('(');
			else {
				stack.pop();

				if (str.charAt(i - 1) == '(')
					answer += stack.size();
				else
					answer++;
			}
		}

		return answer;
	}
}
