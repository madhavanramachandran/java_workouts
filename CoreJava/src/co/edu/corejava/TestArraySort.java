package co.edu.corejava;

public class TestArraySort {

	public static void main(String[] args) {
		
		int[] initArr = {8, 1, 7, 2, 14, 25, 9};
		int arrSize = initArr.length;
		int[] newArr = new int[arrSize];
		
		int greater = 0;
		
		for(int i=0; i < arrSize; i++) {
			greater = 0;
			for(int j=0; j<arrSize; j++) {
				if (initArr[i] < initArr[j]) {
					greater++;
				}
			}
			//System.out.println(greater);
			newArr[greater] = initArr[i];
		}
		
		for(int i = 0 ; i< arrSize; i++) {
			System.out.println(newArr[i]);
		}
	}

}
