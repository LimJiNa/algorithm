package bronze05;

import java.util.Scanner;

public class P2753 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solution(n));

		scan.close();
	}

	public static int solution(int n) {
		return (((n % 4 == 0) && !(n % 100 == 0)) || (n % 400 == 0)) ? 1 : 0;
	}
}
