package bronze05;

import java.util.Scanner;

/**
 * A+B - 8
 */
public class P11022 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];

		for (int i = 0; i < t; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}

		System.out.println(solution(t, a, b));

		scan.close();
	}

	public static String solution(int t, int[] a, int[] b) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			sb.append("Case #").append(i + 1).append(": ").append(a[i]).append(" + ").append(b[i]).append(" = ")
					.append(a[i] + b[i]).append("\n");
		}

		return sb.toString();
	}
}
