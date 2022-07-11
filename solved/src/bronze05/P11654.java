package bronze05;

import java.util.Scanner;

public class P11654 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char x = scan.next().charAt(0);

		System.out.println(solution(x));

		scan.close();
	}

	public static int solution(char x) {
		return (int) x;
	}
}
