package bronze05;

import java.util.Scanner;

public class P16430 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(solution(a, b));

		scan.close();
	}

	public static String solution(int a, int b) {
		StringBuilder sb = new StringBuilder();

		sb.append(b - a).append(" ");
		sb.append(b);

		return sb.toString();
	}
}
