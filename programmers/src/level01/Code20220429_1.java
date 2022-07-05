package level01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 모의고사
 * @author limjina
 */
public class Code20220429_1 {
	public static void main(String[] args) {
		int[] answers = {3,3,2,1,5};
//		int[] answers = {1,2,3,4,5};
//		int[] answers = {1,3,2,4,2};
		
		System.out.print(Arrays.toString(solution(answers)));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.04ms, 71MB)
	 * 테스트 2 〉	통과 (0.06ms, 71.8MB)
	 * 테스트 3 〉	통과 (0.04ms, 73.2MB)
	 * 테스트 4 〉	통과 (0.04ms, 74.6MB)
	 * 테스트 5 〉	통과 (0.05ms, 76.4MB)
	 * 테스트 6 〉	통과 (0.07ms, 77MB)
	 * 테스트 7 〉	통과 (0.30ms, 72.3MB)
	 * 테스트 8 〉	통과 (0.21ms, 68.6MB)
	 * 테스트 9 〉	통과 (0.52ms, 77MB)
	 * 테스트 10 〉	통과 (0.26ms, 72.2MB)
	 * 테스트 11 〉	통과 (0.86ms, 83.9MB)
	 * 테스트 12 〉	통과 (0.48ms, 66.3MB)
	 * 테스트 13 〉	통과 (0.06ms, 79.6MB)
	 * 테스트 14 〉	통과 (0.90ms, 76.3MB)
	 */
	public static int[] solution(int[] answers) {
		int[] person1 = {1, 2, 3, 4, 5};
		int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		for( int i=0; i<answers.length; i++ ) {
			if( person1[i%person1.length] == answers[i] ) cnt1++;
			if( person2[i%person2.length] == answers[i] ) cnt2++;
			if( person3[i%person3.length] == answers[i] ) cnt3++;
		}
		
		int max = Math.max(Math.max(cnt1, cnt2), cnt3);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if( max == cnt1 ) list.add(1);
		if( max == cnt2 ) list.add(2);
		if( max == cnt3 ) list.add(3);
		
		int[] answer = new int[list.size()];
		
		for( int i=0; i<list.size(); i++ ) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}
