package twoPointersNslidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 공통 원소 구하기
 */
public class Problem02 {
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

		for (int x : solution(n, nArr, m, mArr)) {
			System.out.print(x + " ");
		}

		scan.close();
	}

	public static ArrayList<Integer> solution(int n, int[] nArr, int m, int[] mArr) {
		ArrayList<Integer> answer = new ArrayList<>();

		Arrays.sort(nArr);
		Arrays.sort(mArr);

		int p1 = 0;
		int p2 = 0;

		while (p1 < n && p2 < m) {
			if (nArr[p1] < mArr[p2]) {
				p1++;
			} else if (mArr[p2] < nArr[p1]) {
				p2++;
			} else {
				answer.add(nArr[p1++]);
				p2++;
			}
		}

		return answer;
	}
}
