package step19;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호
 * 
 * 6						3
 * (())())					((
 * (((()())()				))
 * (()())((()))				())(()
 * ((()()(()))(((())))()
 * ()()()()(()()())()
 * (()((())()(
 */
public class P9012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		String[] arr = new String[t];

		for (int i = 0; i < t; i++) {
			arr[i] = scan.next();
		}

		System.out.println(solution(arr));

		scan.close();
	}

	public static String solution(String[] arr) {
		StringBuilder sb = new StringBuilder();

		for (String str : arr) {
			Stack<Character> stack = new Stack<>();
			boolean isAppend = true;

			for (char x : str.toCharArray()) {
				if (x == '(') {
					stack.push(x);
				} else if (x == ')') {
					if (stack.isEmpty()) {
						sb.append("NO").append("\n");
						isAppend = false;
						break;
					}

					stack.pop();
				}
			}

			if (isAppend) {
				if (stack.isEmpty()) {
					sb.append("YES").append("\n");
				} else {
					sb.append("NO").append("\n");
				}
			}
		}

		return sb.toString();
	}
}
