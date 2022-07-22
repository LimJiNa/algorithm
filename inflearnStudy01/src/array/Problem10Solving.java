package array;

import java.util.Scanner;

/**
 * 봉우리
 */
public class Problem10Solving {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println(solving(n, arr));

		scan.close();
	}

	public static final int[] dx = { 0, -1, 0, 1 };
	public static final int[] dy = { -1, 0, 1, 0 };

	public static int solving(int n, int[][] arr) {
		int answer = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean flag = true;

				for (int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];

					if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}

				if (flag) {
					answer++;
				}
			}
		}

		return answer;
	}
}
