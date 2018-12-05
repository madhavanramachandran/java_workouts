package co.edu.madr.geeksforgeeks.array;

/**
 * 
 * @author madr
 * @since 11 Dec 2018
 * 
 *         Given an array C of size N-1 and given that there are numbers from 1
 *         to N with one element missing, the missing number is to be found.
 * 
 *         Input: The first line of input contains an integer T denoting the
 *         number of test cases. For each test case first line contains N, size
 *         of array. The ssubsequent line contains N-1 array elements.
 * 
 *         Output: Print the missing number in array.
 * 
 *         Constraints: 1 ≤ T ≤ 200 1 ≤ N ≤ 107 1 ≤ C[i] ≤ 107
 * 
 *         Example: Input: 2 \n 5 \n 1 2 3 5 \n10 \n1 2 3 4 5 6 7 8 10
 *         
 *         
 *
 */
public class MissingNumberInArray {

	public static void main(String[] args) {
		printMissingNumber(new int[] { 1, 2, 4, 5 }, 5);
		printMissingNumber(new int[] { 2 }, 2);
		printMissingNumber(new int[] { 1 }, 2);
	}

	private static void printMissingNumber(int[] arr, int len) {
		int toSum = len * (len + 1) / 2;
		int actualSum = 0;
		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];
		}
		System.out.println("Missing NUmber:: " + (toSum - actualSum));
	}
}
