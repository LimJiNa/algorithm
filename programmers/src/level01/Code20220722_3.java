package level01;

/**
 * 정수 제곱근 판별
 */
public class Code20220722_3 {
	public static void main(String[] args) {
		long n1 = 121;
		System.out.println(solution(n1));

		long n2 = 3;
		System.out.println(solution(n2));
	}

	/**
	 * +3
	 * 
	 * 테스트 1 〉	통과 (0.06ms, 77.5MB)
	 * 테스트 2 〉	통과 (0.04ms, 74.6MB)
	 * 테스트 3 〉	통과 (0.10ms, 76.2MB)
	 * 테스트 4 〉	통과 (0.03ms, 72.7MB)
	 * 테스트 5 〉	통과 (0.04ms, 88.1MB)
	 * 테스트 6 〉	통과 (0.06ms, 74.6MB)
	 * 테스트 7 〉	통과 (0.04ms, 76.7MB)
	 * 테스트 8 〉	통과 (0.03ms, 78.3MB)
	 * 테스트 9 〉	통과 (0.04ms, 69.1MB)
	 * 테스트 10 〉	통과 (0.03ms, 82.9MB)
	 * 테스트 11 〉	통과 (0.04ms, 77.5MB)
	 * 테스트 12 〉	통과 (0.05ms, 77.1MB)
	 * 테스트 13 〉	통과 (0.07ms, 74.9MB)
	 * 테스트 14 〉	통과 (0.03ms, 74.1MB)
	 * 테스트 15 〉	통과 (0.04ms, 72.9MB)
	 * 테스트 16 〉	통과 (0.04ms, 83.9MB)
	 * 테스트 17 〉	통과 (0.03ms, 73.2MB)
	 * 테스트 18 〉	통과 (0.03ms, 75.7MB)
	 */
	public static long solution(long n) {
		if (Math.pow((int) Math.sqrt(n), 2) == n) {
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		}

		return -1;
	}
}
