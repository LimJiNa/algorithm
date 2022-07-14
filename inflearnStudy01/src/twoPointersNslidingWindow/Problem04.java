package twoPointersNslidingWindow;

import java.util.Scanner;

/**
 * 연속 부분수열
 * 
 * 8 6
 * 1 2 1 3 1 1 1 2
 */
public class Problem04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(n, m, arr));

		scan.close();
	}

	public static int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = 0;
		int rt = 0;
		int sum = 0;

		while (rt < n) {
			sum += arr[rt++];

			if (sum == m) {
				answer++;
			}

			while (sum >= m) {
				sum -= arr[lt++];

				if (sum == m) {
					answer++;
				}
			}
		}

		return answer;
	}

	public static int solving(int n, int m, int[] arr) {
		int answer = 0;

		int lt = 0;
		int sum = 0;

		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];

			if (sum == m)
				answer++;

			while (sum >= m) {
				sum -= arr[lt++];

				if (sum == m)
					answer++;
			}
		}

		return answer;
	}
}
