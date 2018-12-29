package co.edu.daillycoding.nov2018;

import java.util.Arrays;

/**
 * This problem was asked by Uber.
 * 
 * Given an array of integers, return a new array such that each element at
 * index i of the new array is the product of all the numbers in the original
 * array except the one at i.
 * 
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
 * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
 * be [2, 3, 6].
 * 
 * Follow-up: what if you can't use division?
 * 
 * @author madr
 *
 */
public class ExcludeSelf_22_11_2018 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		excludeSelf(arr);
		excludeSelfNoDivision(arr);
	}

	/**
	 * Time Complexity: O(N) [N + N]
	 * 
	 * @param arr
	 */
	static void excludeSelf(int[] arr) {
		int prod = 1;
		for (int i = 0; i < arr.length; i++) {
			prod *= arr[i];
		}

		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = prod / arr[i];
		}
		System.out.println("Result:: " + Arrays.toString(result));
	}

	/**
	 * Time COmplexity: O(N) [N + N + N]
	 * 
	 * THis is one with no division is involved.
	 * 
	 * @param arr
	 */
	static void excludeSelfNoDivision(int[] arr) {
		int[] preMul = new int[arr.length];
		int[] postMul = new int[arr.length];

		preMul[0] = 1;
		postMul[arr.length - 1] = 1;

		int preProd = 1;
		int postProd = 1;
		for (int i = 1; i < arr.length; i++) {
			preProd *= arr[i - 1];
			preMul[i] = preProd;
		}

		for (int i = arr.length - 2; i >= 0; i--) {
			postProd *= arr[i + 1];
			postMul[i] = postProd;
		}

		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = preMul[i] * postMul[i];
		}

		System.out.println(Arrays.toString(preMul));
		System.out.println(Arrays.toString(postMul));
		System.out.println("Result:: " + Arrays.toString(result));
	}

}
