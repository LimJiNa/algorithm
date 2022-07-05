package level01;

import java.util.HashMap;

/**
 * 숫자 문자열과 영단어
 * @author limjina
 */
public class Code20220330 {
	public static void main(String[] args) {
		String s1 = "one4seveneight";
		String s2 = "23four5six7";
		String s3 = "2three45sixseven";
		String s4 = "123";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
		System.out.println(solution(s4));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.10ms, 70.5MB)
	 * 테스트 2 〉	통과 (0.09ms, 74.7MB)
	 * 테스트 3 〉	통과 (0.06ms, 77MB)
	 * 테스트 4 〉	통과 (0.09ms, 75.2MB)
	 * 테스트 5 〉	통과 (0.11ms, 66.7MB)
	 * 테스트 6 〉	통과 (0.11ms, 81MB)
	 * 테스트 7 〉	통과 (0.12ms, 76.5MB)
	 * 테스트 8 〉	통과 (0.11ms, 64.8MB)
	 * 테스트 9 〉	통과 (1.57ms, 87.4MB)
	 * 테스트 10 〉	통과 (0.08ms, 85.6MB)
	 */
	public static int solution(String s) {
		int result = 0;
		
		String[] engWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for( int i=0; i<engWord.length; i++ )
		{
			if( s.contains(engWord[i]) )
			{
				s = s.replace(engWord[i], String.valueOf(i));
			}
		}
		
		result = Integer.parseInt(s);
		
		return result;
	}
	
	public static int solution1(String s) {
		int result = 0;
		
		String[] engWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		HashMap<String, Integer> engWordMap = new HashMap<String, Integer>();
		
		for( int i=0; i<engWord.length; i++ )
		{
			engWordMap.put(engWord[i], i);
		}
		
		for( String word : engWord )
		{
			if( s.contains(word) )
			{
				s = s.replace(word, String.valueOf(engWordMap.get(word)));
			}
		}
		
		result = Integer.parseInt(s);
		
		return result;
	}
}
