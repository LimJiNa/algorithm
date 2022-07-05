package string;

import java.util.Scanner;

/**
 * 숫자만 추출
 * 
 * g0en2T0s8eSoft
 */
public class Problem09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solving2(str));

		scan.close();
	}

	public static int solution(String str) {
		return Integer.parseInt(str.replaceAll("[^0-9]", ""));
	}

	/**
	 * 48 ~ 57 숫자 문자열 0 ~ 9까지 아스키 범위
	 */
	public static int solving1(String str) {
		int answer = 0;

		for (char x : str.toCharArray()) {
			if (x >= 48 && x <= 57) {
				answer = answer * 10 + (x - 48);
			}
		}
		return answer;
	}

	public static int solving2(String str) {
		String answer = "";

		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) {
				answer += x;
			}
		}
		return Integer.parseInt(answer);
	}
}
