package twoPointersNslidingWindow;

import java.util.Scanner;

/**
 * 최대 길이 연속부분수열
 */
public class Problem06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solving(n, k, arr));

		scan.close();
	}

	public static int solution(int n, int k, int[] arr) {
		int answer = 0;
		int lt = 0;
		int cnt = 0;

		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] == 0) {
				cnt++;
			}

			while (cnt > k) {
				if (arr[lt++] == 0) {
					cnt--;
				}
			}

			if (arr[rt] == 1) {
				answer = Math.max(answer, rt - lt + 1);
			}
		}

		return answer;
	}

	public static int solving(int n, int k, int[] arr) {
		int answer = 0;
		int lt = 0;
		int cnt = 0;

		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] == 0) {
				cnt++;
			}

			while (cnt > k) {
				if (arr[lt++] == 0) {
					cnt--;
				}
			}

			answer = Math.max(answer, rt - lt + 1);
		}

		return answer;
	}
}
