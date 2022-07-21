package level01;

import java.util.Arrays;

/**
 * 자연수 뒤집어 배열로 만들기
 */
public class Code20220722_1 {
	public static void main(String[] args) {
		long n = 12345;
		System.out.println(Arrays.toString(solution(n)));
	}

	/**
	 * 테스트 1 〉	통과 (2.48ms, 83.9MB)
	 * 테스트 2 〉	통과 (2.30ms, 78.3MB)
	 * 테스트 3 〉	통과 (2.50ms, 74.4MB)
	 * 테스트 4 〉	통과 (3.02ms, 74.8MB)
	 * 테스트 5 〉	통과 (2.05ms, 74.6MB)
	 * 테스트 6 〉	통과 (2.45ms, 77.7MB)
	 * 테스트 7 〉	통과 (2.21ms, 72.9MB)
	 * 테스트 8 〉	통과 (2.15ms, 79.7MB)
	 * 테스트 9 〉	통과 (2.46ms, 77.8MB)
	 * 테스트 10 〉	통과 (1.84ms, 75MB)
	 * 테스트 11 〉	통과 (1.91ms, 74.5MB)
	 * 테스트 12 〉	통과 (2.13ms, 72.3MB)
	 * 테스트 13 〉	통과 (1.98ms, 79.2MB)
	 */
	public static int[] solution(long n) {
		String[] tmp = String.valueOf(n).split("");

		int lt = 0;
		int rt = tmp.length - 1;

		while (lt < rt) {
			String t = tmp[lt];
			tmp[lt] = tmp[rt];
			tmp[rt] = t;
			lt++;
			rt--;
		}

		return Arrays.stream(tmp).mapToInt(Integer::parseInt).toArray();
	}
}
