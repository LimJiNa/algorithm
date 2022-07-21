package bronze05;

import java.util.Scanner;

/**
 * 문자열
 */
public class P9086 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.next();
		}

		System.out.println(solution(arr));

		scan.close();
	}

	public static String solution(String[] arr) {
		StringBuilder sb = new StringBuilder();

		for (String str : arr) {
			sb.append(str.split("")[0]).append(str.split("")[str.length() - 1]).append("\n");
		}

		return sb.toString();
	}
}
