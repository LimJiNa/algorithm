package bronze05;

import java.util.Scanner;

/**
 * 카드 게임
 */
public class P5522 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			sum += scan.nextInt();
		}

		System.out.println(sum);

		scan.close();
	}
}
