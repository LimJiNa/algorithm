package level01;

/**
 * 문자열 내 p와 y의 개수
 * 
 * 
 * @author jinalim
 */
public class Code20220701_2 {
	public static void main(String[] args) {
		String s1 = "pPoooyY";
		String s2 = "Pyy";

		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}

	/**
	 * 테스트 1 〉	통과 (0.02ms, 74.4MB)
	 * 테스트 2 〉	통과 (0.02ms, 72.6MB)
	 * 테스트 3 〉	통과 (0.03ms, 79.1MB)
	 * 테스트 4 〉	통과 (0.03ms, 76.6MB)
	 * 테스트 5 〉	통과 (0.02ms, 74.5MB)
	 * 테스트 6 〉	통과 (0.04ms, 78.8MB)
	 * 테스트 7 〉	통과 (0.05ms, 78.8MB)
	 * 테스트 8 〉	통과 (0.04ms, 76.5MB)
	 * 테스트 9 〉	통과 (0.04ms, 66.2MB)
	 * 테스트 10 〉	통과 (0.03ms, 74.9MB)
	 * 테스트 11 〉	통과 (0.03ms, 75MB)
	 * 테스트 12 〉	통과 (0.04ms, 76.1MB)
	 * 테스트 13 〉	통과 (0.03ms, 75.2MB)
	 * 테스트 14 〉	통과 (0.05ms, 78.5MB)
	 * 테스트 15 〉	통과 (0.04ms, 72.9MB)
	 * 테스트 16 〉	통과 (0.03ms, 75.1MB)
	 * 테스트 17 〉	통과 (0.03ms, 77MB)
	 * 테스트 18 〉	통과 (0.03ms, 76.1MB)
	 * 테스트 19 〉	통과 (0.05ms, 72.7MB)
	 * 테스트 20 〉	통과 (0.04ms, 73.4MB)
	 * 테스트 21 〉	통과 (0.03ms, 75MB)
	 * 테스트 22 〉	통과 (0.04ms, 78.9MB)
	 * 테스트 23 〉	통과 (0.03ms, 82.1MB)
	 * 테스트 24 〉	통과 (0.04ms, 76.2MB)
	 * 테스트 25 〉	통과 (0.03ms, 76.4MB)
	 * 테스트 26 〉	통과 (0.04ms, 72.8MB)
	 * 테스트 27 〉	통과 (0.04ms, 73.3MB)
	 * 테스트 28 〉	통과 (0.05ms, 73.9MB)
	 * 테스트 29 〉	통과 (0.02ms, 73.8MB)
	 * 테스트 30 〉	통과 (0.03ms, 72.5MB)
	 */
	public static boolean solution(String s) {
		s = s.toUpperCase();

		int p = 0;
		int y = 0;

		for (char c : s.toCharArray()) {
			if (c == 'P') {
				p++;
			} else if (c == 'Y') {
				y++;
			}
		}

		return p == y;
	}

	public static boolean solution1(String s) {
		s = s.toUpperCase();

		return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
	}

	public static boolean solution2(String s) {

		return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;
	}
}
