package string;

import java.util.Scanner;

/**
 * 회문문자열 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
 */
public class Problem07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solving2(str));

		scan.close();
	}

	public static String solution(String str) {
		return (str.toUpperCase().equals(new StringBuilder(str.toUpperCase()).reverse().toString())) ? "YES" : "NO";
	}

	public static String solving1(String str) {
		str = str.toUpperCase();
		String answer = "YES";
		int len = str.length();

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return "NO";
			}
		}

		return answer;
	}

	public static String solving2(String str) {
		String answer = "NO";

		if (new StringBuilder(str).reverse().toString().equalsIgnoreCase(str)) {
			return "YES";
		}

		return answer;
	}
}
