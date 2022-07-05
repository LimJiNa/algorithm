package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 나누어 떨어지는 숫자 배열
 * 
 * @author jinalim
 */
public class Code20220624_1 {
	public static void main(String[] args) {
		int[] arr1 = { 5, 9, 7, 10 };
		int[] arr2 = { 2, 36, 1, 3 };
		int[] arr3 = { 3, 2, 6 };

		int divisor1 = 5;
		int divisor2 = 1;
		int divisor3 = 10;

		System.out.println(Arrays.toString(solution(arr1, divisor1)));
		System.out.println(Arrays.toString(solution(arr2, divisor2)));
		System.out.println(Arrays.toString(solution(arr3, divisor3)));
	}

	/**
	 * +1
	 * 
	 * 테스트 1 〉	통과 (3.44ms, 77.7MB)
	 * 테스트 2 〉	통과 (9.24ms, 83.7MB)
	 * 테스트 3 〉	통과 (2.36ms, 72.5MB)
	 * 테스트 4 〉	통과 (2.40ms, 75.9MB)
	 * 테스트 5 〉	통과 (2.56ms, 70.1MB)
	 * 테스트 6 〉	통과 (4.06ms, 82.9MB)
	 * 테스트 7 〉	통과 (10.71ms, 73.6MB)
	 * 테스트 8 〉	통과 (2.16ms, 78.7MB)
	 * 테스트 9 〉	통과 (3.45ms, 80.3MB)
	 * 테스트 10 〉	통과 (4.15ms, 81.4MB)
	 * 테스트 11 〉	통과 (3.43ms, 84.1MB)
	 * 테스트 12 〉	통과 (9.85ms, 103MB)
	 * 테스트 13 〉	통과 (3.14ms, 74.3MB)
	 * 테스트 14 〉	통과 (12.85ms, 72.2MB)
	 * 테스트 15 〉	통과 (3.78ms, 87.9MB)
	 * 테스트 16 〉	통과 (5.76ms, 74MB)
	 */
	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();

		for (int number : arr) {
			if (number % divisor == 0) {
				list.add(number);
			}
		}

		if (list.isEmpty()) {
			list.add(-1);
		}

		list.sort(Comparator.naturalOrder());

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public int[] solution1(int[] array, int divisor) {
		// ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
		return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
	}

	public int[] solution2(int[] arr, int divisor) {
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
		if (answer.length == 0)
			answer = new int[] { -1 };
		java.util.Arrays.sort(answer);
		return answer;
	}
}
