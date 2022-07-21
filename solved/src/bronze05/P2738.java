package bronze05;

import java.util.Scanner;

/**
 * 행렬 덧셈
 */
public class P2738 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr1[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}

		System.out.println(solution(n, m, arr1, arr2));

		scan.close();
	}

	public static String solution(int n, int m, int[][] arr1, int[][] arr2) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sb.append(arr1[i][j] + arr2[i][j]).append(" ");
			}

			sb.append("\n");
		}

		return sb.toString();
	}
}
