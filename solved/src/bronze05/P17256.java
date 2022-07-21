package bronze05;

import java.util.Scanner;

/**
 * 달달함이 넘쳐흘러
 */
public class P17256 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String a = scan.nextLine();
		String c = scan.nextLine();

		System.out.println(solution(a, c));

		scan.close();
	}

	public static String solution(String a, String c) {
		StringBuilder sb = new StringBuilder();

		int ax = Integer.parseInt(a.split(" ")[0]);
		int ay = Integer.parseInt(a.split(" ")[1]);
		int az = Integer.parseInt(a.split(" ")[2]);

		int cx = Integer.parseInt(c.split(" ")[0]);
		int cy = Integer.parseInt(c.split(" ")[1]);
		int cz = Integer.parseInt(c.split(" ")[2]);

		sb.append(cx - az).append(" ");
		sb.append(cy / ay).append(" ");
		sb.append(cz - ax).append(" ");

		return sb.toString();
	}
}
