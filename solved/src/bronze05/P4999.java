package bronze05;

import java.util.Scanner;

public class P4999 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str1 = scan.next();
		String str2 = scan.next();

		System.out.println(solution(str1, str2));

		scan.close();
	}

	public static String solution(String str1, String str2) {
		return (str1.length() >= str2.length()) ? "go" : "no";
	}
}
