package step27;

import java.util.Scanner;

/**
 * 두수의 합
 */
public class P3273 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int x = scan.nextInt();

		System.out.println(solution(n, arr, x));

		scan.close();
	}

	public static int solution(int n, int[] arr, int x) {
		int answer = 0;
		int lt = 0;
		int rt = 0;
		int sum = 0;

		while (lt < (n - 1)) {
			sum = arr[lt] + arr[rt++];

			if (sum == x) {
				answer++;
			}

			if (rt >= n) {
				lt++;
				rt = (lt + 1);
			}
		}

		return answer;
	}
}
