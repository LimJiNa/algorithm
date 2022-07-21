package bronze05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 과제 안 내신 분..?
 */
public class P5597 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[28];

		for (int i = 0; i < 28; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(arr));

		scan.close();
	}

	public static String solution(int[] arr) {
		StringBuilder sb = new StringBuilder();

		Arrays.sort(arr);

		for (int i = 1; i <= 30; i++) {
			if (Arrays.binarySearch(arr, i) < 0) {
				sb.append((i)).append("\n");
			}
		}

		return sb.toString();
	}
}
