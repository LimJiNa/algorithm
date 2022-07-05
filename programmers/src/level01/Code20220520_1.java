package level01;

import java.util.Arrays;

/**
 * 예산
 * @author limjina
 */
public class Code20220520_1 {
	public static void main(String[] args) {
		int[] d1 = {1,3,2,5,4};
		int budget1 = 9;
		
		int[] d2 = {2,2,3,3};
		int budget2 = 10;
		
		System.out.println(solution(d1, budget1));
		System.out.println(solution(d2, budget2));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.35ms, 77.3MB)
	 * 테스트 2 〉	통과 (0.40ms, 77MB)
	 * 테스트 3 〉	통과 (0.34ms, 76.5MB)
	 * 테스트 4 〉	통과 (0.41ms, 77.1MB)
	 * 테스트 5 〉	통과 (0.37ms, 75.8MB)
	 * 테스트 6 〉	통과 (0.34ms, 75.2MB)
	 * 테스트 7 〉	통과 (0.40ms, 72.9MB)
	 * 테스트 8 〉	통과 (0.50ms, 89.4MB)
	 * 테스트 9 〉	통과 (0.39ms, 76.7MB)
	 * 테스트 10 〉	통과 (0.41ms, 72.4MB)
	 * 테스트 11 〉	통과 (0.35ms, 79.6MB)
	 * 테스트 12 〉	통과 (0.39ms, 69.6MB)
	 * 테스트 13 〉	통과 (0.35ms, 72MB)
	 * 테스트 14 〉	통과 (0.40ms, 73.4MB)
	 * 테스트 15 〉	통과 (0.53ms, 79.6MB)
	 * 테스트 16 〉	통과 (0.36ms, 73.2MB)
	 * 테스트 17 〉	통과 (0.48ms, 74.7MB)
	 * 테스트 18 〉	통과 (0.36ms, 78.1MB)
	 * 테스트 19 〉	통과 (0.42ms, 80MB)
	 * 테스트 20 〉	통과 (0.33ms, 78MB)
	 * 테스트 21 〉	통과 (0.34ms, 81.2MB)
	 * 테스트 22 〉	통과 (0.33ms, 76.8MB)
	 * 테스트 23 〉	통과 (0.36ms, 73.1MB)
	 */
	public static int solution(int[] d, int budget) {
		int answer = 0;
		
		Arrays.sort(d);
		
		for( int i=0; i<d.length; i++ ) {
			int tmp = d[i];
			
			if( tmp > budget ) {
				break;
			} else {
				budget -= tmp;
				answer++;
			}
		}
		
		return answer;
	}
}
