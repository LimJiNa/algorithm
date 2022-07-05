package string;

import java.util.Scanner;

/**
 * 특정 문자 뒤집기
 * 
 * a#b!GE*T@S
 */
public class Problem05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(solution(str));

		scan.close();
	}

	public static String solution(String str) {
		char[] x = str.toCharArray();
		int lt = 0;
		int rt = (x.length - 1);

		while (lt < rt) {
			if (!Character.isAlphabetic(x[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(x[rt])) {
				rt--;
			} else {
				char tmp = x[lt];
				x[lt] = x[rt];
				x[rt] = tmp;
				lt++;
				rt--;
			}
		}

		return String.valueOf(x);
	}
}
