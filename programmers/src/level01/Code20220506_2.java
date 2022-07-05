package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 실패율
 * @author limjina
 */
public class Code20220506_2 {
	public static void main(String[] args) {
//		int N = 5;
//		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
//		int N = 4;
//		int[] stages = {4,4,4,4,4};
		
		int N = 3;
		int[] stages = {1,1,1};
		
		System.out.println(Arrays.toString(solution(N, stages)));
	}
	
	/**
	 * 테스트 1 〉	통과 (2.57ms, 72.2MB)
	 * 테스트 2 〉	통과 (4.05ms, 79.4MB)
	 * 테스트 3 〉	통과 (28.57ms, 87.3MB)
	 * 테스트 4 〉	통과 (107.22ms, 81.7MB)
	 * 테스트 5 〉	통과 (346.16ms, 89.9MB)
	 * 테스트 6 〉	통과 (6.81ms, 78.9MB)
	 * 테스트 7 〉	통과 (10.69ms, 80.8MB)
	 * 테스트 8 〉	통과 (102.10ms, 83.4MB)
	 * 테스트 9 〉	통과 (355.70ms, 90.4MB)
	 * 테스트 10 〉	통과 (50.79ms, 86.7MB)
	 * 테스트 11 〉	통과 (116.52ms, 96.1MB)
	 * 테스트 12 〉	통과 (68.61ms, 80.6MB)
	 * 테스트 13 〉	통과 (137.35ms, 99.7MB)
	 * 테스트 14 〉	통과 (2.60ms, 75.9MB)
	 * 테스트 15 〉	통과 (16.01ms, 89MB)
	 * 테스트 16 〉	통과 (11.90ms, 90.6MB)
	 * 테스트 17 〉	통과 (14.46ms, 90.3MB)
	 * 테스트 18 〉	통과 (12.68ms, 84.4MB)
	 * 테스트 19 〉	통과 (5.05ms, 75.6MB)
	 * 테스트 20 〉	통과 (12.36ms, 85.9MB)
	 * 테스트 21 〉	통과 (30.19ms, 85.4MB)
	 * 테스트 22 〉	통과 (266.20ms, 100MB)
	 * 테스트 23 〉	통과 (16.94ms, 85.6MB)
	 * 테스트 24 〉	통과 (27.20ms, 96.9MB)
	 * 테스트 25 〉	통과 (2.52ms, 75.4MB)
	 * 테스트 26 〉	통과 (2.55ms, 75.2MB)
	 * 테스트 27 〉	통과 (3.39ms, 73.1MB)
	 */
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		
		HashMap<Integer, Float> map = new HashMap<Integer, Float>();
		
		for( int i=0; i<N; i++ ) {
			int tmp = (i+1);
			
			float failCnt = 0;
			float runCnt = 0;
			
			for( int j=0; j<stages.length; j++ ) {
				if( stages[j] == tmp ) failCnt++;
				if( stages[j] >= tmp ) runCnt++;
			}
			
			if( runCnt == 0 ) {
				map.put(tmp, (float) 0);
			} else {
				map.put(tmp, (float) (failCnt/runCnt));
			}
		}
		
		List<Integer> list = new ArrayList<Integer>(map.keySet());
		Collections.sort(list, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
		
		answer = list.stream().mapToInt(Integer::intValue).toArray();
		
		return answer;
	}
}
