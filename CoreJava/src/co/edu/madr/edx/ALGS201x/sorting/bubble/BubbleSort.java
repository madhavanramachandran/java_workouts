package co.edu.madr.edx.ALGS201x.sorting.bubble;

/**
 * 
 * @author madr
 *
 */
public class BubbleSort {
	
	/**
	 * This will run with the complexity of n^2
	 * @param array Input array to be sorted
	 * @return Array after sorting.
	 */
	public static int[] bubbleSort(int[] array) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println("\t Time Taken:: " + (System.currentTimeMillis() - startTime));
		return array;
	}
}
