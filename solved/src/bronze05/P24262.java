package bronze05;

import java.util.Scanner;

/**
 * 알고리즘 수업 - 알고리즘의 수행 시간 1
 */
public class P24262 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solution(n));

		scan.close();
	}

	public static String solution(int n) {
		StringBuilder sb = new StringBuilder();
		int tmp = n;

		sb.append(n / tmp);
		sb.append("\n");
		sb.append(0);

		return sb.toString();
	}
}
