package bronze05;

import java.util.Scanner;

public class P1000 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(solution(a, b));

		scan.close();
	}

	public static int solution(int a, int b) {
		return (a + b);
	}
}
