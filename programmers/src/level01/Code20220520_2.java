package level01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 두 개 뽑아서 더하기
 * @author limjina
 */
public class Code20220520_2 {
	public static void main(String[] args) {
		int[] numbers1 = {2,1,3,4,1};
		int[] numbers2 = {5,0,2,7};
		
		System.out.println(Arrays.toString(solution(numbers1)));
		System.out.println(Arrays.toString(solution(numbers2)));
	}
	
	/**
	 * 테스트 1 〉	통과 (3.00ms, 81.3MB)
	 * 테스트 2 〉	통과 (2.81ms, 76.6MB)
	 * 테스트 3 〉	통과 (2.47ms, 74.4MB)
	 * 테스트 4 〉	통과 (2.67ms, 78.2MB)
	 * 테스트 5 〉	통과 (2.48ms, 77.9MB)
	 * 테스트 6 〉	통과 (2.53ms, 75.9MB)
	 * 테스트 7 〉	통과 (5.36ms, 69.6MB)
	 * 테스트 8 〉	통과 (3.90ms, 78.5MB)
	 * 테스트 9 〉	통과 (3.23ms, 76.1MB)
	 */
	public static int[] solution(int[] numbers) {
		int[] answer = {};
		
		HashSet<Integer> tmp = new HashSet<Integer>();
		for( int i=0; i<numbers.length; i++ ) {
			for( int j=0; j<numbers.length; j++ ) {
				if( i == j ) continue;
				
				tmp.add(numbers[i] + numbers[j]);
			}
		}
		
		answer = Arrays.stream(tmp.toArray(new Integer[tmp.size()])).mapToInt(Integer::intValue).toArray();
		
		Arrays.sort(answer);
		
		return answer;
	}
	
	public int[] solution1(int[] numbers) {
		Set<Integer> set = new HashSet<>();
		
		for( int i=0; i<numbers.length; i++ ) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
}
