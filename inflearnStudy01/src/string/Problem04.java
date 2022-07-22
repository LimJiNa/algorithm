package string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 단어 뒤집기
 */
public class Problem04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.next();
		}

		for (String str : solving2(n, arr)) {
			System.out.println(str);
		}

		scan.close();
	}

	public static String[] solution(int n, String[] arr) {
		String[] answer = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			answer[i] = sb.reverse().toString();
		}

		return answer;
	}

	public static ArrayList<String> solving1(int n, String[] arr) {
		ArrayList<String> answer = new ArrayList<>();

		for (String x : arr) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}

		return answer;
	}

	public static ArrayList<String> solving2(int n, String[] arr) {
		ArrayList<String> answer = new ArrayList<>();

		for (String x : arr) {
			char[] c = x.toCharArray();
			int lt = 0;
			int rt = (c.length - 1);

			while (lt < rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;

				lt++;
				rt--;
			}

			answer.add(String.valueOf(c));
		}

		return answer;
	}
}
