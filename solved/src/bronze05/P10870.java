package bronze05;

import java.util.Scanner;

/**
 * 피보나치 수 5
 */
public class P10870 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solution(n));

		scan.close();
	}

	public static int solution(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		int[] arr = new int[n];
		int idx = 0;

		for (int i = 0; i < n; i++) {
			if (i <= 1) {
				arr[i] = idx;
				idx++;
				continue;
			}

			arr[i] += arr[i - 2] + arr[i - 1];
		}

		return arr[n - 2] + arr[n - 1];
	}
}
