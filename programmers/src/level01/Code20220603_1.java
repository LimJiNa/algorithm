package level01;

import java.util.stream.IntStream;

/**
 * 나머지가 1이 되는 수 찾기
 * @author limjina
 */
public class Code20220603_1 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 12;
		
		System.out.println(solution(n1));
		System.out.println(solution(n2));
	}
	
	/**
	 * 테스트 1 〉	통과 (7.62ms, 85.4MB)
	 * 테스트 2 〉	통과 (0.02ms, 78.7MB)
	 * 테스트 3 〉	통과 (0.03ms, 80.4MB)
	 * 테스트 4 〉	통과 (0.02ms, 69.6MB)
	 * 테스트 5 〉	통과 (0.02ms, 76.2MB)
	 * 테스트 6 〉	통과 (0.03ms, 72.1MB)
	 * 테스트 7 〉	통과 (0.03ms, 72.3MB)
	 * 테스트 8 〉	통과 (0.02ms, 72.7MB)
	 * 테스트 9 〉	통과 (0.02ms, 73.3MB)
	 * 테스트 10 〉	통과 (0.04ms, 69.2MB)
	 * 테스트 11 〉	통과 (0.02ms, 71.7MB)
	 */
	public static int solution(int n) {
		int answer = 0;
		
		for( int i=1; i<=n; i++ ) {
			if( n%i == 1 ) {
				answer = i;
				break;
			}
		}
		
		return answer;
	}
	
	public int solution1(int n) {
		return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
	}
}
