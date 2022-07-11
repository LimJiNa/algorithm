package bronze05;

import java.util.Scanner;

public class P10950 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println(solution(n, arr));

		scan.close();
	}

	public static String solution(int n, int[][] arr) {
		StringBuilder sb = new StringBuilder();

		for (int[] x : arr) {
			sb.append(x[0] + x[1]).append("\n");
		}

		return sb.toString();
	}
}
