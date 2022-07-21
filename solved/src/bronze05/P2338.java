package bronze05;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 긴자리 계산
 */
public class P2338 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();

		solution(a, b);

		scan.close();
	}

	public static void solution(String a, String b) {
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);

		System.out.println(bigA.add(bigB));
		System.out.println(bigA.subtract(bigB));
		System.out.println(bigA.multiply(bigB));
	}
}
