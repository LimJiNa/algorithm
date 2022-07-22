package array;

import java.util.Scanner;

/**
 * 가위바위보
 */
public class Problem03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < n; i++) {
			b[i] = scan.nextInt();
		}

		for (char x : solving(n, a, b).toCharArray()) {
			System.out.println(x);
		}

		scan.close();
	}

	public static String solution(int n, int[] a, int[] b) {
		String answer = "";

		/**
		 * 1: 가위 2: 바위 3: 보
		 */
		for (int i = 0; i < n; i++) {
			if (a[i] == 1) {
				if (b[i] == 1) {
					answer += "D";
				} else if (b[i] == 2) {
					answer += "B";
				} else {
					answer += "A";
				}
			} else if (a[i] == 2) {
				if (b[i] == 1) {
					answer += "A";
				} else if (b[i] == 2) {
					answer += "D";
				} else {
					answer += "B";
				}
			} else if (a[i] == 3) {
				if (b[i] == 1) {
					answer += "B";
				} else if (b[i] == 2) {
					answer += "A";
				} else {
					answer += "D";
				}
			}
		}

		return answer;
	}

	public static String solving(int n, int[] a, int[] b) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			if (a[i] == b[i]) {
				answer += "D";
			} else if (a[i] == 1 && b[i] == 3) {
				answer += "A";
			} else if (a[i] == 2 && b[i] == 1) {
				answer += "A";
			} else if (a[i] == 3 && b[i] == 2) {
				answer += "A";
			} else {
				answer += "B";
			}
		}

		return answer;
	}
}
