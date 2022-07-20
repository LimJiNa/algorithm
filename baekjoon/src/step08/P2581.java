package step08;

import java.util.Scanner;

/**
 * 소수
 */
public class P2581 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int M = scan.nextInt();
		int N = scan.nextInt();

		solution(M, N);

		scan.close();
	}

	public static void solution(int M, int N) {
		int sum = 0;
		int min = Integer.MAX_VALUE;

		for (int i = M; i <= N; i++) {
			boolean isPrime = true;

			if (i == 1) {
				continue;
			}

			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				sum += i;

				if (i < min) {
					min = i;
				}
			}
		}

		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
