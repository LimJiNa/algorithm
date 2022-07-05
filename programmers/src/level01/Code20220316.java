package level01;

import java.util.Arrays;

/**
 * 로또의 최고 순위와 최저 순위
 * @author limjina
 */
public class Code20220316 {
	public static void main(String[] args) {
//		int[] lottos = {44, 1, 0, 0, 31, 25};
//		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
//		int[] lottos = {45, 4, 35, 20, 3, 9};
//		int[] win_nums = {20, 9, 3, 45, 4, 35};
		
		int[] result = solution(lottos, win_nums);
		
		System.out.println(Arrays.toString(result));
	}
	
	/**
	 * 테스트 1 〉	통과 (1.47ms, 78.5MB)
	 * 테스트 2 〉	통과 (2.04ms, 76.7MB)
	 * 테스트 3 〉	통과 (1.43ms, 73.4MB)
	 * 테스트 4 〉	통과 (1.21ms, 68.4MB)
	 * 테스트 5 〉	통과 (1.34ms, 74.8MB)
	 * 테스트 6 〉	통과 (1.60ms, 75.9MB)
	 * 테스트 7 〉	통과 (1.65ms, 75.5MB)
	 * 테스트 8 〉	통과 (1.46ms, 72.3MB)
	 * 테스트 9 〉	통과 (1.33ms, 76.2MB)
	 * 테스트 10 〉	통과 (1.77ms, 71.8MB)
	 * 테스트 11 〉	통과 (1.56ms, 75.4MB)
	 * 테스트 12 〉	통과 (2.42ms, 72.5MB)
	 * 테스트 13 〉	통과 (1.28ms, 72.9MB)
	 * 테스트 14 〉	통과 (1.16ms, 72.7MB)
	 * 테스트 15 〉	통과 (1.45ms, 76.4MB)
	 */
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] result = new int[2];
		
		int prizeCount = 0;
		int zeroCount = 0;
		
		for( int nums : lottos )
		{
			boolean isNums = Arrays.stream(win_nums).anyMatch(i -> i == nums);
			
			if( isNums )
			{
				prizeCount++;
			}
			
			if( nums == 0 )
			{
				zeroCount++;
			}
		}
		
		result[0] = Math.min((7-(prizeCount+zeroCount)), 6);
		result[1] = Math.min(7-prizeCount, 6);
		
		return result;
	}
	
	public static int solutionFor() {
		int result = 0;
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int prize_count = 0;
		
		for( int lotto : lottos )
		{
			for( int win_num : win_nums )
			{
				if( lotto == win_num )
				{
					prize_count++;
					break;
				}
			}
		}
		
		result = Math.min(7-prize_count, 6);
		
		return result;
	}
	
	public static int solutionBinarySearch() {
		int result = 0;
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int prize_count = 0;
		
		Arrays.sort(lottos);
		Arrays.sort(win_nums);
		
		for( int lotto : lottos )
		{
			if( Arrays.binarySearch(win_nums, lotto) >= 0 )
			{
				prize_count++;
			}
		}
		
		result = Math.min(7-prize_count, 6);
		
		return result;
	}
	
	public static int solutionAnyMath() {
		int result = 0;
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int prize_count = 0;
		
		for( int lotto : lottos )
		{
			if( Arrays.stream(win_nums).anyMatch(i -> i == lotto) )
			{
				prize_count++;
			}
		}
		
		result = Math.min(7-prize_count, 6);
		
		return result;
	}
	
	public static int solutionContains() {
		int result = 0;
		
		Integer[] lottos = {44, 1, 0, 0, 31, 25};
		Integer[] win_nums = {31, 10, 45, 1, 6, 19};
		int prize_count = 0;
		
		for( Integer lotto : lottos )
		{
			if( Arrays.asList(win_nums).contains(lotto) )
			{
				prize_count++;
			}
		}
		
		result = Math.min(7-prize_count, 6);
		
		return result;
	}
}
