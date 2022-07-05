package level01;

import java.util.Arrays;

/**
 * 최소직사각형
 * @author limjina
 */
public class Code20220527_2 {
	public static void main(String[] args) {
		int[][] sizes = {{60,50} // 60 50
						, {30,70} // 70 30
						, {60,30} // 60 30
						, {80,40}}; // 80 40
		
		System.out.println(solution(sizes));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.01ms, 72.5MB)
	 * 테스트 2 〉	통과 (0.03ms, 75.5MB)
	 * 테스트 3 〉	통과 (0.02ms, 74.1MB)
	 * 테스트 4 〉	통과 (0.02ms, 76.4MB)
	 * 테스트 5 〉	통과 (0.03ms, 79.8MB)
	 * 테스트 6 〉	통과 (0.02ms, 73.7MB)
	 * 테스트 7 〉	통과 (0.02ms, 73.2MB)
	 * 테스트 8 〉	통과 (0.03ms, 77.1MB)
	 * 테스트 9 〉	통과 (0.02ms, 71.9MB)
	 * 테스트 10 〉	통과 (0.02ms, 82.6MB)
	 * 테스트 11 〉	통과 (0.06ms, 91.1MB)
	 * 테스트 12 〉	통과 (0.05ms, 70.7MB)
	 * 테스트 13 〉	통과 (0.09ms, 76.9MB)
	 * 테스트 14 〉	통과 (0.23ms, 78.7MB)
	 * 테스트 15 〉	통과 (0.34ms, 77.5MB)
	 * 테스트 16 〉	통과 (0.60ms, 86.5MB)
	 * 테스트 17 〉	통과 (0.73ms, 86.4MB)
	 * 테스트 18 〉	통과 (1.20ms, 84MB)
	 * 테스트 19 〉	통과 (0.77ms, 91.1MB)
	 * 테스트 20 〉	통과 (1.12ms, 85.9MB)
	 */
	public static int solution(int[][] sizes) {
		int maxWidth = Integer.MIN_VALUE;
		int maxHeight = Integer.MIN_VALUE;
		
		for( int i=0; i<sizes.length; i++ ) {
			int width = sizes[i][0];
			int height = sizes[i][1];
			
			if( width < height ) {
				width = sizes[i][1];
				height = sizes[i][0];
			}
			
			if( width > maxWidth ) maxWidth = width;
			if( height > maxHeight ) maxHeight = height;
		}
		
		return maxWidth * maxHeight;
	}
	
	public int solution1(int[][] sizes) {
		return Arrays.stream(sizes).reduce((a, b) -> new int[]{
				Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
		}).map(it -> it[0] * it[1]).get();
	}
	
	public int solution2(int[][] sizes) {
		int max = 0;
		int min = 0;
		for( int[] size : sizes ) {
			int paramMax = Math.max(size[0], size[1]);
			int paramMin = Math.min(size[0], size[1]);
			
			if( paramMax > max ) {
				max = paramMax;
			}
			
			if( paramMin > min ) {
				min = paramMin;
			}
		}
		
		return max * min;
	}
}
