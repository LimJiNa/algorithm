package string;

import java.util.Scanner;

/**
 * 대소문자 변환
 * 
 * StuDY
 */
public class Problem02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solving1(str));

		scan.close();
	}

	public static String solution(String str) {
		String answer = "";

		for (char x : str.toCharArray()) {
			if (Character.isUpperCase(x)) {
				answer += Character.toLowerCase(x);
			} else {
				answer += Character.toUpperCase(x);
			}
		}

		return answer;
	}

	/**
	 * 65 ~ 90 대문자 아스키 범위
	 * 97 ~ 122 소문자 아스키 범위
	 * 범위의 차이 : 32
	 */
	public static String solving1(String str) {
		String answer = "";

		for (char x : str.toCharArray()) {
			if (x >= 65 && x <= 90) {
				answer += (char) (x+32);
			} else {
				answer += (char) (x-32);
			}
		}

		return answer;
	}
}
