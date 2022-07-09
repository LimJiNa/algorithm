package array;

import java.util.Scanner;

/**
 * 임시반장 정하기
 * 
 * 5
 * 2 3 1 7 3
 * 4 1 9 6 8
 * 5 5 2 4 4
 * 6 5 2 6 7
 * 8 4 2 2 2
 */
public class Problem11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] arr = new int[n][5];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println(solution(n, arr));

		scan.close();
	}

	public static int solution(int n, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int cnt = 0;

			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) { // 학년
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}

			if (cnt > max) {
				max = cnt;
				answer = (i + 1);
			}
		}

		return answer;
	}
}
