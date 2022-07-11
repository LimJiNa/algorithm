package bronze05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10951 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		while ((str = br.readLine()) != null) {
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
