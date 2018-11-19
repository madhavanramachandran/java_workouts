package co.edu.madr.edx.ALGS201x.sorting.selection;

public class SelectionSort {
	
	public static int[] selectionSort(int[] array) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			for (int j = 0; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					array[j] = array[i];
					array[i] = min;
				}
			}
		}
		System.out.println("\t Time Taken:: " + (System.currentTimeMillis() - startTime));
		return array;
	}

}
