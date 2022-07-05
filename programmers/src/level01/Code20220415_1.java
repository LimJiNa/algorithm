package level01;

import java.util.stream.IntStream;

/**
 * 내적
 * @author limjina
 */
public class Code20220415_1 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		System.out.println(solution(a, b));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.06ms, 82.7MB)
	 * 테스트 2 〉	통과 (0.03ms, 71.7MB)
	 * 테스트 3 〉	통과 (0.02ms, 81.7MB)
	 * 테스트 4 〉	통과 (0.04ms, 83.8MB)
	 * 테스트 5 〉	통과 (0.03ms, 76.9MB)
	 * 테스트 6 〉	통과 (0.03ms, 72.1MB)
	 * 테스트 7 〉	통과 (0.05ms, 68MB)
	 * 테스트 8 〉	통과 (0.03ms, 75MB)
	 * 테스트 9 〉	통과 (0.05ms, 80.7MB)
	 */
	public static int solution(int[] a, int[] b) {
		int result = 0;
		
		for( int i=0; i<a.length; i++ ) {
			result += a[i]*b[i];
		}
		
		return result;
	}
	
	public static int solution1(int[] a, int[] b) {
		return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
	}
}
