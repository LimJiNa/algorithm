package step19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택
 */
public class P10828 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String command = str.split(" ")[0];

			if (command.equals("push")) {
				stack.push(Integer.parseInt(str.split(" ")[1]));
			} else if (command.equals("pop")) {
				System.out.println((stack.isEmpty()) ? -1 : stack.pop());
			} else if (command.equals("size")) {
				System.out.println(stack.size());
			} else if (command.equals("empty")) {
				System.out.println((stack.isEmpty()) ? 1 : 0);
			} else if (command.equals("top")) {
				System.out.println((stack.isEmpty()) ? -1 : stack.peek());
			}

		}
	}
}
