package bronze05;

import java.util.Scanner;

/**
 * 개수 세기
 */
public class P10807 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int v = scan.nextInt();

		System.out.println(solution(n, arr, v));

		scan.close();
	}

	public static int solution(int n, int[] arr, int v) {
		int answer = 0;

		for (int x : arr) {
			if (v == x) {
				answer++;
			}
		}

		return answer;
	}
}
