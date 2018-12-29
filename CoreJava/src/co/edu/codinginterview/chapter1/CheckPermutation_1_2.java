package co.edu.codinginterview.chapter1;

import java.util.HashSet;
import java.util.Set;

public class CheckPermutation_1_2 {

	public static void main(String[] args) {
		String mainStr = "time delay";
		String inputStr = "dime0";

		System.out.println(isInputPermuted(mainStr, inputStr));

	}

	/**
	 * TimeComplexity: O(N+M)
	 * 
	 * @param mainStr
	 * @param inputStr
	 * @return
	 */
	private static boolean isInputPermuted(String mainStr, String inputStr) {
		if (mainStr.length() > inputStr.length()) {
			char[] mainStrCharArr = mainStr.toCharArray();
			char[] inputStrCharArr = inputStr.toCharArray();
			
			Set<Character> mainStrSet = new HashSet<>();
			for (int i = 0; i < mainStrCharArr.length; i++) {
				mainStrSet.add(mainStrCharArr[i]);
			}
			
			for (int j = 0; j < inputStr.length(); j++) {
				if (!mainStrSet.contains(inputStrCharArr[j])) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
