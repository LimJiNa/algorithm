package level01;

/**
 * 3진법 뒤집기
 * @author limjina
 */
public class Code20220513_2 {
	public static void main(String[] args) {
		System.out.println(solution(45));
	}
	
	/**
	 * 테스트 1 〉	통과 (10.46ms, 77.5MB)
	 * 테스트 2 〉	통과 (8.66ms, 74.4MB)
	 * 테스트 3 〉	통과 (10.73ms, 77.8MB)
	 * 테스트 4 〉	통과 (13.59ms, 77.7MB)
	 * 테스트 5 〉	통과 (12.48ms, 83.8MB)
	 * 테스트 6 〉	통과 (10.65ms, 78.1MB)
	 * 테스트 7 〉	통과 (8.92ms, 75.7MB)
	 * 테스트 8 〉	통과 (11.75ms, 76.6MB)
	 * 테스트 9 〉	통과 (12.09ms, 78.8MB)
	 * 테스트 10 〉	통과 (13.22ms, 79.1MB)
	 */
	public static int solution(int n) {
		String str = "";
		while(n>0) {
			str = (n%3) + str;
			n /= 3;
		}
		
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		
		return Integer.parseInt(str, 3);
	}
}
