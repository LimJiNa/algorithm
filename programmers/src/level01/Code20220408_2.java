package level01;

/**
 * 음양 더하기
 * @author limjina
 */
public class Code20220408_2 {
	public static void main(String[] args) {
//		int[] absolutes = {4,7,12};
//		boolean[] signs = {true,false,true};
		
		int[] absolutes = {1,2,3};
		boolean[] signs = {false,false,true};
		
		System.out.println(solution(absolutes, signs));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.05ms, 78.5MB)
	 * 테스트 2 〉	통과 (0.04ms, 77.1MB)
	 * 테스트 3 〉	통과 (0.04ms, 78.2MB)
	 * 테스트 4 〉	통과 (0.05ms, 86MB)
	 * 테스트 5 〉	통과 (0.05ms, 78MB)
	 * 테스트 6 〉	통과 (0.04ms, 73.4MB)
	 * 테스트 7 〉	통과 (0.06ms, 92.3MB)
	 * 테스트 8 〉	통과 (0.04ms, 84.2MB)
	 * 테스트 9 〉	통과 (0.04ms, 77.1MB)
	 */
	public static int solution(int[] absolutes, boolean[] signs) {
		int result = 0;
		
		for( int i=0; i<absolutes.length; i++ ) {
			if( signs[i] ) {
				result += absolutes[i];
			} else {
				result += (absolutes[i] * -1);
			}
		}
		
		return result;
	}
}
