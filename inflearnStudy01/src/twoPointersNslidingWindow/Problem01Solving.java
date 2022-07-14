package twoPointersNslidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 두 배열 합치기
 * 
 * 3
 * 1 3 5
 * 5
 * 2 3 6 7 9
 */
public class Problem01Solving {
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

		for (int x : solving(n, nArr, m, mArr)) {
			System.out.print(x + " ");
		}

		scan.close();
	}

	public static ArrayList<Integer> solving(int n, int[] nArr, int m, int[] mArr) {
		ArrayList<Integer> answer = new ArrayList<>();

		int p1 = 0;
		int p2 = 0;

		while (p1 < n && p2 < m) {
			if (nArr[p1] < mArr[p2]) {
				answer.add(nArr[p1++]);
			} else {
				answer.add(mArr[p2++]);
			}
		}

		while (p1 < n) {
			answer.add(nArr[p1++]);
		}

		while (p2 < m) {
			answer.add(mArr[p2++]);
		}

		return answer;
	}
}
