package array;

import java.util.Scanner;

/**
 * 멘토링
 * 
 * 4 3
 * 3 4 1 2
 * 4 3 2 1
 * 3 1 4 2
 */
public class Problem12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println(solving(n, m, arr));

		scan.close();
	}

	public static int solving(int n, int m, int[][] arr) {
		int answer = 0;

		// 멘토 학생수
		for (int i = 1; i <= n; i++) {
			// 멘티 학생수
			for (int j = 1; j <= n; j++) {
				int cnt = 0; // 멘토, 멘티가 될 수 있는지 여부

				// 테스트 횟수
				for (int k = 0; k < m; k++) {
					int pi = 0;
					int pj = 0;

					// 등수
					for (int s = 0; s < n; s++) {
						if (arr[k][s] == i) {
							pi = s;
						}

						if (arr[k][s] == j) {
							pj = s;
						}
					}

					if (pi < pj) {
						cnt++;
					}
				}

				/**
				 * 모든 테스트 횟수에서 멘토가 멘티보다 등수가 앞서야 하므로
				 * 멘토, 멘티가 될 수 있는지 여부의 갯수와 테스트 갯수가 동일해야 한다.
				 */
				if (cnt == m) {
					answer++;
				}
			}
		}

		return answer;
	}
}
