package bronze05;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 엄청난 부자2
 */
public class P1271 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String n = scan.next();
		String m = scan.next();

		solution(n, m);

		scan.close();
	}

	public static void solution(String n, String m) {
		BigInteger bigN = new BigInteger(n);
		BigInteger bigM = new BigInteger(m);

		System.out.println(bigN.divide(bigM));
		System.out.println(bigN.remainder(bigM));
	}
}
