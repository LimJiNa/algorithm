package bronze05;

import java.util.Scanner;

/**
 * 사분면 고르기
 */
public class P14681 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		System.out.println(solution(x, y));

		scan.close();
	}

	public static int solution(int x, int y) {
		int answer = 0;

		if (x > 0 && y > 0) {
			answer = 1;
		} else if (x > 0 && y < 0) {
			answer = 4;
		} else if (x < 0 && y < 0) {
			answer = 3;
		} else {
			answer = 2;
		}

		return answer;
	}
}
