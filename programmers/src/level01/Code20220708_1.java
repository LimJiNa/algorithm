package level01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 문자열 내림차순으로 배치하기
 */
public class Code20220708_1 {
	public static void main(String[] args) {
		String s1 = "Zbcdefg";
		String s2 = "ZbcDefg";

		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}

	/**
	 * +2
	 * 
	 * 테스트 1 〉   통과 (2.30ms, 71.6MB)
	 * 테스트 2 〉   통과 (0.39ms, 76.2MB)
	 * 테스트 3 〉   통과 (1.52ms, 72.5MB)
	 * 테스트 4 〉   통과 (1.57ms, 81.4MB)
	 * 테스트 5 〉   통과 (1.45ms, 85.2MB)
	 * 테스트 6 〉   통과 (1.46ms, 73.3MB)
	 * 테스트 7 〉   통과 (1.24ms, 69.2MB)
	 * 테스트 8 〉   통과 (1.94ms, 76MB)
	 * 테스트 9 〉   통과 (0.45ms, 77MB)
	 * 테스트 10 〉   통과 (0.39ms, 76.9MB)
	 * 테스트 11 〉   통과 (0.34ms, 72.8MB)
	 * 테스트 12 〉   통과 (0.37ms, 80.5MB)
	 * 테스트 13 〉   통과 (0.39ms, 67.5MB)
	 * 테스트 14 〉   통과 (0.34ms, 78.1MB)
	 * 테스트 15 〉   통과 (0.34ms, 73.8MB)
	 * 테스트 16 〉   통과 (0.34ms, 73.5MB)
	 */
	public static String solution(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new StringBuilder(new String(arr)).reverse().toString();
	}

	public static String solution1(String str) {
		return Stream.of(str.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
	}
}
