package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 문자열 내 마음대로 정렬하기
 * 
 * @author jinalim
 */
public class Code20220701_1 {
	public static void main(String[] args) {
		String[] strings1 = { "sun", "bed", "car" };
		int n1 = 1;

		String[] strings2 = { "abce", "abcd", "cdx" };
		int n2 = 2;

		System.out.println(Arrays.toString(solution(strings1, n1)));
		System.out.println(Arrays.toString(solution(strings2, n2)));
	}

	/**
	 * 테스트 1 〉	통과 (13.29ms, 79.5MB)
	 * 테스트 2 〉	통과 (9.08ms, 77.3MB)
	 * 테스트 3 〉	통과 (9.54ms, 77.1MB)
	 * 테스트 4 〉	통과 (9.11ms, 79.3MB)
	 * 테스트 5 〉	통과 (9.13ms, 78.3MB)
	 * 테스트 6 〉	통과 (9.37ms, 78.8MB)
	 * 테스트 7 〉	통과 (9.07ms, 85.4MB)
	 * 테스트 8 〉	통과 (9.76ms, 81.5MB)
	 * 테스트 9 〉	통과 (9.28ms, 78.3MB)
	 * 테스트 10 〉	통과 (9.24ms, 75.7MB)
	 * 테스트 11 〉	통과 (9.36ms, 87.6MB)
	 * 테스트 12 〉	통과 (9.46ms, 77.9MB)
	 */
	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		List<String> array = new ArrayList<>();
		for (String string : strings) {
			array.add(string.charAt(n) + string);
		}

		Collections.sort(array);

		for (int i = 0; i < array.size(); i++) {
			answer[i] = array.get(i).substring(1, array.get(i).length());
		}

		return answer;
	}

	public String[] solution1(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.charAt(n) > s2.charAt(n))
					return 1;
				else if (s1.charAt(n) == s2.charAt(n))
					return s1.compareTo(s2);
				else if (s1.charAt(n) < s2.charAt(n))
					return -1;
				else
					return 0;
			}
		});
		return strings;
	}

	public String[] solution2(String[] strings, int n) {
		Arrays.sort(strings);
		Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
		return strings;
	}
}
