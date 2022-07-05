package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * K번째수
 * @author limjina
 */
public class Code20220422_2 {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands =	{{2, 5, 3}
							,{4, 4, 1}
							,{1, 7, 3}};
		
		System.out.println(Arrays.toString(solution(array, commands)));
		System.out.println(Arrays.toString(solution1(array, commands)));
		System.out.println(Arrays.toString(solution2(array, commands)));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.35ms, 75.6MB)
	 * 테스트 2 〉	통과 (0.38ms, 73.6MB)
	 * 테스트 3 〉	통과 (0.33ms, 74.7MB)
	 * 테스트 4 〉	통과 (0.38ms, 75.2MB)
	 * 테스트 5 〉	통과 (0.34ms, 73.9MB)
	 * 테스트 6 〉	통과 (0.36ms, 73.4MB)
	 * 테스트 7 〉	통과 (0.31ms, 73.4MB)
	 */
	public static int[] solution(int[] array, int[][] commands) {
		int[] result = new int[commands.length];
		
		for( int i=0; i<commands.length; i++ ) {
			int start = commands[i][0]-1;
			int end = commands[i][1];
			int idx = commands[i][2]-1;
			
			int[] tmp = Arrays.copyOfRange(array, start, end);
			
			Arrays.sort(tmp);
			
			result[i] = tmp[idx];
		}
		
		return result;
	}
	
	/**
	 * 테스트 1 〉	통과 (0.20ms, 79MB)
	 * 테스트 2 〉	통과 (0.19ms, 72.8MB)
	 * 테스트 3 〉	통과 (0.26ms, 78.1MB)
	 * 테스트 4 〉	통과 (0.27ms, 80.4MB)
	 * 테스트 5 〉	통과 (0.20ms, 85.3MB)
	 * 테스트 6 〉	통과 (0.21ms, 72.5MB)
	 * 테스트 7 〉	통과 (0.30ms, 80.5MB)
	 */
	public static int[] solution1(int[] array, int[][] commands) {
		int[] result = new int[commands.length];
		
		for( int i=0; i<commands.length; i++ ) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			
			int start = commands[i][0]-1;
			int end = commands[i][1];
			int idx = commands[i][2]-1;
			
			for( int j=start; j<end; j++ ) {
				tmp.add(array[j]);
			}
			
			Collections.sort(tmp);
			
			result[i] = tmp.get(idx);
		}
		
		return result;
	}
	
	public static int[] solution2(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		int one = 0;
		int two = 0;
		int three = 0;
		
		for( int i=0; i<commands.length; i++ ) {
			for( int j=0; j<commands.length; j++ ) {
				if( j == 0 ) {
					one = commands[i][j];
				} else if( j == 1 ) {
					two = commands[i][j];
				} else if( j == 2 ) {
					three = commands[i][j];
				}
			}
			
			int[] temp = Arrays.copyOfRange(array, one-1, two);
			
			for( int j=0; j<temp.length-1; j++ ) {
				for( int k=temp.length-1; k>j; k-- ) {
					if( temp[k-1] > temp[k] ) {
						swap(temp, k-1, k);
					}
				}
			}
			
			answer[i] = temp[three-1];
		}
		
		return answer;
	}
	
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
}
