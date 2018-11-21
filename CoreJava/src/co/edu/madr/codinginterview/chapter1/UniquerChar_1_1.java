package co.edu.madr.codinginterview.chapter1;

public class UniquerChar_1_1 {

	public static void main(String[] args) {
		String str_1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890A";
		System.out.println(isUniqueChar(str_1));
		System.out.println(isUniqueChar2(str_1));

	}

	/**
	 * Only going to hold ASCII chars. If we are including non ascii we should
	 * increase the size of the array.
	 * 
	 * Runtime: O(N)
	 * 
	 * @param str
	 * @return
	 */
	private static boolean isUniqueChar(String str) {
		boolean[] dataArr = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int temp = str.charAt(i);
			if (dataArr[temp])
				return false;
			dataArr[temp] = true;
		}
		return true;
	}
	
	/**
	 * Runtime:: O(N^2)
	 * 
	 * @param str Input string
	 * @return
	 */
	private static boolean isUniqueChar2(String str) {
		long startTime = System.currentTimeMillis();
		for (int i = 0 ; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					System.out.println("Unique Char 2 runtime::  " + (System.currentTimeMillis() - startTime));
					return false;
				}
			}
		}
		System.out.println("Unique Char 2 runtime::  " + (System.currentTimeMillis() - startTime));
		return true;
	}

}
