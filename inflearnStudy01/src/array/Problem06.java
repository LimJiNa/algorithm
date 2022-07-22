package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 뒤집은 소수
 */
public class Problem06 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(n, arr));
		
		for(int x : solving(n, arr)) {
			System.out.print(x + " ");
		}

		scan.close();
	}

	public static String solution(int n, int[] arr) {
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
			boolean isPrime = true;

			if (tmp == 1) {
				continue;
			}

			for (int j = 2; j < tmp; j++) {
				if (tmp % j == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				answer.append(tmp).append(" ");
			}
		}

		return answer.toString();
	}

	public static ArrayList<Integer> solving(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int res = 0;

			while (tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}

			if (isPrime(res)) {
				answer.add(res);
			}
		}

		return answer;
	}

	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
