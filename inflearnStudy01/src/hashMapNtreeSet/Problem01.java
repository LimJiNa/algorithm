package hashMapNtreeSet;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 학급 회장(해쉬)
 */
public class Problem01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String str = scan.next();

		System.out.println(solution(n, str));

		scan.close();
	}

	public static char solution(int n, String str) {
		char answer = 0;

		HashMap<Character, Integer> map = new HashMap<>();
		for (char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		int max = Integer.MIN_VALUE;
		for (char x : map.keySet()) {
			if (map.get(x) > max) {
				max = map.get(x);
				answer = x;
			}
		}

		return answer;
	}
}
