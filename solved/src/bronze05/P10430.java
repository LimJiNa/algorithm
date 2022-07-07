package bronze05;

import java.util.Scanner;

public class P10430 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] str = scan.nextLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);

		StringBuilder sb = new StringBuilder();
		sb.append((a + b) % c).append("\n");
		sb.append(((a % c) + (b % c)) % c).append("\n");
		sb.append((a * b) % c).append("\n");
		sb.append(((a % c) * (b % c)) % c);

		System.out.println(sb.toString());

		scan.close();
	}
}
