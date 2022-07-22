package twoPointersNslidingWindow;

import java.util.Scanner;

/**
 * 연속된 자연수의 합(수학)
 */
public class Problem05Math {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.println(solving(n));

		scan.close();
	}

	public static int solving(int n) {
		int answer = 0;
		int cnt = 1;

		n--;

		while (n > 0) {
			cnt++;
			n = (n - cnt);

			if (n % cnt == 0)
				answer++;
		}

		return answer;
	}
}
