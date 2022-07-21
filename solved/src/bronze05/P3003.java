package bronze05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 킹, 퀸, 룩, 비숍, 나이트, 폰
 */
public class P3003 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		System.out.println(solution(str));

		scan.close();
	}

	public static String solution(String str) {
		Map<Integer, Integer> countMap = getCount();

		StringBuilder sb = new StringBuilder();
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			int tmp = Integer.parseInt(arr[i]);

			if (tmp < countMap.get(i)) {
				sb.append(countMap.get(i) - tmp).append(" ");
			} else if (tmp > countMap.get(i)) {
				sb.append("-").append(tmp - countMap.get(i)).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}

		return sb.toString();
	}

	public static Map<Integer, Integer> getCount() {
		Map<Integer, Integer> countMap = new HashMap<>();
		countMap.put(0, 1);
		countMap.put(1, 1);
		countMap.put(2, 2);
		countMap.put(3, 2);
		countMap.put(4, 2);
		countMap.put(5, 8);
		return countMap;
	}
}
