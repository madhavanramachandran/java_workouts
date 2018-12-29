package co.edu.daillycoding.nov2018;

import java.util.HashMap;
import java.util.Map;

/**
 * This problem was recently asked by Google.
 * 
 * Given a list of numbers and a number k, return whether any two numbers from
 * the list add up to k.
 * 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
 * 17.
 * 
 * Bonus: Can you do this in one pass?
 * 
 * @author madr
 *
 */
public class AddUptoK_21_11_2018 {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 3, 7 };
		int sumValue = 17;
		System.out.println(validSetPresent(arr, sumValue));
		System.out.println(validSetPresent2(arr, sumValue));
	}

	/**
	 * Time Complexity:: O(n^2)
	 * 
	 * @param arr
	 * @param sumValue
	 * @return
	 */
	private static boolean validSetPresent(int[] arr, int sumValue) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && (arr[i] + arr[j]) == sumValue)
					return true;
			}
		}
		return false;
	}

	private static boolean validSetPresent2(int[] arr, int sumValue) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int currentValue = arr[i];
			if (map.containsKey(sumValue - currentValue)) {
				return true;
			} else {
				/* i will store the index */
				map.put(currentValue, i);
				/* if index is not required we could go with HashSet */
			}

		}
		return false;
	}

}
