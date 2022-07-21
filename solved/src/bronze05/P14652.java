package bronze05;

import java.util.Scanner;

/**
 * 나는 행복합니다~
 */
public class P14652 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		System.out.println(solution(str));

		scan.close();
	}

	public static String solution(String str) {
		StringBuilder sb = new StringBuilder();

		String[] arr = str.split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int x = Integer.parseInt(arr[2]);

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (x == cnt++) {
					sb.append(i).append(" ");
					sb.append(j);
					return sb.toString();
				}
			}
		}

		return sb.toString();
	}
}
