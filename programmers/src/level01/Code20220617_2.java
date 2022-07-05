package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 같은 숫자는 싫어
 * @author jinalim
 */
public class Code20220617_2 {
	public static void main(String[] args) {
		int[] arr1 = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		
		System.out.println(Arrays.toString(solution(arr1)));
		System.out.println(Arrays.toString(solution(arr2)));
	}
	
	/**
	 * +1
	 * 
	 * 정확성  테스트
	 * 테스트 1 〉	통과 (2.00ms, 77.4MB)
	 * 테스트 2 〉	통과 (2.15ms, 76.9MB)
	 * 테스트 3 〉	통과 (2.21ms, 76.5MB)
	 * 테스트 4 〉	통과 (3.15ms, 74.1MB)
	 * 테스트 5 〉	통과 (2.08ms, 74MB)
	 * 테스트 6 〉	통과 (2.00ms, 76.3MB)
	 * 테스트 7 〉	통과 (3.01ms, 84MB)
	 * 테스트 8 〉	통과 (2.08ms, 70.9MB)
	 * 테스트 9 〉	통과 (2.18ms, 80.4MB)
	 * 테스트 10 〉	통과 (2.22ms, 78.7MB)
	 * 테스트 11 〉	통과 (2.17ms, 75.1MB)
	 * 테스트 12 〉	통과 (2.19ms, 73.8MB)
	 * 테스트 13 〉	통과 (2.22ms, 75.4MB)
	 * 테스트 14 〉	통과 (2.13ms, 77.5MB)
	 * 테스트 15 〉	통과 (2.11ms, 74MB)
	 * 테스트 16 〉	통과 (2.37ms, 77.5MB)
	 * 테스트 17 〉	통과 (2.14ms, 76.3MB)
	 * 
	 * 효율성  테스트
	 * 테스트 1 〉	통과 (54.58ms, 119MB)
	 * 테스트 2 〉	통과 (55.54ms, 119MB)
	 * 테스트 3 〉	통과 (56.27ms, 115MB)
	 * 테스트 4 〉	통과 (53.87ms, 134MB)
	 */
	public static int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for( int number : arr ) {
			if( stack.empty() ) {
				stack.push(number);
			} else {
				if( number == stack.peek() ) continue;
				stack.push(number);
			}
		}
		
		return new ArrayList<Integer>(stack).stream().mapToInt(Integer::intValue).toArray();
	}
	
	public int[] solution1(int[] arr) {
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		int preNum = 10;
		
		for( int num : arr ) {
			if( preNum != num )
				tempList.add(num);
			preNum = num;
		}
		
		int[] answer = new int[tempList.size()];
		for( int i=0; i<answer.length; i++ ) {
			answer[i] = tempList.get(i).intValue();
		}
		
		return answer;
	}
	
	public int[] solution2(int []arr) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		
		for( int i = 1; i < arr.length; i++ ) {
			if( arr[i] != arr[i - 1] ) list.add(arr[i]);
		}
		
		int[] answer = new int[list.size()];
		
		for( int i = 0; i < list.size(); i++ ) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}
