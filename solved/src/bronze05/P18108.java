package bronze05;

import java.util.Scanner;

/**
 * 1998년생인 내가 태국에서는 2541년생?!
 */
public class P18108 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int y = scan.nextInt();

		System.out.println(solution(y));

		scan.close();
	}

	public static int solution(int y) {
		return y - 543;
	}
}
