package twoPointersNslidingWindow;

import java.util.Scanner;

/**
 * 최대 매출
 */
public class Problem03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solving(n, k, arr));

		scan.close();
	}

	public static int solving(int n, int k, int[] arr) {
		int answer = 0;
		int sum = 0;

		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}

		answer = sum;

		for (int i = k; i < n; i++) {
			sum += (arr[i] - arr[i - k]);
			answer = Math.max(answer, sum);
		}

		return answer;
	}
}
