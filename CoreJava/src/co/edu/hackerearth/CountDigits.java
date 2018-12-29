package co.edu.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * For each digit starting from 0 to 9, print the count of their occurrences in
 * the string S.
 * 
 * @author madr
 *
 */
class CountDigits {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] countArr = new int[10];
		String input = br.readLine();
		char[] inputArr = input.toCharArray();
		for (int i = 0; i < inputArr.length; i++) {
			int m = inputArr[i] - '0';
			countArr[m] = ++countArr[m];
		}
		for (int i = 0; i < countArr.length; i++) {
			System.out.println(i + " " + countArr[i]);
		}

	}
}