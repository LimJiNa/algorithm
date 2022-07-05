package step08;

import java.util.Scanner;

/**
 * 소수 구하기
 * 
 * 3 16
 */
public class P1929 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int M = scan.nextInt();
		int N = scan.nextInt();

		solution(M, N);

		scan.close();
	}

	public static void solution(int M, int N) {
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
				System.out.println(i);
			}
		}
	}
}
