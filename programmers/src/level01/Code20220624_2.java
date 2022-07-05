package level01;

/**
 * 두 정수 사이의 합
 * 
 * @author jinalim
 */
public class Code20220624_2 {
	public static void main(String[] args) {
		int a1 = 3;
		int b1 = 5;

		int a2 = 3;
		int b2 = 3;

		int a3 = 5;
		int b3 = 3;

		System.out.println(solution(a1, b1));
		System.out.println(solution(a2, b2));
		System.out.println(solution(a3, b3));
	}

	/**
	 * +1
	 * 
	 * 테스트 1 〉	통과 (0.06ms, 74.3MB)
	 * 테스트 2 〉	통과 (0.20ms, 81.7MB)
	 * 테스트 3 〉	통과 (0.12ms, 74.1MB)
	 * 테스트 4 〉	통과 (14.98ms, 73.2MB)
	 * 테스트 5 〉	통과 (20.84ms, 89.4MB)
	 * 테스트 6 〉	통과 (13.09ms, 82.4MB)
	 * 테스트 7 〉	통과 (9.92ms, 82.9MB)
	 * 테스트 8 〉	통과 (12.03ms, 90.2MB)
	 * 테스트 9 〉	통과 (7.64ms, 70.4MB)
	 * 테스트 10 〉	통과 (3.65ms, 77.1MB)
	 * 테스트 11 〉	통과 (0.13ms, 75.9MB)
	 * 테스트 12 〉	통과 (0.26ms, 78.1MB)
	 * 테스트 13 〉	통과 (0.18ms, 68.4MB)
	 * 테스트 14 〉	통과 (0.07ms, 72.2MB)
	 * 테스트 15 〉	통과 (0.08ms, 75.7MB)
	 * 테스트 16 〉	통과 (0.16ms, 74.3MB)
	 */
	public static long solution(int a, int b) {
		long answer = 0;

		if (a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		for (int i = a; i <= b; i++) {
			if (a == b) {
				return a;
			}
			answer += i;
		}

		return answer;
	}

	public long solution1(int a, int b) {
		return sumAtoB(Math.min(a, b), Math.max(b, a));
	}

	private long sumAtoB(long a, long b) {
		return (b - a + 1) * (a + b) / 2;
	}

	public long solution2(int a, int b) {
		long answer = 0;
		for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++)
			answer += i;

		return answer;
	}

	public long solution3(int a, int b) {
		long answer = 0;
		if (a != b) {
			for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
				answer += i;
			}
		} else {
			answer = a;
		}
		return answer;
	}
}
