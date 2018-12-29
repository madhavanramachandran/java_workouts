package co.edu.madr.geeksforgeeks.array;

/**
 * 
 * Given an unsorted array A of size N of non-negative integers, find a
 * continuous sub-array which adds to a given number.
 * 
 * 
 * The first line of input contains an integer T denoting the number of test
 * cases. Then T test cases follow. Each test case consists of two lines. The
 * first line of each test case is N and S, where N is the size of array and S
 * is the sum. The second line of each test case contains N space separated
 * integers denoting the array elements.
 * 
 * Output: For each testcase, in a new line, print the starting and ending
 * positions(1 indexing) of first such occuring subarray from the left if sum
 * equals to subarray, else print -1.
 * 
 * @author madr
 * @since 11 Dec 2018
 *
 */
public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5 };
		int sum = 5;
		printSubArray(arr, sum);
		printSubArray(new int[] { 1 }, 1);
		printSubArray(new int[] { 1, 3, 4, 2, 6 }, 6);
		printSubArray(new int[] { 1, 2, 3, 7, 5 }, 12);
		printSubArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 500);
		printSubArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 25);

	}

	private static void printSubArray(int[] arr, int sum) {
		int startIdx = 0;
		int endIdx = 0;
		int current_sum = arr[0];

		boolean isFound = false;
		boolean endOfLoop = false;/*
		for (int i = 0; i < arr.length; i++) {*/
			while (!(isFound || endOfLoop)) {
				if (current_sum == sum) {
					isFound = true;
					System.out.println("Start Index ::" + startIdx + " End Index:: " + endIdx);
				} else if (current_sum < sum) {
					if (endIdx >= arr.length - 1) {
						endOfLoop = true;
					} else {
						endIdx++;
						current_sum += arr[endIdx];
					}
				} else if (current_sum > sum) {
					current_sum -= arr[startIdx++];
				}
			}
		//}

		if (!isFound) {
			System.out.println("--- No Subset Found ---");
		}
	}

}
