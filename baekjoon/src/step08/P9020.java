package step08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 골드바흐의 추측 : 골드바흐 파티션 구하기
 * 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것을 골드바흐의 수라고 한다.
 * 또 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
 */
public class P9020 {
	public static boolean[] prime = new boolean[10001];

	public static void setPrime() {
		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i]) {
				continue;
			}

			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		setPrime();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int first = n / 2;
			int second = n / 2;

			while (true) {
				if (!prime[first] && !prime[second]) {
					sb.append(first).append(" ").append(second).append("\n");
					break;
				}

				first--;
				second++;
			}
		}

		System.out.println(sb.toString());
	}
}
