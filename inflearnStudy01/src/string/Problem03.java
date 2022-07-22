package string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 문장 속 단어
 */
public class Problem03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		System.out.println(solving(str));

		scan.close();
	}

	public static String solution1(String str) {
		String answer = "";
		String[] arr = str.split(" ");
		int m = Integer.MIN_VALUE;

		for (String x : arr) {
			if (x.length() > m) {
				m = x.length();
				answer = x;
			}
		}

		return answer;
	}

	public static String solution2(String str) {
		String[] arr = str.split(" ");

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});

		return arr[0];
	}

	public static String solving(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;
		int pos = 0;

		while ((pos = str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, pos);

			if (tmp.length() > m) {
				m = tmp.length();
				answer = tmp;
			}

			str = str.substring(pos + 1);
		}

		if (str.length() > m) {
			m = str.length();
			answer = str;
		}

		return answer;
	}
}
