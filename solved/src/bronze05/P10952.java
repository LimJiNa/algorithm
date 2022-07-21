package bronze05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * A+B - 5
 */
public class P10952 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		while (!(str = br.readLine()).equals("0 0")) {
			System.out.println(solution(str));
		}
	}

	public static int solution(String str) {
		String[] arr = str.split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);

		return num1 + num2;
	}
}
