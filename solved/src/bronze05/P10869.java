package bronze05;

import java.util.Scanner;

public class P10869 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		System.out.println(solution(str));

		scan.close();
	}

	public static String solution(String str) {
		String[] arr = str.split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);

		StringBuilder sb = new StringBuilder();
		sb.append(num1 + num2).append("\n");
		sb.append(num1 - num2).append("\n");
		sb.append(num1 * num2).append("\n");
		sb.append(num1 / num2).append("\n");
		sb.append(num1 % num2).append("\n");

		return sb.toString();
	}
}
