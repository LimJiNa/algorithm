package level01;

/**
 * 수박수박수박수박수박수?
 */
public class Code20220708_5 {
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}

	/**
	 * 테스트 1 〉   통과 (0.18ms, 79.3MB)
	 * 테스트 2 〉   통과 (0.33ms, 80.2MB)
	 * 테스트 3 〉   통과 (0.40ms, 81.3MB)
	 * 테스트 4 〉   통과 (0.84ms, 78.6MB)
	 * 테스트 5 〉   통과 (0.22ms, 74.7MB)
	 * 테스트 6 〉   통과 (0.05ms, 77.7MB)
	 * 테스트 7 〉   통과 (0.06ms, 75.8MB)
	 * 테스트 8 〉   통과 (0.08ms, 77.6MB)
	 * 테스트 9 〉   통과 (0.08ms, 73.3MB)
	 * 테스트 10 〉   통과 (0.07ms, 73.5MB)
	 * 테스트 11 〉   통과 (0.06ms, 78.6MB)
	 * 테스트 12 〉   통과 (0.05ms, 80.5MB)
	 * 테스트 13 〉   통과 (0.06ms, 66.6MB)
	 * 테스트 14 〉   통과 (0.06ms, 79.2MB)
	 * 테스트 15 〉   통과 (0.93ms, 78MB)
	 * 테스트 16 〉   통과 (0.05ms, 74.8MB)
	 */
	public static String solution(int n) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append((i % 2 == 0) ? "수" : "박");
		}

		return sb.toString();
	}

	public static String solution1(int n) {
		return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
	}
}
