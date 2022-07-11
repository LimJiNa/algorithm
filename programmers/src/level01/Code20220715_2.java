package level01;

/**
 * 시저 암호
 */
public class Code20220715_2 {
	public static void main(String[] args) {
		String s1 = "AB";
		int n1 = 1;
		System.out.println(solution(s1, n1));

		String s2 = "z";
		int n2 = 1;
		System.out.println(solution(s2, n2));

		String s3 = "a B z";
		int n3 = 4;
		System.out.println(solution(s3, n3));
	}

	/**
	 * +5
	 * 
	 * 테스트 1 〉	통과 (0.06ms, 71.7MB)
	 * 테스트 2 〉	통과 (0.12ms, 67.1MB)
	 * 테스트 3 〉	통과 (0.06ms, 77.7MB)
	 * 테스트 4 〉	통과 (0.05ms, 72.8MB)
	 * 테스트 5 〉	통과 (0.04ms, 78.2MB)
	 * 테스트 6 〉	통과 (0.05ms, 77.2MB)
	 * 테스트 7 〉	통과 (0.13ms, 78MB)
	 * 테스트 8 〉	통과 (0.12ms, 70.9MB)
	 * 테스트 9 〉	통과 (0.07ms, 73.7MB)
	 * 테스트 10 〉	통과 (0.05ms, 79.5MB)
	 * 테스트 11 〉	통과 (0.17ms, 69.2MB)
	 * 테스트 12 〉	통과 (0.09ms, 76.6MB)
	 * 테스트 13 〉	통과 (1.88ms, 77.9MB)
	 */
	public static String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();

		for (char x : s.toCharArray()) {
			int tmp = (x + n);

			if (Character.isUpperCase(x)) {
				if (tmp > 90) {
					tmp = tmp - 26;
				}

				sb.append((char) tmp);
			} else if (Character.isLowerCase(x)) {
				if (tmp > 122) {
					tmp = tmp - 26;
				}

				sb.append((char) tmp);
			} else if (Character.isSpaceChar(x)) {
				sb.append(' ');
			}
		}

		return sb.toString();
	}

	public static String solution1(String s, int n) {
		String result = "";
		n = n % 26;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}

			result += ch;
		}

		return result;
	}

	public static String solution2(String s, int _n) {
		return s.chars().map(c -> {
			int n = _n % 26;
			if (c >= 'a' && c <= 'z') {
				return 'a' + (c - 'a' + n) % 26;
			} else if (c >= 'A' && c <= 'Z') {
				return 'A' + (c - 'A' + n) % 26;
			} else {
				return c;
			}
		}).mapToObj(c -> String.valueOf((char) c)).reduce((a, b) -> a + b).orElse("");
	}
}
