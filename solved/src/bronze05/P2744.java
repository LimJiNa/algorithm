package bronze05;

import java.util.Scanner;

/**
 * 대소문자 바꾸기
 */
public class P2744 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solution(str));

		scan.close();
	}

	public static String solution(String str) {
		StringBuilder sb = new StringBuilder();

		for (char x : str.toCharArray()) {
			if (Character.isUpperCase(x)) {
				sb.append(Character.toLowerCase(x));
			} else {
				sb.append(Character.toUpperCase(x));
			}
		}

		return sb.toString();
	}
}
