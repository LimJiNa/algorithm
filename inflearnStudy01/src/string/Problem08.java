package string;

import java.util.Scanner;

/**
 * 유효한 팰린드롬 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
 * 
 * found7, time: study; Yduts; emit, 7Dnuof
 */
public class Problem08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		System.out.println(solution(str));

		scan.close();
	}

	public static String solution(String str) {
		String answer = "NO";
		String tmp = str.replaceAll("[^a-zA-Z]", "");

		if (new StringBuilder(tmp).reverse().toString().equalsIgnoreCase(tmp)) {
			return "YES";
		}

		return answer;
	}

	public static String solving(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();

		if (str.equals(tmp)) {
			return "YES";
		}

		return answer;
	}
}
