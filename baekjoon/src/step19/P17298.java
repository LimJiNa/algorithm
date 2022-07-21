package step19;

import java.util.Scanner;
import java.util.Stack;

public class P17298 {
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
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}

			stack.push(i);
		}

		while (!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}

		for (int x : arr) {
			sb.append(x).append(" ");
		}

		return sb.toString();
	}
}
