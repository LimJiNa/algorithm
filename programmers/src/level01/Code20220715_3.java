package level01;

/**
 * 약수의 합
 */
public class Code20220715_3 {
	public static void main(String[] args) {
		int n1 = 12;
		System.out.println(solution(n1));

		int n2 = 5;
		System.out.println(solution(n2));
	}

	/**
	 * +1
	 * 
	 * 테스트 1 〉	통과 (0.01ms, 73.3MB)
	 * 테스트 2 〉	통과 (0.02ms, 77.2MB)
	 * 테스트 3 〉	통과 (0.02ms, 76.4MB)
	 * 테스트 4 〉	통과 (0.02ms, 79.1MB)
	 * 테스트 5 〉	통과 (0.04ms, 73.7MB)
	 * 테스트 6 〉	통과 (0.02ms, 75.9MB)
	 * 테스트 7 〉	통과 (0.05ms, 80.2MB)
	 * 테스트 8 〉	통과 (0.02ms, 76.6MB)
	 * 테스트 9 〉	통과 (0.05ms, 79.2MB)
	 * 테스트 10 〉	통과 (0.05ms, 71.4MB)
	 * 테스트 11 〉	통과 (0.04ms, 75MB)
	 * 테스트 12 〉	통과 (0.05ms, 74.7MB)
	 * 테스트 13 〉	통과 (0.02ms, 75.5MB)
	 * 테스트 14 〉	통과 (0.04ms, 77.6MB)
	 * 테스트 15 〉	통과 (0.05ms, 72.7MB)
	 * 테스트 16 〉	통과 (0.01ms, 77.6MB)
	 * 테스트 17 〉	통과 (0.07ms, 71.2MB)
	 */
	public static int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}

		return answer;
	}
}
