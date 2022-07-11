package bronze05;

import java.math.BigInteger;
import java.util.Scanner;

public class P11382 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		System.out.println(solution(str));

		scan.close();
	}

	public static BigInteger solution(String str) {
		String[] arr = str.split(" ");

		BigInteger num1 = new BigInteger(arr[0]);
		BigInteger num2 = new BigInteger(arr[1]);
		BigInteger num3 = new BigInteger(arr[2]);

		return num1.add(num2).add(num3);
	}
}
