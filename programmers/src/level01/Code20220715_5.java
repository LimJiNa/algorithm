package level01;

/**
 * 자릿수 더하기
 */
public class Code20220715_5 {
	public static void main(String[] args) {
		int n1 = 123;
		System.out.println(solution(n1));

		int n2 = 987;
		System.out.println(solution(n2));
	}

	/**
	 * 테스트 1 〉	통과 (0.02ms, 79.1MB)
	 * 테스트 2 〉	통과 (0.01ms, 77.4MB)
	 * 테스트 3 〉	통과 (0.03ms, 74.1MB)
	 * 테스트 4 〉	통과 (0.02ms, 72.4MB)
	 * 테스트 5 〉	통과 (0.01ms, 77.2MB)
	 * 테스트 6 〉	통과 (0.02ms, 76.6MB)
	 * 테스트 7 〉	통과 (0.01ms, 69.8MB)
	 * 테스트 8 〉	통과 (0.02ms, 77.2MB)
	 * 테스트 9 〉	통과 (0.02ms, 72.3MB)
	 * 테스트 10 〉	통과 (0.02ms, 75.5MB)
	 * 테스트 11 〉	통과 (0.02ms, 74.4MB)
	 * 테스트 12 〉	통과 (0.02ms, 72.9MB)
	 * 테스트 13 〉	통과 (0.01ms, 74.6MB)
	 * 테스트 14 〉	통과 (0.02ms, 75.8MB)
	 * 테스트 15 〉	통과 (0.01ms, 72.9MB)
	 * 테스트 16 〉	통과 (0.02ms, 76.5MB)
	 * 테스트 17 〉	통과 (0.03ms, 76.5MB)
	 * 테스트 18 〉	통과 (0.02ms, 76.5MB)
	 * 테스트 19 〉	통과 (0.02ms, 77.8MB)
	 * 테스트 20 〉	통과 (0.01ms, 73.9MB)
	 * 테스트 21 〉	통과 (0.02ms, 75MB)
	 */
	public static int solution(int n) {
		int answer = 0;

		while (n != 0) {
			answer += n % 10;
			n = n / 10;
		}

		return answer;
	}
}
