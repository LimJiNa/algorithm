package bronze05;

import java.util.Scanner;

/**
 * 이상한 기호
 */
public class P15964 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();

		System.out.println(solution(a, b));

		scan.close();
	}

	public static long solution(long a, long b) {
		return (a + b) * (a - b);
	}
}
