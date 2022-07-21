package bronze05;

import java.util.Scanner;

/**
 * 홍익대학교
 */
public class P16394 {
	public static final int year = 1946;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(n - year);

		scan.close();
	}
}
