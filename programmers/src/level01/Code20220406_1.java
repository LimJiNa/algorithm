package level01;

/**
 * 키패드 누르기
 * @author limjina
 */
public class Code20220406_1 {
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		
		System.out.println("result :: " + solution(numbers, hand));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.03ms, 76MB)
	 * 테스트 2 〉	통과 (0.03ms, 72.2MB)
	 * 테스트 3 〉	통과 (0.05ms, 75MB)
	 * 테스트 4 〉	통과 (0.02ms, 69.1MB)
	 * 테스트 5 〉	통과 (0.04ms, 74.7MB)
	 * 테스트 6 〉	통과 (0.05ms, 74.9MB)
	 * 테스트 7 〉	통과 (0.04ms, 72.5MB)
	 * 테스트 8 〉	통과 (0.04ms, 75.7MB)
	 * 테스트 9 〉	통과 (0.05ms, 80.2MB)
	 * 테스트 10 〉	통과 (0.05ms, 75.9MB)
	 * 테스트 11 〉	통과 (0.06ms, 80.3MB)
	 * 테스트 12 〉	통과 (0.04ms, 73.6MB)
	 * 테스트 13 〉	통과 (0.04ms, 76MB)
	 * 테스트 14 〉	통과 (0.10ms, 73MB)
	 * 테스트 15 〉	통과 (0.09ms, 70.7MB)
	 * 테스트 16 〉	통과 (0.10ms, 74.6MB)
	 * 테스트 17 〉	통과 (0.24ms, 78.7MB)
	 * 테스트 18 〉	통과 (0.21ms, 75.5MB)
	 * 테스트 19 〉	통과 (0.26ms, 79.5MB)
	 * 테스트 20 〉	통과 (0.23ms, 75.9MB)
	 */
	public static String solution(int[] numbers, String hand) {
		StringBuilder result = new StringBuilder();
		
		int left = 10;
		int right = 12;
		
		for( int number : numbers )
		{
			if( number == 0 )
			{
				number = 11;
			}
			
			switch( number % 3 )
			{
				case 1:
					result.append("L");
					left = number;
					break;
				case 0:
					result.append("R");
					right = number;
					break;
				case 2:
					int minusLeft = ( number < left ) ? left - number : number - left;
					int minusRight = ( number < right ) ? right - number : number - right;
					
					int calcLeft = (minusLeft % 3) + (minusLeft / 3);
					int calcRight = (minusRight % 3) + (minusRight / 3);
					
					if( calcLeft < calcRight )
					{
						result.append("L");
						left = number;
					}
					else if( calcRight < calcLeft )
					{
						result.append("R");
						right = number;
					}
					else
					{
						if( hand.equals("left") )
						{
							result.append("L");
							left = number;
						}
						else
						{
							result.append("R");
							right = number;
						}
					}
					break;
			}
		}
		
		return result.toString();
	}
}
