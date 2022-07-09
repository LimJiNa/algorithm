package array;

import java.util.Scanner;

/**
 * 봉우리
 * 
 * 5
 * 5 3 7 2 3
 * 3 7 1 6 1
 * 7 2 5 3 4
 * 4 3 6 4 1
 * 8 7 3 5 2
 */
public class Problem10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] arr = new int[n + 2][n + 2];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println(solution(n, arr));

		scan.close();
	}

	public static int solution(int n, int[][] arr) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (arr[i - 1][j] < arr[i][j] && arr[i + 1][j] < arr[i][j] && arr[i][j - 1] < arr[i][j]
						&& arr[i][j + 1] < arr[i][j]) {
					answer++;
				}
			}
		}

		return answer;
	}
}
