package bronze05;

import java.util.Scanner;

public class P10872 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solution(n));

		scan.close();
	}

	public static int solution(int n) {
		if (n <= 0) {
			return 1;
		} else {
			return n * solution(n - 1);
		}
	}
}
