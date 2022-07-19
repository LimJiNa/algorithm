package step19;

import java.util.Scanner;
import java.util.Stack;

/**
 * 제로
 * 
 * 4	10
 * 3	1
 * 0	3
 * 4	5
 * 0	4
 * 		0
 * 		0
 * 		7
 * 		0
 * 		0
 * 		6
 */
public class P10773 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		int[] arr = new int[k];

		for (int i = 0; i < k; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(arr));

		scan.close();
	}

	public static int solution(int[] arr) {
		int answer = 0;

		Stack<Integer> stack = new Stack<>();

		for (int x : arr) {
			if (x == 0) {
				stack.pop();
				continue;
			}

			stack.push(x);
		}

		if (!stack.isEmpty()) {
			for (int i = 0; i < stack.size(); i++) {
				answer += stack.get(i);
			}
		}

		return answer;
	}
}
