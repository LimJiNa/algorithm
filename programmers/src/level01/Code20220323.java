package level01;

/**
 * 신규 아이디 추천
 * @author limjina
 */
public class Code20220323 {
	public static void main(String[] args) {
		String new_id1 = "...!@BaT#*..y.abcdefghijklm";
		String new_id2 = "z-+.^.";
		String new_id3 = "=.=";
		String new_id4 = "123_.def";
		String new_id5 = "abcdefghijklmn.p";
		
		System.out.println(solution1(new_id1));
		System.out.println(solution1(new_id2));
		System.out.println(solution1(new_id3));
		System.out.println(solution1(new_id4));
		System.out.println(solution1(new_id5));
	}
	
	/**
	 * 테스트 1 〉	통과 (11.09ms, 92.6MB)
	 * 테스트 2 〉	통과 (9.68ms, 75MB)
	 * 테스트 3 〉	통과 (9.24ms, 77MB)
	 * 테스트 4 〉	통과 (9.77ms, 84.7MB)
	 * 테스트 5 〉	통과 (11.74ms, 80.4MB)
	 * 테스트 6 〉	통과 (9.39ms, 75.3MB)
	 * 테스트 7 〉	통과 (12.09ms, 77.1MB)
	 * 테스트 8 〉	통과 (12.33ms, 77MB)
	 * 테스트 9 〉	통과 (10.86ms, 73.6MB)
	 * 테스트 10 〉	통과 (9.99ms, 76.9MB)
	 * 테스트 11 〉	통과 (12.30ms, 77.4MB)
	 * 테스트 12 〉	통과 (10.75ms, 79.2MB)
	 * 테스트 13 〉	통과 (11.25ms, 75.6MB)
	 * 테스트 14 〉	통과 (14.65ms, 75.7MB)
	 * 테스트 15 〉	통과 (10.87ms, 78.7MB)
	 * 테스트 16 〉	통과 (13.85ms, 79.8MB)
	 * 테스트 17 〉	통과 (15.21ms, 78.8MB)
	 * 테스트 18 〉	통과 (17.93ms, 84.8MB)
	 * 테스트 19 〉	통과 (20.63ms, 80.9MB)
	 * 테스트 20 〉	통과 (17.34ms, 80.7MB)
	 * 테스트 21 〉	통과 (23.93ms, 77.8MB)
	 * 테스트 22 〉	통과 (22.96ms, 84.1MB)
	 * 테스트 23 〉	통과 (26.86ms, 83.4MB)
	 * 테스트 24 〉	통과 (24.80ms, 70.7MB)
	 * 테스트 25 〉	통과 (33.53ms, 86.8MB)
	 * 테스트 26 〉	통과 (22.93ms, 85.2MB)
	 */
	public static String solution(String new_id) {
		String result = "";
		
		new_id = new_id.toLowerCase();
		
		for( int i=0; i<new_id.length(); i++ )
		{
			char charAt = new_id.charAt(i);
			
			if( String.valueOf(charAt).matches("[a-z0-9-_.\\s]") )
			{
				result += charAt;
			}
		}
		
		result = result.replaceAll("[.]{2,}", ".");
		
		if( !result.equals("") && result.substring(0, 1).equals(".") )
		{
			result = result.substring(1);
		}
		if( !result.equals("") && result.substring(result.length()-1).equals(".") )
		{
			result = result.substring(0, result.length()-1);
		}
		
		if( result.equals("") )
		{
			result = result.replaceAll("", "a");
		}
		
		if( result.length() > 15 )
		{
			result = result.substring(0, 15);
			
			if( result.substring(result.length()-1).equals(".") )
			{
				result = result.substring(0, result.lastIndexOf("."));
			}
		}
		
		if( result.length() < 3 )
		{
			String charAt = result.substring((result.length()-1));
			
			for( int i=0; i<=(3-result.length()); i++ )
			{
				result += charAt;
			}
		}
		
		return result;
	}
	
	public static String solution1(String new_id) {
		String result = "";
		
		String tempId = new_id.toLowerCase();
		tempId = tempId.replaceAll("[^a-z0-9-_.]", "");
		tempId = tempId.replaceAll("[.]{2,}", ".");
		tempId = tempId.replaceAll("^[.]|[.]$", "");
		
		if( tempId.equals("") )
		{
			tempId += "a";
		}
		
		if( tempId.length() > 15 )
		{
			tempId = tempId.substring(0, 15);
			
			if( tempId.substring(tempId.length()-1).equals(".") )
			{
				tempId = tempId.substring(0, tempId.lastIndexOf("."));
			}
		}
		
		if( tempId.length() < 3 )
		{
			while( tempId.length() < 3 )
			{
				tempId += tempId.substring(tempId.length()-1);
			}
		}
		
		result = tempId;
		
		return result;
	}
}
