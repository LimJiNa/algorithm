package bronze05;

import java.util.Scanner;

/**
 * 시험 성적
 */
public class P9498 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solution(n));

		scan.close();
	}

	public static char solution(int n) {
		char answer = 0;

		if (n <= 100 && n >= 90) {
			answer = 'A';
		} else if (n <= 89 && n >= 80) {
			answer = 'B';
		} else if (n <= 79 && n >= 70) {
			answer = 'C';
		} else if (n <= 69 && n >= 60) {
			answer = 'D';
		} else {
			answer = 'F';
		}

		return answer;
	}
}
