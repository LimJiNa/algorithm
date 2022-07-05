package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 신고 결과 받기
 * @author limjina
 */
public class Code20220309 {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k = 2;
		
		int[] result = solution(id_list, report, k);
		
		System.out.println(Arrays.toString(result));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.11ms, 73.4MB)
	 * 테스트 2 〉	통과 (0.30ms, 82.8MB)
	 * 테스트 3 〉	통과 (133.11ms, 150MB)
	 * 테스트 4 〉	통과 (0.27ms, 77.6MB)
	 * 테스트 5 〉	통과 (2.16ms, 77.5MB)
	 * 테스트 6 〉	통과 (4.18ms, 80.8MB)
	 * 테스트 7 〉	통과 (6.87ms, 80.9MB)
	 * 테스트 8 〉	통과 (11.86ms, 99.7MB)
	 * 테스트 9 〉	통과 (70.23ms, 128MB)
	 * 테스트 10 〉	통과 (86.88ms, 135MB)
	 * 테스트 11 〉	통과 (112.27ms, 151MB)
	 * 테스트 12 〉	통과 (1.53ms, 78.2MB)
	 * 테스트 13 〉	통과 (1.35ms, 77.1MB)
	 * 테스트 14 〉	통과 (67.50ms, 140MB)
	 * 테스트 15 〉	통과 (113.68ms, 144MB)
	 * 테스트 16 〉	통과 (1.32ms, 78.4MB)
	 * 테스트 17 〉	통과 (0.99ms, 83.5MB)
	 * 테스트 18 〉	통과 (2.55ms, 85.3MB)
	 * 테스트 19 〉	통과 (3.27ms, 67.6MB)
	 * 테스트 20 〉	통과 (65.71ms, 136MB)
	 * 테스트 21 〉	통과 (121.64ms, 149MB)
	 * 테스트 22 〉	통과 (0.11ms, 81.9MB)
	 * 테스트 23 〉	통과 (0.12ms, 74.1MB)
	 * 테스트 24 〉	통과 (0.11ms, 77.7MB)
	 */
	public static int[] solution(String[] id_list, String[] report, int k) {
		int length = id_list.length;
		int[] result = new int[length];
		
		Map<String, Integer> userIdMap = new HashMap<String, Integer>(); // {muzi=0, neo=3, frodo=1, apeach=2}
		Map<String, List<Integer>> reportIdMap = new HashMap<String, List<Integer>>(); // {muzi=[2], neo=[1, 0], frodo=[0, 2]}
		
		for( int i=0; i<length; i++ )
		{
			String id = id_list[i];
			userIdMap.put(id, i);
		}
		
		for( String reportIds : report )
		{
			String[] splitReportIds = reportIds.split(" ");
			
			String id = splitReportIds[0];
			String repoId = splitReportIds[1];
			
			if( !reportIdMap.containsKey(repoId) )
			{
				reportIdMap.put(repoId, new ArrayList<Integer>());
			}
			
			List<Integer> reportIdList = reportIdMap.get(repoId);
			
			if( !reportIdList.contains(userIdMap.get(id)) )
			{
				reportIdList.add(userIdMap.get(id));
			}
		}
		
		for( String id : id_list )
		{
			if( reportIdMap.containsKey(id) && reportIdMap.get(id).size() >= k )
			{
				for( int i : reportIdMap.get(id) )
				{
					result[i]++;
				}
			}
		}
		
		return result;
	}
}