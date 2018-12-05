package co.edu.madr.geeksforgeeks.array;

import java.util.Arrays;

/**
 * 
 * Given an array A of size N containing 0s, 1s, and 2s; you need to sort the
 * array in ascending order.
 * 
 * @author madr
 *
 */
public class SortArryOf012 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 0, 0, 2, 0, 2, 0, 0 };
		sortTheGivenArray(arr);
	}

	private static void sortTheGivenArray(int[] arr) {
		int[] countArr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			countArr[value] = countArr[value] + 1;
		}

		int[] result = new int[arr.length];
		int index = 0;
		for (int i = 0; i < countArr.length; i++) {
			for(int m = 0; m < countArr[i] ; m++) {
				result[index++] = i;
			}
		}
		System.out.println(Arrays.toString(result));

	}

}
