package level01;

import java.util.Arrays;

/**
 * 서울에서 김서방 찾기
 */
public class Code20220708_3 {
	public static void main(String[] args) {
		String[] seoul = { "Jane", "Kim" };

		System.out.println(solution(seoul));
	}

	/**
	 * 테스트 1 〉   통과 (5.56ms, 71.3MB)
	 * 테스트 2 〉   통과 (9.50ms, 78.7MB)
	 * 테스트 3 〉   통과 (5.74ms, 74.5MB)
	 * 테스트 4 〉   통과 (6.06ms, 80MB)
	 * 테스트 5 〉   통과 (5.64ms, 72.7MB)
	 * 테스트 6 〉   통과 (5.61ms, 69.9MB)
	 * 테스트 7 〉   통과 (5.93ms, 77.1MB)
	 * 테스트 8 〉   통과 (5.83ms, 78.1MB)
	 * 테스트 9 〉   통과 (5.62ms, 76.8MB)
	 * 테스트 10 〉   통과 (6.09ms, 73.3MB)
	 * 테스트 11 〉   통과 (5.48ms, 78MB)
	 * 테스트 12 〉   통과 (6.13ms, 75.4MB)
	 * 테스트 13 〉   통과 (8.16ms, 77.8MB)
	 * 테스트 14 〉   통과 (5.65ms, 80.5MB)
	 */
	public static String solution(String[] seoul) {
		return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
	}
}
