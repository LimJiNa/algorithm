package bronze05;

import java.util.Scanner;

/**
 * 세금
 */
public class P20492 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solution(n));

		scan.close();
	}

	public static String solution(int n) {
		StringBuilder sb = new StringBuilder();

		sb.append((int) (n - (n * 0.22))).append(" ");
		sb.append((int) (n * 0.8) + (int) ((n * 0.2) - ((n * 0.2) * 0.22)));

		return sb.toString();
	}
}
