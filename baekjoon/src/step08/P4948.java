package step08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 베르트랑 공준
 * 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
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
