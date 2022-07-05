package level01;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 포켓몬
 * @author limjina
 */
public class Code20220506_1 {
	public static void main(String[] args) {
		int[] nums1 = {3,1,2,3};
		int[] nums2 = {3,3,3,2,2,4};
		int[] nums3 = {3,3,3,2,2,2};
		
		System.out.println(solution(nums1));
		System.out.println(solution(nums2));
		System.out.println(solution(nums3));
	}
	
	/**
	 * 테스트 1 〉	통과 (6.39ms, 77MB)
	 * 테스트 2 〉	통과 (4.06ms, 76.2MB)
	 * 테스트 3 〉	통과 (3.64ms, 75.5MB)
	 * 테스트 4 〉	통과 (5.06ms, 90.2MB)
	 * 테스트 5 〉	통과 (2.72ms, 76.4MB)
	 * 테스트 6 〉	통과 (4.40ms, 91.4MB)
	 * 테스트 7 〉	통과 (1.73ms, 77.7MB)
	 * 테스트 8 〉	통과 (5.27ms, 76.6MB)
	 * 테스트 9 〉	통과 (1.59ms, 78.2MB)
	 * 테스트 10 〉	통과 (1.57ms, 78.2MB)
	 * 테스트 11 〉	통과 (1.68ms, 77.6MB)
	 * 테스트 12 〉	통과 (2.26ms, 74.4MB)
	 * 테스트 13 〉	통과 (2.53ms, 79.8MB)
	 * 테스트 14 〉	통과 (2.07ms, 77.2MB)
	 * 테스트 15 〉	통과 (1.95ms, 73.5MB)
	 * 테스트 16 〉	통과 (6.63ms, 78.9MB)
	 * 테스트 17 〉	통과 (4.62ms, 77.9MB)
	 * 테스트 18 〉	통과 (4.36ms, 85.1MB)
	 * 테스트 19 〉	통과 (4.50ms, 79.4MB)
	 * 테스트 20 〉	통과 (6.42ms, 89.3MB)
	 */
	public static int solution(int[] nums) {
		int answer = (int) Arrays.stream(nums).distinct().count();
		return (answer <= (nums.length/2)) ? answer : (nums.length/2);
	}
	
	public static int solution1(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0; i<nums.length; i++) {
			hs.add(nums[i]);
		}
		
		if( hs.size()>nums.length/2 ) {
			return nums.length/2;
		}
		
		return hs.size();
	}
}
