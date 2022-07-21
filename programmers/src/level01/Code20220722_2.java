package level01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 정수 내림차순으로 배치하기
 */
public class Code20220722_2 {
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}

	/**
	 * +1
	 * 
	 * 테스트 1 〉	통과 (1.75ms, 78.8MB)
	 * 테스트 2 〉	통과 (1.57ms, 77.7MB)
	 * 테스트 3 〉	통과 (1.80ms, 73.4MB)
	 * 테스트 4 〉	통과 (1.47ms, 76.2MB)
	 * 테스트 5 〉	통과 (1.71ms, 84.2MB)
	 * 테스트 6 〉	통과 (1.47ms, 85.6MB)
	 * 테스트 7 〉	통과 (1.63ms, 73.9MB)
	 * 테스트 8 〉	통과 (1.44ms, 75.6MB)
	 * 테스트 9 〉	통과 (1.70ms, 67.7MB)
	 * 테스트 10 〉	통과 (1.64ms, 77.8MB)
	 * 테스트 11 〉	통과 (1.45ms, 76MB)
	 * 테스트 12 〉	통과 (1.58ms, 74.3MB)
	 * 테스트 13 〉	통과 (1.52ms, 79.8MB)
	 * 테스트 14 〉	통과 (1.48ms, 73.9MB)
	 * 테스트 15 〉	통과 (1.62ms, 74MB)
	 * 테스트 16 〉	통과 (1.43ms, 72.9MB)
	 */
	public static long solution(long n) {
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr, Comparator.reverseOrder());

		String answer = "";
		for (String x : arr) {
			answer += x;
		}

		return Long.parseLong(answer);
	}

	public static String res = "";
	public static int solution1(int n) {
		res = "";
		Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char) c) + res);
		return Integer.parseInt(res);
	}

	public static long solution2(long n) {
		return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char) ch).sorted(Comparator.reverseOrder())
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString());
	}
}
