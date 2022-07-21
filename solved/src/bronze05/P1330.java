package bronze05;

import java.util.Scanner;

/**
 * 두 수 비교하기
 */
public class P1330 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(solution(a, b));

		scan.close();
	}

	public static String solution(int a, int b) {
		String answer = "";

		if (a > b) {
			answer = ">";
		} else if (a < b) {
			answer = "<";
		} else if (a == b) {
			answer = "==";
		}

		return answer;
	}
}
