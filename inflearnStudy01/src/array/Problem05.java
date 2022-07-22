package array;

import java.util.Scanner;

/**
 * 소수(에라토스테네스 체)
 */
public class Problem05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solving(n));

		scan.close();
	}

	public static int solving(int n) {
		int answer = 0;
		int[] arr = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			if (arr[i] == 0) {
				answer++;

				for (int j = i; j <= n; j = j + i) {
					arr[j] = 1;
				}
			}
		}

		return answer;
	}
}
