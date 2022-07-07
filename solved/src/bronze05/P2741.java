package bronze05;

import java.util.Scanner;

public class P2741 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solution(n));

		scan.close();
	}

	public static String solution(int n) {
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			sb.append(i).append("\n");
		}

		return sb.toString();
	}
}
