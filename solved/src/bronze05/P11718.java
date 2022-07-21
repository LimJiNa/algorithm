package bronze05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 그대로 출력하기
 */
public class P11718 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}
}
