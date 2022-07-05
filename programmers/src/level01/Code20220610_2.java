package level01;

/**
 * 가운데 글자 가져오기
 * @author jinalim
 */
public class Code20220610_2 {
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.09ms, 76.5MB)
	 * 테스트 2 〉	통과 (1.55ms, 77.8MB)
	 * 테스트 3 〉	통과 (0.12ms, 74.8MB)
	 * 테스트 4 〉	통과 (0.28ms, 82MB)
	 * 테스트 5 〉	통과 (0.21ms, 72.5MB)
	 * 테스트 6 〉	통과 (2.16ms, 69.9MB)
	 * 테스트 7 〉	통과 (0.33ms, 75.9MB)
	 * 테스트 8 〉	통과 (2.49ms, 81.6MB)
	 * 테스트 9 〉	통과 (0.32ms, 79.2MB)
	 * 테스트 10 〉	통과 (0.23ms, 77MB)
	 * 테스트 11 〉	통과 (0.31ms, 84.8MB)
	 * 테스트 12 〉	통과 (0.36ms, 73MB)
	 * 테스트 13 〉	통과 (2.75ms, 73.6MB)
	 * 테스트 14 〉	통과 (1.59ms, 70.1MB)
	 * 테스트 15 〉	통과 (2.40ms, 78.8MB)
	 * 테스트 16 〉	통과 (2.42ms, 76.1MB)
	 */
	public static String solution(String s) {
		int length = s.length();
		
		if( length%2 == 1 ) { // 홀수
			return s.split("")[length/2];
		} else { // 짝수
			return s.split("")[(length/2)-1] + s.split("")[length/2];
		}
	}
	
	public static String solution1(String s){
		return s.substring((s.length()-1) / 2, s.length()/2 + 1);
	}
}
