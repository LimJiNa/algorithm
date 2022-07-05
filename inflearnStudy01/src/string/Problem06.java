package string;

import java.util.Scanner;

/**
 * 중복문자제거
 * 
 * ksekkset
 */
public class Problem06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solving(str));

		scan.close();
	}

	public static String solution(String str) {
		String answer = "";

		for (char x : str.toCharArray()) {
			if (!answer.contains(String.valueOf(x))) {
				answer += x;
			}
		}

		return answer;
	}

	public static String solving(String str) {
		String answer = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}

		return answer;
	}
}
