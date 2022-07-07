package bronze05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4101 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		while (!(str = br.readLine()).equals("0 0")) {
			System.out.println(solution(str));
		}
	}

	public static String solution(String str) {
		StringBuilder sb = new StringBuilder();
		String[] arr = str.split(" ");

		if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) {
			sb.append("Yes");
		} else {
			sb.append("No");
		}

		return sb.toString();
	}
}
