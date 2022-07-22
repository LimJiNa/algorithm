package array;

import java.util.Scanner;

/**
 * 격자판 최대
 */
public class Problem09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println(solution(n, arr));

		scan.close();
	}

	public static int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;

		for (int i = 0; i < n; i++) {
			sum1 = 0;
			sum2 = 0;

			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}

			answer = Math.max(Math.max(answer, sum1), sum2);
		}

		sum1 = 0;
		sum2 = 0;

		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][(n - i) - 1];
		}

		answer = Math.max(Math.max(answer, sum1), sum2);

		return answer;
	}
}
