package level01;

/**
 * 소수 만들기
 * @author limjina
 */
public class Code20220415_2 {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4};
		int[] nums2 = {1,2,7,6,4};
		
		System.out.println(solution(nums1));
		System.out.println(solution(nums2));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.56ms, 70.9MB)
	 * 테스트 2 〉	통과 (0.64ms, 77.3MB)
	 * 테스트 3 〉	통과 (0.36ms, 80MB)
	 * 테스트 4 〉	통과 (0.20ms, 75.2MB)
	 * 테스트 5 〉	통과 (0.71ms, 73.6MB)
	 * 테스트 6 〉	통과 (4.03ms, 72.6MB)
	 * 테스트 7 〉	통과 (0.26ms, 72.4MB)
	 * 테스트 8 〉	통과 (4.24ms, 74.9MB)
	 * 테스트 9 〉	통과 (0.66ms, 74.6MB)
	 * 테스트 10 〉	통과 (3.90ms, 72.5MB)
	 * 테스트 11 〉	통과 (0.05ms, 80.4MB)
	 * 테스트 12 〉	통과 (0.04ms, 76.7MB)
	 * 테스트 13 〉	통과 (0.05ms, 78.6MB)
	 * 테스트 14 〉	통과 (0.05ms, 69.1MB)
	 * 테스트 15 〉	통과 (0.02ms, 76.9MB)
	 * 테스트 16 〉	통과 (9.82ms, 73.1MB)
	 * 테스트 17 〉	통과 (1.10ms, 80.6MB)
	 * 테스트 18 〉	통과 (0.75ms, 70.8MB)
	 * 테스트 19 〉	통과 (0.06ms, 73.5MB)
	 * 테스트 20 〉	통과 (19.54ms, 87.3MB)
	 * 테스트 21 〉	통과 (16.00ms, 71.7MB)
	 * 테스트 22 〉	통과 (0.27ms, 70.6MB)
	 * 테스트 23 〉	통과 (0.02ms, 84.2MB)
	 * 테스트 24 〉	통과 (9.24ms, 73.3MB)
	 * 테스트 25 〉	통과 (9.04ms, 75.5MB)
	 * 테스트 26 〉	통과 (0.02ms, 79.5MB)
	 */
	public static int solution(int[] nums) {
		int result = 0;
		
		for( int i=0; i<nums.length; i++ ) {
			for( int j=i+1; j<nums.length; j++ ) {
				for( int k=j+1; i<nums.length; k++ ) {
					if( k >= nums.length ) break;
					
					int sum = nums[i] + nums[j] + nums[k];
					
					if( isPrime(sum) ) {
						result++;
					}
				}
			}
		}
		
		return result;
	}
	
	public static boolean isPrime(int sum) {
		for( int i=2; i<sum; i++ ) {
			if( sum % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
