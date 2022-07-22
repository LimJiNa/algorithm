package array;

import java.util.Scanner;

/**
 * 피보나치수열 : 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
 */
public class Problem04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int x : solving1(n)) {
			System.out.print(x + " ");
		}

		System.out.println();

		solving2(n);

		scan.close();
	}

	public static int[] solution(int n) {
		int[] answer = new int[n];

		for (int i = 0; i < n; i++) {
			if (i < 2) {
				answer[i] = 1;
			} else {
				answer[i] = answer[i - 1] + answer[i - 2];
			}
		}

		return answer;
	}

	public static int[] solving1(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;

		for (int i = 2; i < n; i++) {
			answer[i] = answer[i - 1] + answer[i - 2];
		}

		return answer;
	}

	public static void solving2(int n) {
		int a = 1;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b + " ");

		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
