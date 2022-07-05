package string;

import java.util.Scanner;

/**
 * 문자열 압축
 * 
 * KKHSSSSSSSE
 * KSTTTSEEKFKKKDJJGG
 */
public class Problem11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solution(str));

		scan.close();
	}

	public static String solution(String str) {
		String answer = "";
		str = str + " ";
		int cnt = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				answer += str.charAt(i);

				if (cnt > 1) {
					answer += cnt;
					cnt = 1;
				}
			}
		}

		return answer;
	}
}
