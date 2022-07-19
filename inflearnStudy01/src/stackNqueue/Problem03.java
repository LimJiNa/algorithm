package stackNqueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 크레인 인형뽑기(카카오)
 * 
 * 5
 * 0 0 0 0 0
 * 0 0 1 0 3
 * 0 2 5 0 1
 * 4 2 4 4 2
 * 3 5 1 3 1
 * 8
 * 1 5 3 5 1 2 1 4
 */
public class Problem03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] nArr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				nArr[i][j] = scan.nextInt();
			}
		}

		int m = scan.nextInt();
		int[] mArr = new int[m];

		for (int i = 0; i < m; i++) {
			mArr[i] = scan.nextInt();
		}

		System.out.println(solution(n, nArr, m, mArr));

		scan.close();
	}

	public static int solution(int n, int[][] nArr, int m, int[] mArr) {
		int answer = 0;

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int tmp = nArr[j][mArr[i] - 1];

				if (tmp != 0) {
					if (!stack.isEmpty() && stack.peek() == tmp) {
						stack.pop();
						nArr[j][mArr[i] - 1] = 0;
						answer += 2;
						break;
					} else {
						stack.push(tmp);
						nArr[j][mArr[i] - 1] = 0;
						break;
					}
				}
			}
		}

		return answer;
	}

	public static int solving(int[][] board, int[] moves) {
		int answer = 0;

		Stack<Integer> stack = new Stack<>();

		for (int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][pos - 1] != 0) {
					int tmp = board[i][pos - 1];
					board[i][pos - 1] = 0;

					if (!stack.isEmpty() && stack.peek() == tmp) {
						answer += 2;
						stack.pop();
					} else {
						stack.push(tmp);
					}

					break;
				}
			}
		}

		return answer;
	}
}
