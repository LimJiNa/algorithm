package step19;

import java.util.Scanner;
import java.util.Stack;

/**
 * 스택 수열
 */
public class P1874 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(n, arr));

		scan.close();
	}

	public static String solution(int n, int[] arr) {
		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<>();
		int lastValue = 0;

		for (int value : arr) {
			if (value > lastValue) {
				for (int i = (lastValue + 1); i <= value; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}

				lastValue = value;
			} else if (stack.peek() != value) {
				return "NO";
			}

			stack.pop();
			sb.append("-").append("\n");
		}

		return sb.toString();
	}
}
