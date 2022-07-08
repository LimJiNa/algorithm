package level01;

/**
 * 소수 찾기
 */
public class Code20220708_4 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 5;

		System.out.println(solution(n1));
		System.out.println(solution(n2));
	}

	/**
	 * +7
	 * 
	 * 정확성 테스트
	 * 테스트 1 〉   통과 (0.01ms, 73.7MB)
	 * 테스트 2 〉   통과 (0.02ms, 76.4MB)
	 * 테스트 3 〉   통과 (0.05ms, 75.4MB)
	 * 테스트 4 〉   통과 (0.06ms, 76.8MB)
	 * 테스트 5 〉   통과 (0.05ms, 73.3MB)
	 * 테스트 6 〉   통과 (0.41ms, 71.1MB)
	 * 테스트 7 〉   통과 (0.13ms, 76.7MB)
	 * 테스트 8 〉   통과 (0.31ms, 80.1MB)
	 * 테스트 9 〉   통과 (0.47ms, 72.4MB)
	 * 테스트 10 〉   통과 (4.65ms, 79.7MB)
	 * 테스트 11 〉   통과 (12.88ms, 87.8MB)
	 * 테스트 12 〉   통과 (6.26ms, 78.2MB)
	 * 
	 * 효율성 테스트
	 * 테스트 1 〉   통과 (14.58ms, 55.4MB)
	 * 테스트 2 〉   통과 (15.04ms, 55.5MB)
	 * 테스트 3 〉   통과 (14.89ms, 55.3MB)
	 * 테스트 4 〉   통과 (14.45ms, 55.6MB)
	 */
	public static int solution(int n) {
		int answer = 0;
		int[] arr = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			if (arr[i] == 0) {
				answer++;

				for (int j = i; j <= n; j += i) {
					arr[j] = 1;
				}
			}
		}

		return answer;
	}
}
