package co.edu.madr.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given an array A of N positive numbers. The task is to find the position
 * where equilibrium first occurs in the array. Equilibrium position in an array
 * is a position such that the sum of elements below it is equal to the sum of
 * elements after it.
 * 
 * @author madr
 * @since 12 Dec 2018
 *
 */
public class EquilibriumPoint {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 2, 2 };
		pringEquilibriumPoint(arr);
		pringEquilibriumPoint(new int[] { 0, -3, 5, -4, -2, 3, 1, 0 });

	}

	private static void pringEquilibriumPoint(int[] arr) {
		List<Integer> equlibriumPoints = new ArrayList<Integer>();
		int[] lrCount = new int[arr.length];
		int[] rlCount = new int[arr.length];

		int lrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			lrSum += arr[i];
			lrCount[i] = lrSum;
		}

		int rlSum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			rlSum += arr[i];
			rlCount[i] = rlSum;
			if (rlSum == lrCount[i]) {
				equlibriumPoints.add(i);
			}
		}

		System.out.println("Equilibrium point:: " + (equlibriumPoints));
	}
}