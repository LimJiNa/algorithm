package hashMapNtreeSet;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 아나그램(해쉬) : 두 문자열이 알파벳의 나열 순서는 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 한다.
 */
public class Problem02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str1 = scan.next();
		String str2 = scan.next();

		System.out.println(solution(str1, str2));

		scan.close();
	}

	public static String solution(String str1, String str2) {
		String answer = "YES";

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
			map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
		}

		for (char x : map1.keySet()) {
			if (map1.get(x) != map2.get(x)) {
				return "NO";
			}
		}

		return answer;
	}

	public static String solving(String str1, String str2) {
		String answer = "YES";

		HashMap<Character, Integer> map = new HashMap<>();

		for (char x : str1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		for (char x : str2.toCharArray()) {
			if (!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			} else {
				map.put(x, map.get(x) - 1);
			}
		}

		return answer;
	}
}
