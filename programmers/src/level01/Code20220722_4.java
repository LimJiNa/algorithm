package level01;

import java.util.Arrays;

/**
 * 제일 작은 수 제거하기
 */
public class Code20220722_4 {
	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 2, 1 };
		System.out.println(Arrays.toString(solution(arr1)));

		int[] arr2 = { 10 };
		System.out.println(Arrays.toString(solution(arr2)));
	}

	/**
	 * +4
	 * 
	 * 테스트 1 〉	통과 (987.56ms, 93.7MB)
	 * 테스트 2 〉	통과 (9.26ms, 83.5MB)
	 * 테스트 3 〉	통과 (12.73ms, 82.2MB)
	 * 테스트 4 〉	통과 (8.52ms, 102MB)
	 * 테스트 5 〉	통과 (4.85ms, 75.4MB)
	 * 테스트 6 〉	통과 (20.10ms, 88.2MB)
	 * 테스트 7 〉	통과 (16.62ms, 86.8MB)
	 * 테스트 8 〉	통과 (4.98ms, 75.3MB)
	 * 테스트 9 〉	통과 (3.18ms, 82.4MB)
	 * 테스트 10 〉	통과 (4.24ms, 79.8MB)
	 * 테스트 11 〉	통과 (3.44ms, 74.8MB)
	 * 테스트 12 〉	통과 (4.17ms, 79.1MB)
	 * 테스트 13 〉	통과 (4.11ms, 79.1MB)
	 * 테스트 14 〉	통과 (11.34ms, 81.6MB)
	 * 테스트 15 〉	통과 (6.25ms, 77.4MB)
	 * 테스트 16 〉	통과 (14.33ms, 84.3MB)
	 */
	public static int[] solution(int[] arr) {
		if (arr.length <= 1) {
			return new int[] { -1 };
		} else {
			return Arrays.stream(arr).filter(m -> m != Arrays.stream(arr).min().getAsInt()).toArray();
		}
	}
}
