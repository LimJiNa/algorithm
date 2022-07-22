package array;

import java.util.Scanner;

/**
 * 보이는 학생
 */
public class Problem02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solving(n, arr));

		scan.close();
	}

	public static int solution(int n, int[] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}

		return answer;
	}

	public static int solving(int n, int[] arr) {
		int answer = 1;
		int max = arr[0];

		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}

		return answer;
	}
}
