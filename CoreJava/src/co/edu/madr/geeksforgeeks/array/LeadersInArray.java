package co.edu.madr.geeksforgeeks.array;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * Given an array of positive integers. Your task is to find the leaders in the
 * array. Note: An element of array is leader if it is greater than or equal to
 * all the elements to its right side. Also, the rightmost element is always a
 * leader.
 * 
 * @author madr
 * @since 12 Dec 2018
 *
 */
public class LeadersInArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 16, 17, 4, 3, 5, 2 };
		findLeadersInArrayN(arr);
		findLeadersInArrayN(new int[] { 1, 2, 3, 4, 0 });
		findLeadersInArrayN(new int[] { 7, 4, 5, 7, 3 });
	}

	/**
	 * Runtime:: O(N)
	 * 
	 * @param arr
	 */
	static void findLeadersInArrayN(int[] arr) {
		List<Integer> leaders = new ArrayList<>();
		int currentLeader = arr[arr.length - 1];
		leaders.add(currentLeader);

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] >= currentLeader) {
				currentLeader = arr[i];
				leaders.add(currentLeader);
			}
		}
		System.out.println(leaders);

	}

	/**
	 * Runtime: O(N*N)
	 * 
	 * @param arr
	 */
	static void findLeadersInArrayNN(int[] arr) {
		List<Integer> leaders = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int currElem = arr[i];
			boolean isLeader = true;
			for (int j = i + 1; j < arr.length && isLeader; j++) {
				if (currElem < arr[j]) {
					isLeader = false;
				}
			}
			if (isLeader) {
				leaders.add(currElem);
			}
		}
		System.out.println(leaders);

	}
}
