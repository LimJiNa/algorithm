package bronze05;

import java.util.Scanner;

public class P1008 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextInt();
		double b = scan.nextInt();

		System.out.println(solution(a, b));

		scan.close();
	}

	public static double solution(double a, double b) {
		return (a / b);
	}
}
