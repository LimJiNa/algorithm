package bronze05;

import java.util.Scanner;

/**
 * 합
 */
public class P8393 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solution(n));

		scan.close();
	}

	public static int solution(int n) {
		int answer = 0;

		for (int i = 0; i <= n; i++) {
			answer += i;
		}

		return answer;
	}
}
