package level01;

import java.util.Stack;

/**
 * 크레인 인형뽑기 게임
 * @author limjina
 */
public class Code20220406_2 {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}
						,{0,0,1,0,3}
						,{0,2,5,0,1}
						,{4,2,4,4,2}
						,{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
	
	/**
	 * 테스트 1 〉	통과 (0.25ms, 78.6MB)
	 * 테스트 2 〉	통과 (0.27ms, 66MB)
	 * 테스트 3 〉	통과 (0.31ms, 84.7MB)
	 * 테스트 4 〉	통과 (10.52ms, 68.1MB)
	 * 테스트 5 〉	통과 (0.18ms, 80.3MB)
	 * 테스트 6 〉	통과 (0.19ms, 63.6MB)
	 * 테스트 7 〉	통과 (0.34ms, 71.9MB)
	 * 테스트 8 〉	통과 (0.57ms, 82.8MB)
	 * 테스트 9 〉	통과 (0.61ms, 74.3MB)
	 * 테스트 10 〉	통과 (0.63ms, 73.2MB)
	 * 테스트 11 〉	통과 (13.43ms, 84.7MB)
	 */
	public static int solution(int[][] board, int[] moves) {
		int result = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for( int move : moves ) {
			System.out.println("move :: " + move);
			for( int i=0; i<board.length; i++ ) {
				System.out.println("board[i][move-1] :: " + board[i][move-1]);
				if( board[i][move-1] != 0 ) {
					if( !stack.empty() && stack.peek() == board[i][move-1] ) {
						result += 2;
						stack.pop();
						board[i][move-1] = 0;
						break;
					} else {
						stack.push(board[i][move-1]);
						board[i][move-1] = 0;
						break;
					}
				}
			}
		}
		
		return result;
	}
}
