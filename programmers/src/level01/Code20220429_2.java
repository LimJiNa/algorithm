package level01;

import java.util.Arrays;

/**
 * 체육복
 * @author limjina
 */
public class Code20220429_2 {
	public static void main(String[] args) {
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		
		System.out.println(solution(n, lost, reserve));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.35ms, 72.4MB)
	 * 테스트 2 〉	통과 (0.36ms, 76.1MB)
	 * 테스트 3 〉	통과 (0.43ms, 71.4MB)
	 * 테스트 4 〉	통과 (0.49ms, 84.5MB)
	 * 테스트 5 〉	통과 (0.35ms, 75.9MB)
	 * 테스트 6 〉	통과 (0.31ms, 76.4MB)
	 * 테스트 7 〉	통과 (0.34ms, 66.7MB)
	 * 테스트 8 〉	통과 (0.36ms, 83MB)
	 * 테스트 9 〉	통과 (0.37ms, 83.4MB)
	 * 테스트 10 〉	통과 (0.36ms, 80.3MB)
	 * 테스트 11 〉	통과 (0.33ms, 74.5MB)
	 * 테스트 12 〉	통과 (0.45ms, 78MB)
	 * 테스트 13 〉	통과 (0.36ms, 66.2MB)
	 * 테스트 14 〉	통과 (0.46ms, 73.2MB)
	 * 테스트 15 〉	통과 (0.30ms, 66.8MB)
	 * 테스트 16 〉	통과 (0.36ms, 77.9MB)
	 * 테스트 17 〉	통과 (0.38ms, 72.8MB)
	 * 테스트 18 〉	통과 (0.48ms, 71.9MB)
	 * 테스트 19 〉	통과 (0.34ms, 68.5MB)
	 * 테스트 20 〉	통과 (0.43ms, 72.8MB)
	 */
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n-lost.length;
		
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		for( int i=0; i<lost.length; i++ ) {
			for( int j=0; j<reserve.length; j++ ) {
				if( lost[i] == reserve[j] ) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}
		
		for( int i=0; i<lost.length; i++ ) {
			for( int j=0; j<reserve.length; j++ ) {
				if( (lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j]) ) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
		
		return answer;
	}
}
