package bronze05;

import java.util.Scanner;

public class P10926 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solution(str));

		scan.close();
	}

	public static String solution(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str).append("??!");
		return sb.toString();
	}
}
