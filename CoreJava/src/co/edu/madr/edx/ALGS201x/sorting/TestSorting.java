package co.edu.madr.edx.ALGS201x.sorting;

import java.util.Arrays;

import co.edu.madr.edx.ALGS201x.sorting.bubble.BubbleSort;
import co.edu.madr.edx.ALGS201x.sorting.selection.SelectionSort;

public class TestSorting {

	public static void main(String[] args) {
		int[] arr1 = { 45, 12, 13, 90, 190, 109, 58, 69, 69, 96, 85, 74, 54, 36, 25, 14 };
		System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr1)));
		System.out.println(Arrays.toString(SelectionSort.selectionSort(arr1)));
	}

}
