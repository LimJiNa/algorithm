package bronze05;

import java.util.Scanner;

public class P10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		for (int x : solution(str)) {
			System.out.print(x + " ");
		}

		scan.close();
	}

	public static int[] solution(String str) {
		int[] answer = new int[26];
		int[] alpha = new int[26];

		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (i + 97);
		}

		for (int i = 0; i < answer.length; i++) {
			answer[i] = -1;
		}

		for (int j = 0; j < str.length(); j++) {
			for (int i = 0; i < alpha.length; i++) {

				if ((int) str.charAt(j) == alpha[i]) {
					if (answer[i] == -1) {
						answer[i] = j;
					}
				}
			}
		}

		return answer;
	}
}
