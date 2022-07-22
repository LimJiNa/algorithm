package twoPointersNslidingWindow;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 두 배열 합치기
 */
public class Problem01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] nArr = new int[n];

		for (int i = 0; i < n; i++) {
			nArr[i] = scan.nextInt();
		}

		int m = scan.nextInt();
		int[] mArr = new int[m];

		for (int i = 0; i < m; i++) {
			mArr[i] = scan.nextInt();
		}

		for (int x : solution1(n, nArr, m, mArr)) {
			System.out.print(x + " ");
		}

		scan.close();
	}

	public static int[] solution(int n, int[] nArr, int m, int[] mArr) {
		int[] answer = new int[n + m];

		System.arraycopy(nArr, 0, answer, 0, n);
		System.arraycopy(mArr, 0, answer, n, m);

		Arrays.sort(answer);

		return answer;
	}

	public static int[] solution1(int n, int[] nArr, int m, int[] mArr) {
		int[] answer = new int[n + m];

		int p1 = 0;
		int p2 = 0;
		int idx = 0;

		for (int i = 0; i < answer.length; i++) {
			if (p1 < n && p2 < m) {
				if (nArr[p1] < mArr[p2]) {
					answer[i] = nArr[p1++];
				} else {
					answer[i] = mArr[p2++];
				}
			} else {
				idx = i;
				break;
			}
		}

		while (p1 < n) {
			answer[idx++] = nArr[p1++];
		}

		while (p2 < m) {
			answer[idx++] = mArr[p2++];
		}

		return answer;
	}
}
