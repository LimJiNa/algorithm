package step08;

import java.util.Scanner;

/**
 * 소수 찾기
 * 
 * 4
 * 1 3 5 7
 */
public class P1978 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(n, arr));

		scan.close();
	}

	public static int solution(int n, int[] arr) {
		int answer = 0;

		for (int i = 0; i < n; i++) {
			boolean isPrime = true;
			
			if(arr[i] == 1) {
				continue;
			}

			for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
				if (arr[i] % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				answer++;
			}
		}

		return answer;
	}
}
