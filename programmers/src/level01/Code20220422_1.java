package level01;

import java.util.HashMap;

/**
 * 완주하지 못한 선수
 * @author limjina
 */
public class Code20220422_1 {
	public static void main(String[] args) {
		String[] participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};
		
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
		
		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant1, completion1));
		System.out.println(solution(participant2, completion2));
		System.out.println(solution(participant3, completion3));
	}
	
	/**
	 * 정확성 테스트
	 * 테스트 1 〉	통과 (0.07ms, 77.6MB)
	 * 테스트 2 〉	통과 (0.09ms, 70.4MB)
	 * 테스트 3 〉	통과 (0.72ms, 79.1MB)
	 * 테스트 4 〉	통과 (1.18ms, 85.8MB)
	 * 테스트 5 〉	통과 (0.96ms, 84.7MB)
	 * 
	 * 효율성 테스트
	 * 테스트 1 〉	통과 (46.57ms, 82.3MB)
	 * 테스트 2 〉	통과 (85.65ms, 88.4MB)
	 * 테스트 3 〉	통과 (73.31ms, 94.5MB)
	 * 테스트 4 〉	통과 (94.21ms, 95.1MB)
	 * 테스트 5 〉	통과 (105.64ms, 95.8MB)
	 */
	public static String solution(String[] participant, String[] completion) {
		String result = "";
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for( String str : participant ) {
			map.put(str, map.getOrDefault(str, 0)+1);
		}
		
		for( String str : completion ) {
			map.put(str, map.get(str)-1);
		}
		
		for( String key : map.keySet() ) {
			if( map.get(key) != 0 ) {
				result = key;
			}
		}
		
		return result;
	}
}
