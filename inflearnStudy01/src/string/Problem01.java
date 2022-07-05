package string;

import java.util.Scanner;

/**
 * 문자 찾기
 * 
 * Computercooler
 * c
 */
public class Problem01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		char c = scan.next().charAt(0);

		System.out.println(solution(str, c));

		scan.close();
	}

	public static int solution(String str, char c) {
		int answer = 0;

		for (char x : str.toUpperCase().toCharArray()) {
			if (x == Character.toUpperCase(c)) {
				answer++;
			}
		}

		return answer;
	}

	public static int solving1(String str, char t) {
		int answer = 0;

		str = str.toUpperCase();
		t = Character.toUpperCase(t);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == t)
				answer++;
		}

		return answer;
	}

	public static int solving2(String str, char t) {
		int answer = 0;

		str = str.toUpperCase();
		t = Character.toUpperCase(t);

		for (char x : str.toCharArray()) {
			if (x == t)
				answer++;
		}

		return answer;
	}
}
