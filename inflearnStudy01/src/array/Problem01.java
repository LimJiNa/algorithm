package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 * 
 * 6
 * 7 3 9 5 6 12
 */
public class Problem01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n + 1];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		for (int x : solving(n, arr)) {
			System.out.print(x + " ");
		}

		scan.close();
	}

	public static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);

		for (int i = 0; i < n; i++) {
			if (arr[i] < arr[i + 1]) {
				answer.add(arr[i + 1]);
			}
		}

		return answer;
	}

	public static ArrayList<Integer> solving(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);

		for (int i = 1; i < n; i++) {
			if (arr[i - 1] < arr[i]) {
				answer.add(arr[i]);
			}
		}

		return answer;
	}
}
