package level01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * 2016년
 * @author limjina
 */
public class Code20220527_1 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		System.out.println(solution(a, b));
	}
	
	/**
	 * 테스트 1 〉	통과 (96.46ms, 84.2MB)
	 * 테스트 2 〉	통과 (18.15ms, 77.9MB)
	 * 테스트 3 〉	통과 (57.57ms, 78.3MB)
	 * 테스트 4 〉	통과 (95.46ms, 95.1MB)
	 * 테스트 5 〉	통과 (22.78ms, 79.9MB)
	 * 테스트 6 〉	통과 (18.69ms, 84.9MB)
	 * 테스트 7 〉	통과 (21.11ms, 73.3MB)
	 * 테스트 8 〉	통과 (17.88ms, 87.6MB)
	 * 테스트 9 〉	통과 (19.58ms, 73.2MB)
	 * 테스트 10 〉	통과 (19.61ms, 83.4MB)
	 * 테스트 11 〉	통과 (19.73ms, 78.7MB)
	 * 테스트 12 〉	통과 (25.00ms, 79.7MB)
	 * 테스트 13 〉	통과 (19.21ms, 78.4MB)
	 * 테스트 14 〉	통과 (19.34ms, 76.8MB)
	 */
	public static String solution(int a, int b) {
		LocalDate date = LocalDate.of(2016, a, b);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		return dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
	}
}
