package bronze05;

import java.util.Scanner;

public class P15727 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int l = scan.nextInt();

		System.out.println(solution(l));

		scan.close();
	}

	public static int solution(int l) {
		return (l % 5 == 0) ? (l / 5) : (l / 5) + 1;
	}
}
