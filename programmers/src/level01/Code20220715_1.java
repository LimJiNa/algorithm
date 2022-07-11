package level01;

/**
 * 문자열을 정수로 바꾸기
 */
public class Code20220715_1 {
	public static void main(String[] args) {
		System.out.println(solution("1234"));
	}

	/**
	 * 테스트 1 〉	통과 (0.04ms, 73MB)
	 * 테스트 2 〉	통과 (0.03ms, 73MB)
	 * 테스트 3 〉	통과 (0.03ms, 70.6MB)
	 * 테스트 4 〉	통과 (0.03ms, 74.2MB)
	 * 테스트 5 〉	통과 (0.01ms, 73.8MB)
	 * 테스트 6 〉	통과 (0.02ms, 73.7MB)
	 * 테스트 7 〉	통과 (0.02ms, 75MB)
	 * 테스트 8 〉	통과 (0.04ms, 70MB)
	 * 테스트 9 〉	통과 (0.02ms, 72.1MB)
	 * 테스트 10 〉	통과 (0.03ms, 70.3MB)
	 * 테스트 11 〉	통과 (0.03ms, 74.1MB)
	 * 테스트 12 〉	통과 (0.05ms, 73.2MB)
	 * 테스트 13 〉	통과 (0.03ms, 76.1MB)
	 * 테스트 14 〉	통과 (0.02ms, 75.3MB)
	 * 테스트 15 〉	통과 (0.02ms, 78MB)
	 */
	public static int solution(String s) {
		return Integer.parseInt(s);
	}
}
