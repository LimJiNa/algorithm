package bronze05;

import java.util.Scanner;

/**
 * 가희와 방어율 무시
 */
public class P25238 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();

		System.out.println(solution(a, b));

		scan.close();
	}

	public static int solution(double a, double b) {
		return ((1 - ((a * b) / 100)) < 100) ? 1 : 0;
	}
}
