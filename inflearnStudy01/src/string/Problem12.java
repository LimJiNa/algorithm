package string;

import java.util.Scanner;

/**
 * 암호
 */
public class Problem12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String str = scan.next();

		System.out.println(solving(n, str));

		scan.close();
	}

	public static String solution(int n, String str) {
		String answer = "";
		int pos = 7;
		String tmp = "";

		for (int i = 0; i < n; i++) {
			tmp = str.substring(0, pos).replaceAll("[#]", "1").replaceAll("[*]", "0");
			answer += (char) Integer.parseInt(tmp, 2);
			str = str.substring(pos);
		}

		return answer;
	}

	public static String solving(int n, String str) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char) num;
			str = str.substring(7);
		}

		return answer;
	}
}
