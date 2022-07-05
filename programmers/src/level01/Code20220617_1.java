package level01;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * [1차] 다트 게임
 * @author jinalim
 */
public class Code20220617_1 {
	public static void main(String[] args) {
		System.out.println(solution("1S2D*3T"));
		System.out.println(solution("1D2S#10S"));
		System.out.println(solution("1D2S0T"));
		System.out.println(solution("1S*2T*3S"));
		System.out.println(solution("1D#2S*3S"));
		System.out.println(solution("1T2D3D#"));
		System.out.println(solution("1D2S3T*"));
	}
	
	/**
	 * +5
	 * 
	 * 테스트 1 〉	통과 (1.67ms, 76.5MB)
	 * 테스트 2 〉	통과 (1.10ms, 74.5MB)
	 * 테스트 3 〉	통과 (1.11ms, 86.7MB)
	 * 테스트 4 〉	통과 (1.12ms, 73.8MB)
	 * 테스트 5 〉	통과 (1.48ms, 78MB)
	 * 테스트 6 〉	통과 (1.08ms, 72.6MB)
	 * 테스트 7 〉	통과 (1.31ms, 72.4MB)
	 * 테스트 8 〉	통과 (1.18ms, 74.9MB)
	 * 테스트 9 〉	통과 (1.09ms, 75.4MB)
	 * 테스트 10 〉	통과 (1.22ms, 74.8MB)
	 * 테스트 11 〉	통과 (1.29ms, 76.3MB)
	 * 테스트 12 〉	통과 (1.34ms, 79.3MB)
	 * 테스트 13 〉	통과 (1.66ms, 79.6MB)
	 * 테스트 14 〉	통과 (1.23ms, 76.5MB)
	 * 테스트 15 〉	통과 (1.32ms, 78.7MB)
	 * 테스트 16 〉	통과 (1.15ms, 76.1MB)
	 * 테스트 17 〉	통과 (1.27ms, 73.3MB)
	 * 테스트 18 〉	통과 (1.44ms, 71.3MB)
	 * 테스트 19 〉	통과 (1.32ms, 73.5MB)
	 * 테스트 20 〉	통과 (1.28ms, 76MB)
	 * 테스트 21 〉	통과 (1.17ms, 72.1MB)
	 * 테스트 22 〉	통과 (1.38ms, 74.9MB)
	 * 테스트 23 〉	통과 (1.22ms, 74.9MB)
	 * 테스트 24 〉	통과 (1.21ms, 76.1MB)
	 * 테스트 25 〉	통과 (1.15ms, 70.3MB)
	 * 테스트 26 〉	통과 (1.30ms, 69.8MB)
	 * 테스트 27 〉	통과 (1.75ms, 76.2MB)
	 * 테스트 28 〉	통과 (1.31ms, 72.5MB)
	 * 테스트 29 〉	통과 (1.06ms, 84.2MB)
	 * 테스트 30 〉	통과 (1.27ms, 71.8MB)
	 * 테스트 31 〉	통과 (1.32ms, 74.7MB)
	 * 테스트 32 〉	통과 (1.13ms, 77.1MB)
	 */
	public static int solution(String dartResult) {
		int[] score = new int[3];
		int idx = 0;
		
		String numberStr = "";
		for( int i=0; i<dartResult.length(); i++ ) {
			char x = dartResult.charAt(i);
			
			if( Character.isDigit(x) ) {
				numberStr += Character.toString(x);
				
				if( numberStr.length() != 2 ) idx++;
				continue;
			}
			
			if( x == 'S' )
			{
				score[idx-1] = (int) Math.pow(Integer.parseInt(numberStr), 1);
			}
			else if( x == 'D' )
			{
				score[idx-1] = (int) Math.pow(Integer.parseInt(numberStr), 2);
			}
			else if( x == 'T' )
			{
				score[idx-1] = (int) Math.pow(Integer.parseInt(numberStr), 3);
			}
			else if( x == '*' )
			{
				if( idx != 1 ) {
					score[idx-2] = score[idx-2] * 2;
				}
				
				score[idx-1] = score[idx-1] * 2;
			}
			else if( x == '#' )
			{
				score[idx-1] = score[idx-1] * -1;
			}
			
			numberStr = "";
		}
		
		return score[0] + score[1] + score[2];
	}
	
	public static int solution1(String dartResult) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		for( int a=0; a<dartResult.length(); a++ ) {
			if( dartResult.charAt(a) == '#' )
			{
				int num = stack.pop();
				stack.push(num*-1);
			}
			else if( dartResult.charAt(a) == '*' )
			{
				int num = stack.pop();
				int num2 = stack.pop();
				stack.push(num2*2);
				stack.push(num*2);
			}
			else if( dartResult.charAt(a) == 'S' )
			{
				int num = stack.pop();
				stack.push(num);
			}
			else if( dartResult.charAt(a) == 'D' )
			{
				int num = stack.pop();
				stack.push(num*num);
			}
			else if( dartResult.charAt(a) == 'T' )
			{
				int num = stack.pop();
				stack.push(num*num*num);
			}
			else
			{
				int num = Integer.parseInt(String.valueOf(dartResult.charAt(a)));
				char num2 = dartResult.charAt(a+1);
				
				if( num==1 && num2=='0' ) {
					stack.push(10);
					a=a+1;
				} else {
					stack.push(Integer.parseInt(String.valueOf(dartResult.charAt(a))));
				}
			}
		}
		
		return stack.pop()+stack.pop()+stack.pop();
	}
	
	public int solution2(String dartResult) {
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		
		for( int i=0; i<dartResult.length(); ++i ) {
			char c = dartResult.charAt(i);
			
			if( Character.isDigit(c) )
			{
				sum = (c - '0');
				
				if( sum == 1 && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0' ) {
					sum = 10;
					i++;
				}
				
				stack.push(sum);
			}
			else
			{
				int prev = stack.pop();
				if( c == 'D' ) {
					prev *= prev;
				} else if( c == 'T' ) {
					prev = prev * prev * prev;
				} else if( c == '*' ) {
					if( !stack.isEmpty() ) {
						int val = stack.pop() * 2;
						stack.push(val);
					}
					prev *= 2;
				} else if( c == '#' ) {
					prev *= (-1);
				}
				
				stack.push(prev);
			}
		}
		
		int totalScore = 0;
		while( !stack.isEmpty() ) {
			totalScore += stack.pop();
		}
		
		return totalScore;
	}
	
	public int solution3(String dartResult) {
		String[] arrTemp = dartResult.split("");
		String sTarget = "";
		
		int nBeforeScore = 0;
		int nPresentScore = 0;
		int nTotalScore = 0;
		
		for( int i=0; i<arrTemp.length; i++ ) {
			if( arrTemp[i].equals("1") || arrTemp[i].equals("2") || arrTemp[i].equals("3") || arrTemp[i].equals("4") || arrTemp[i].equals("5") ||
				arrTemp[i].equals("6") || arrTemp[i].equals("7")|| arrTemp[i].equals("8") || arrTemp[i].equals("9") || arrTemp[i].equals("0") )
			{
				sTarget += arrTemp[i];
			}
			else if( arrTemp[i].equals("S") || arrTemp[i].equals("D") || arrTemp[i].equals("T") )
			{
				nTotalScore += nBeforeScore;
				nBeforeScore = nPresentScore;
				nPresentScore = Integer.parseInt(sTarget);
				sTarget = "";
				if( arrTemp[i].equals("D") ) {
					nPresentScore = (int) Math.pow(nPresentScore, 2);
				}else if( arrTemp[i].equals("T") ) {
					nPresentScore = (int) Math.pow(nPresentScore, 3);
				}
			}
			else if( arrTemp[i].equals("*") || arrTemp[i].equals("#") )
			{
				if( arrTemp[i].equals("*") ) {
					nBeforeScore = nBeforeScore * 2;
					nPresentScore = nPresentScore * 2;
				} else if( arrTemp[i].equals("#") ) {
					nPresentScore = nPresentScore * -1;
				}
			}
		}
		
		nTotalScore += nBeforeScore;
		nTotalScore += nPresentScore;
		
		return nTotalScore;
	}
	
	static int[] sum = new int[3];
	static int solution4(String msg) {
		String reg = "([0-9]{1,2}[S|T|D][*|#]{0,1})";
		Pattern p = Pattern.compile(reg+reg+reg);
		Matcher m = p.matcher(msg);
		m.find();
		
		for( int i=1; i<=m.groupCount(); i++ ) {
			Pattern p1 = Pattern.compile("([0-9]{1,2})([S|T|D])([*|#]{0,1})");
			Matcher m1 = p1.matcher(m.group(i));
			m1.find();
			sum[i-1] = (int)Math.pow(Integer.parseInt(m1.group(1)), getpow(m1.group(2)));
			setting(i,m1.group(3));
		}
		
		return(sum[0]+ sum[1]+ sum[2]);
	}
	
	static void setting(int idx, String msg) {
		if( msg.equals("*") ) {
			sum[idx - 1] *= 2;
			if( idx > 1 ) {
				sum[idx - 2] *=2;
			}
		} else if( msg.equals("#") ) {
			sum[idx - 1] *=-1 ;
		}
	}
	
	static int getpow(String mag) {
		if( mag.equals("S") ) {
			return 1; 
		} else if( mag.equals("D") ) {
			return 2;
		} else {
			return 3;
		}
	}
}
