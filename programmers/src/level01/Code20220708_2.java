package level01;

/**
 * 문자열 다루기 기본
 */
public class Code20220708_2 {
	public static void main(String[] args) {
		String s1 = "a234";
		String s2 = "1234";

		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}

	/**
	 * 테스트 1 〉   통과 (0.08ms, 74.6MB)
	 * 테스트 2 〉   통과 (0.02ms, 72.8MB)
	 * 테스트 3 〉   통과 (0.07ms, 75.3MB)
	 * 테스트 4 〉   통과 (0.11ms, 72.8MB)
	 * 테스트 5 〉   통과 (0.02ms, 77.9MB)
	 * 테스트 6 〉   통과 (0.01ms, 76.6MB)
	 * 테스트 7 〉   통과 (0.03ms, 69.4MB)
	 * 테스트 8 〉   통과 (0.07ms, 70MB)
	 * 테스트 9 〉   통과 (0.08ms, 71MB)
	 * 테스트 10 〉   통과 (0.12ms, 71.3MB)
	 * 테스트 11 〉   통과 (0.09ms, 76.2MB)
	 * 테스트 12 〉   통과 (0.01ms, 78.1MB)
	 * 테스트 13 〉   통과 (0.02ms, 73.2MB)
	 * 테스트 14 〉   통과 (0.07ms, 73.2MB)
	 * 테스트 15 〉   통과 (0.07ms, 73.2MB)
	 * 테스트 16 〉   통과 (0.08ms, 70.7MB)
	 */
	public static boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {
			return (s.replaceAll("[0-9]", "").length() != 0) ? false : true;
		} else {
			return false;
		}
	}
	
	public static boolean solution1(String s) {
		if (s.length() == 4 || s.length() == 6) {
			try {
				int x = Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else
			return false;
	}

	public static boolean solution2(String s) {
		if (s.length() == 4 || s.length() == 6)
			return s.matches("(^[0-9]*$)");
		return false;
	}

	public static boolean solution3(String s) {
		return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false : true;
	}
}
