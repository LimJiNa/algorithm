package level01;

/**
 * 부족한 금액 계산하기
 * @author limjina
 */
public class Code20220603_2 {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		
		System.out.println(solution(price, money, count));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.05ms, 75.6MB)
	 * 테스트 2 〉	통과 (0.14ms, 79.5MB)
	 * 테스트 3 〉	통과 (0.06ms, 76.5MB)
	 * 테스트 4 〉	통과 (0.14ms, 75.6MB)
	 * 테스트 5 〉	통과 (0.06ms, 85.6MB)
	 * 테스트 6 〉	통과 (0.08ms, 75.3MB)
	 * 테스트 7 〉	통과 (0.06ms, 72.5MB)
	 * 테스트 8 〉	통과 (0.11ms, 77.1MB)
	 * 테스트 9 〉	통과 (0.07ms, 72.8MB)
	 * 테스트 10 〉	통과 (0.06ms, 73.2MB)
	 * 테스트 11 〉	통과 (0.05ms, 88.3MB)
	 * 테스트 12 〉	통과 (0.08ms, 73.5MB)
	 * 테스트 13 〉	통과 (0.15ms, 73.3MB)
	 * 테스트 14 〉	통과 (0.10ms, 68.6MB)
	 * 테스트 15 〉	통과 (0.12ms, 68.3MB)
	 * 테스트 16 〉	통과 (0.06ms, 70.8MB)
	 * 테스트 17 〉	통과 (0.07ms, 77.2MB)
	 * 테스트 18 〉	통과 (0.11ms, 71.9MB)
	 * 테스트 19 〉	통과 (0.12ms, 74.1MB)
	 * 테스트 20 〉	통과 (0.09ms, 69MB)
	 * 테스트 21 〉	통과 (0.12ms, 84.9MB)
	 * 테스트 22 〉	통과 (0.08ms, 73.9MB)
	 * 테스트 23 〉	통과 (0.09ms, 75MB)
	 */
	public static long solution(int price, int money, int count) {
		long sum = 0;
		for( int i=1; i<=count; i++ ) {
			sum += (price*i);
		}
		
		return (sum > money) ? sum-money : 0;
	}
	
	public long solution1(int price, int money, int count) {
		return Math.max(price * (count * (count + 1) / 2) - money, 0);
	}
}
