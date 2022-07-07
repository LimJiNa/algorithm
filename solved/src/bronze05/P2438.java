package bronze05;

import java.util.Scanner;

public class P2438 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		solution(n);

		scan.close();
	}

	public static void solution(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
