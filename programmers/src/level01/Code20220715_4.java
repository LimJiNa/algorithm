package level01;

/**
 * 이상한 문자 만들기
 */
public class Code20220715_4 {
	public static void main(String[] args) {
		String s = "try hello world";
		System.out.println(solution(s));
	}

	/**
	 * +8
	 * 
	 * 테스트 1 〉	통과 (0.07ms, 76.8MB)
	 * 테스트 2 〉	통과 (0.08ms, 79.4MB)
	 * 테스트 3 〉	통과 (0.06ms, 74.1MB)
	 * 테스트 4 〉	통과 (0.19ms, 75MB)
	 * 테스트 5 〉	통과 (0.14ms, 73.9MB)
	 * 테스트 6 〉	통과 (0.06ms, 75MB)
	 * 테스트 7 〉	통과 (0.06ms, 77.6MB)
	 * 테스트 8 〉	통과 (0.18ms, 78.1MB)
	 * 테스트 9 〉	통과 (0.08ms, 75.5MB)
	 * 테스트 10 〉	통과 (0.20ms, 74.4MB)
	 * 테스트 11 〉	통과 (0.20ms, 68.8MB)
	 * 테스트 12 〉	통과 (0.20ms, 76MB)
	 * 테스트 13 〉	통과 (0.12ms, 77.3MB)
	 * 테스트 14 〉	통과 (0.09ms, 73.3MB)
	 * 테스트 15 〉	통과 (0.10ms, 75MB)
	 * 테스트 16 〉	통과 (0.28ms, 78.2MB)
	 */
	public static String solution(String s) {
		StringBuilder sb = new StringBuilder();
		int idx = 0;

		for (char x : s.toCharArray()) {
			if (Character.isSpaceChar(x)) {
				sb.append(" ");
				idx = 0;
			} else if (idx % 2 == 0) {
				sb.append(Character.toString(x).toUpperCase());
				idx++;
			} else {
				sb.append(Character.toString(x).toLowerCase());
				idx++;
			}
		}

		return sb.toString();
	}

	public static String solution1(String s) {
		String answer = "";
		int cnt = 0;
		String[] array = s.split("");

		for (String ss : array) {
			cnt = ss.contains(" ") ? 0 : cnt + 1;
			answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		
		return answer;
	}

	public static String solution2(String s) {
		char[] chars = s.toCharArray();
		int idx = 0;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ')
				idx = 0;
			else
				chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
		}

		return String.valueOf(chars);
	}
}
