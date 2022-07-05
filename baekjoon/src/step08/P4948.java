package step08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 베르트랑 공준
 * 
 * 1
 * 10
 * 13
 * 100
 * 1000
 * 10000
 * 100000
 * 0
 */
public class P4948 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;

		while ((n = Integer.parseInt(br.readLine())) != 0) {
			solution(n);
		}
	}

	public static void solution(int n) {
		int count = 0;

		for (int i = n + 1; i <= (n * 2); i++) {
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
				count++;
			}
		}

		System.out.println(count);
	}
}
