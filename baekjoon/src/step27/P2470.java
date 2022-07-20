package step27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 두 용액
 */
public class P2470 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		solution(n, arr);
	}

	public static void solution(int n, int[] arr) {
		int min = Integer.MAX_VALUE;
		int lt = 0;
		int rt = n - 1;
		int sum = 0;

		int num1 = 0;
		int num2 = 0;

		Arrays.sort(arr);

		while (lt < rt) {
			sum = arr[lt] + arr[rt];

			if (Math.abs(sum) < min) {
				min = Math.abs(sum);

				num1 = arr[lt];
				num2 = arr[rt];
			}

			if (sum > 0) {
				rt--;
			} else {
				lt++;
			}
		}

		System.out.println(num1 + " " + num2);
	}
}
