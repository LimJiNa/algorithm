package hashMapNtreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str1 = scan.next();
		String str2 = scan.next();

		System.out.println(solution(str1, str2));

		scan.close();
	}

	public static int solution(String str1, String str2) {
		int answer = 0;

		HashMap<Character, Integer> str1Map = new HashMap<>();
		HashMap<Character, Integer> str2Map = new HashMap<>();

		for (char x : str2.toCharArray()) {
			str2Map.put(x, str2Map.getOrDefault(x, 0) + 1);
		}

		for (int i = 0; i < (str2.length() - 1); i++) {
			str1Map.put(str1.charAt(i), str1Map.getOrDefault(str1.charAt(i), 0) + 1);
		}

		int lt = 0;
		for (int rt = (str2.length() - 1); rt < str1.length(); rt++) {
			str1Map.put(str1.charAt(rt), str1Map.getOrDefault(str1.charAt(rt), 0) + 1);

			if (str2Map.equals(str1Map)) {
				answer++;
			}

			str1Map.put(str1.charAt(lt), str1Map.get(str1.charAt(lt)) - 1);
			if (str1Map.get(str1.charAt(lt)) == 0) {
				str1Map.remove(str1.charAt(lt));
			}

			lt++;
		}

		return answer;
	}
}
