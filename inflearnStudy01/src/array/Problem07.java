package array;

import java.util.Scanner;

/**
 * 점수 계산
 * 
 * 10
 * 1 0 1 1 1 0 0 1 1 0
 */
public class Problem07 {
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
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}

		return answer;
	}
}
