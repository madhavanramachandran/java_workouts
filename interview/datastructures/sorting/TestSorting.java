package co.interview.datastructures.sorting;

import java.util.Arrays;

import co.interview.datastructures.sorting.bubble.BubbleSort;
import co.interview.datastructures.sorting.selection.SelectionSort;

public class TestSorting {

	public static void main(String[] args) {
		int[] arr1 = { 45, 12, 13, 90, 190, 109, 58, 69, 69, 96, 85, 74, 54, 36, 25, 14 };
		System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr1)));
		System.out.println(Arrays.toString(SelectionSort.selectionSort(arr1)));
	}

}
