package bronze05;

import java.util.Scanner;

/**
 * X보다 작은 수
 */
public class P10871 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.print(solution(n, arr, x));

		scan.close();
	}

	public static String solution(int n, int[] arr, int x) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			if (arr[i] < x) {
				sb.append(arr[i]).append(" ");
			}
		}

		return sb.toString();
	}
}
