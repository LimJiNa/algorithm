package bronze05;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * A+B - 9
 */
public class P15740 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();

		System.out.println(solution(a, b));

		scan.close();
	}

	public static BigInteger solution(String a, String b) {
		BigInteger num1 = new BigInteger(a);
		BigInteger num2 = new BigInteger(b);

		return num1.add(num2);
	}
}
