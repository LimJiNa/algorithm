package level01;

import java.util.Arrays;

/**
 * [1차] 비밀지도
 * @author jinalim
 */
public class Code20220610_1 {
	public static void main(String[] args) {
//		int n = 5;
//		int[] arr1 = {9, 20, 28, 18, 11};
//		int[] arr2 = {30, 1, 21, 17, 28};
		
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		
		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
	}
	
	/**
	 * 테스트 1 〉	통과 (7.85ms, 78.8MB)
	 * 테스트 2 〉	통과 (7.30ms, 86.2MB)
	 * 테스트 3 〉	통과 (9.81ms, 86.1MB)
	 * 테스트 4 〉	통과 (9.18ms, 78.6MB)
	 * 테스트 5 〉	통과 (6.34ms, 74.6MB)
	 * 테스트 6 〉	통과 (7.52ms, 76MB)
	 * 테스트 7 〉	통과 (7.83ms, 74.6MB)
	 * 테스트 8 〉	통과 (6.47ms, 71.9MB)
	 */
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for( int i=0; i<n; i++ ) {
			String str = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i] | arr2[i]).toString()));
			
			str = str.replace("1", "#");
			str = str.replace("0", " ");
			
			answer[i] = str;
		}
		
		return answer;
	}
	
	public String[] solution1(int n, int [] arr1, int [] arr2) {
		String [] answer = new String[n];
		int [] secretMap = new int[n];
		
		for( int i = 0; i < n; i++ ) {
			secretMap[i] = arr1[i] | arr2[i];
			answer[i] = makeSharp(secretMap[i], n);
		}
		return answer;
	}
	
	public String makeSharp(int n, int m) {
		if( n == 0 ) {
			if( m > 0 ) {
				String str = "";
				for( int i = 0; i < m; i++ ) {
					str += " ";
				}
				
				return str;
			}
			else return "";
		} else {
			return n % 2 == 0 ? makeSharp(n/2, m-1) + " " : makeSharp(n/2, m-1) + "#"; 
		}
	}
}
