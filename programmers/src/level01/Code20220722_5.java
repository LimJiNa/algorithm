package level01;

/**
 * 짝수와 홀수
 */
public class Code20220722_5 {
	public static void main(String[] args) {
		int num1 = 3;
		System.out.println(solution(num1));

		int num2 = 4;
		System.out.println(solution(num2));
	}

	/**
	 * 테스트 1 〉	통과 (0.01ms, 71.9MB)
	 * 테스트 2 〉	통과 (0.03ms, 73.4MB)
	 * 테스트 3 〉	통과 (0.02ms, 77.7MB)
	 * 테스트 4 〉	통과 (0.02ms, 75.6MB)
	 * 테스트 5 〉	통과 (0.02ms, 77MB)
	 * 테스트 6 〉	통과 (0.01ms, 72.8MB)
	 * 테스트 7 〉	통과 (0.02ms, 74.8MB)
	 * 테스트 8 〉	통과 (0.01ms, 73MB)
	 * 테스트 9 〉	통과 (0.01ms, 77MB)
	 * 테스트 10 〉	통과 (0.02ms, 73.6MB)
	 * 테스트 11 〉	통과 (0.02ms, 72.4MB)
	 * 테스트 12 〉	통과 (0.02ms, 74.7MB)
	 * 테스트 13 〉	통과 (0.02ms, 72.6MB)
	 * 테스트 14 〉	통과 (0.02ms, 76.6MB)
	 * 테스트 15 〉	통과 (0.02ms, 76.5MB)
	 * 테스트 16 〉	통과 (0.01ms, 67MB)
	 */
	public static String solution(int num) {
		if (num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
}
