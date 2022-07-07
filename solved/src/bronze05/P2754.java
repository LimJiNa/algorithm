package bronze05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P2754 {

	public static void main(String[] args) {
		final Map<String, Float> scoreMap = getScore();

		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		System.out.println(scoreMap.get(str));

		scan.close();
	}

	public static Map<String, Float> getScore() {
		Map<String, Float> scoreMap = new HashMap<>();
		scoreMap.put("A+", (float) 4.3);
		scoreMap.put("A0", (float) 4.0);
		scoreMap.put("A-", (float) 3.7);
		scoreMap.put("B+", (float) 3.3);
		scoreMap.put("B0", (float) 3.0);
		scoreMap.put("B-", (float) 2.7);
		scoreMap.put("C+", (float) 2.3);
		scoreMap.put("C0", (float) 2.0);
		scoreMap.put("C-", (float) 1.7);
		scoreMap.put("D+", (float) 1.3);
		scoreMap.put("D0", (float) 1.0);
		scoreMap.put("D-", (float) 0.7);
		scoreMap.put("F", (float) 0.0);
		return scoreMap;
	}
}
