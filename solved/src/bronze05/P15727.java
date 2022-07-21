package bronze05;

import java.util.Scanner;

/**
 * 조별과제를 하려는데 조장이 사라졌다
 */
public class P15727 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int l = scan.nextInt();

		System.out.println(solution(l));

		scan.close();
	}

	public static int solution(int l) {
		return (l % 5 == 0) ? (l / 5) : (l / 5) + 1;
	}
}
