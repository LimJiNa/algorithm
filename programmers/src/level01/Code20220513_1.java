package level01;

/**
 * 약수의 개수와 덧셈
 * @author limjina
 */
public class Code20220513_1 {
	public static void main(String[] args) {
		int left1 = 13;
		int right1 = 17;
		
		int left2 = 24;
		int right2 = 27;
		
		System.out.println(solution(left1, right1));
		System.out.println(solution(left2, right2));
	}
	
	/**
	 * 테스트 1 〉	통과 (3.03ms, 65.1MB)
	 * 테스트 2 〉	통과 (1.55ms, 74.1MB)
	 * 테스트 3 〉	통과 (1.32ms, 76.3MB)
	 * 테스트 4 〉	통과 (0.89ms, 72.9MB)
	 * 테스트 5 〉	통과 (3.30ms, 73.9MB)
	 * 테스트 6 〉	통과 (0.37ms, 78.1MB)
	 * 테스트 7 〉	통과 (0.26ms, 78.2MB)
	 */
	public static int solution(int left, int right) {
		int answer = 0;
		
		for( int i=left; i<=right; i++ ) {
			int cnt = 0;
			
			for( int j=1; j<=i; j++ ) {
				if( (i%j) == 0 ) {
					cnt++;
				}
			}
			
			if( (cnt%2) == 0 ) {
				answer += i;
			} else {
				answer -= i;
			}
		}
		
		return answer;
	}
	
	public int solution1(int left, int right) {
		int answer = 0;
		
		for(int i=left;i<=right;i++) {
			// 제곱수인 경우 약수의 개수가 홀수
			if( i % Math.sqrt(i) == 0 ) {
				answer -= i;
			}
			// 제곱수가 아닌 경우 약수의 개수가 짝수
			else {
				answer += i;
			}
		}
		
		return answer;
	}
}
