package bronze05;

import java.util.Scanner;

/**
 * 큰 수 (BIG)
 */
public class P14928 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String n = scan.next();

		System.out.println(solution(n));

		scan.close();
	}

	public static long solution(String n) {
		long remainder = 0;
		for (int i = 0; i < n.length(); i++) {
			remainder = (remainder * 10 + (n.charAt(i) - '0')) % 20000303;
		}

		return remainder;
	}
}
