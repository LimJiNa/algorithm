package bronze05;

import java.util.Scanner;

public class P2475 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		System.out.println(solution(str));

		scan.close();
	}

	public static int solution(String str) {
		String[] arr = str.split(" ");
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int tmp = Integer.parseInt(arr[i]);
			sum += Math.pow(tmp, 2);
		}

		return (sum % 10);
	}
}
