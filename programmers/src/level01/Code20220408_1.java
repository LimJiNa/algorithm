package level01;

import java.util.Arrays;

/**
 * 없는 숫자 더하기
 * @author limjina
 */
public class Code20220408_1 {
	public static void main(String[] args) {
//		int[] numbers = {1,2,3,4,6,7,8,0};
		int[] numbers = {5,8,4,0,6,7,9};
		
		System.out.println(solution(numbers));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.31ms, 72.6MB)
	 * 테스트 2 〉	통과 (0.32ms, 79.8MB)
	 * 테스트 3 〉	통과 (0.32ms, 74.7MB)
	 * 테스트 4 〉	통과 (0.34ms, 75.4MB)
	 * 테스트 5 〉	통과 (0.33ms, 79.9MB)
	 * 테스트 6 〉	통과 (0.35ms, 77.5MB)
	 * 테스트 7 〉	통과 (0.44ms, 66.2MB)
	 * 테스트 8 〉	통과 (0.42ms, 78.1MB)
	 * 테스트 9 〉	통과 (0.36ms, 78.2MB)
	 */
	public static int solution(int[] numbers) {
		int result = 0;
		
		Arrays.sort(numbers);
		
		for( int i=0; i<10; i++ )
		{
			if( Arrays.binarySearch(numbers, i) < 0 ) {
				result += i;
			}
		}
		
		return result;
	}
	
	public static int solution1(int[] numbers) {
		int sum = 45;
		
		for( int i : numbers ) {
			sum -= i;
		}
		
		return sum;
	}
}
