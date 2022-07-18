package hashMapNtreeSet;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * K번째 큰 수
 * 
 * 10 3
 * 13 15 34 23 45 65 33 11 26 42
 */
public class Problem05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(solution(n, k, arr));

		scan.close();
	}

	/**
	 * Set 자료구조 : 중복을 제거하는 자료구조, 내림차순 및 오름차순을 사용하기 위해서는 TreeSet을 사용해야 함
	 * TreeSet은 이진트리구조, 레드블랙트리, 균형잡힌 이진트리
	 */
	public static int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> treeSet = new TreeSet<>();

		for (int i = 0; i < n; i++) {
			for (int j = (i + 1); j < n; j++) {
				for (int s = (j + 1); s < n; s++) {
					treeSet.add(arr[i] + arr[j] + arr[s]);
				}
			}
		}

		NavigableSet<Integer> decendingSet = treeSet.descendingSet();

		int cnt = 1;
		for (int x : decendingSet) {
			if (cnt == k) {
				answer = x;
			}

			cnt++;
		}

		return answer;
	}

	public static int solving(int n, int k, int[] arr) {
		int answer = -1;

		/**
		 * Collections.reverseOrder()이 없으면 기본적으로 오름차순 정렬 존재하면 내림차순 정렬
		 */
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}

		int cnt = 0;
		for (int x : Tset) {
			cnt++;

			if (cnt == k)
				return x;
		}

		return answer;
	}
}
