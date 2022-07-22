package twoPointersNslidingWindow;

import java.util.Scanner;

/**
 * 연속된 자연수의 합
 */
public class Problem05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solution(n));

		scan.close();
	}

	public static int solution(int n) {
		int answer = 0;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = (i + 1);
		}

		int lt = 0;
		int sum = 0;

		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];

			if (sum == n)
				answer++;

			while (sum >= n && rt < (n - 1)) {
				sum -= arr[lt++];

				if (sum == n)
					answer++;
			}
		}

		return answer;
	}

	public static int solving(int n) {
		int answer = 0;
		int m = (n / 2) + 1;
		int[] arr = new int[m];

		for (int i = 0; i < m; i++) {
			arr[i] = (i + 1);
		}

		int sum = 0;
		int lt = 0;

		for (int rt = 0; rt < m; rt++) {
			sum += arr[rt];

			if (sum == n)
				answer++;

			while (sum >= n) {
				sum -= arr[lt++];

				if (sum == n)
					answer++;
			}
		}

		return answer;
	}
}
