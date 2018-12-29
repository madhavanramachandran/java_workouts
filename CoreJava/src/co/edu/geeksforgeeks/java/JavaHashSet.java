package co.edu.geeksforgeeks.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/java-hashset/problem
 * 
 * @author madr
 *
 */
public class JavaHashSet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		JavaHashSet.printSetCount(pair_left, pair_right);
	}

	private static void printSetCount(String[] pair_left, String[] pair_right) {
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < pair_left.length; i++) {
			set.add(pair_left[i] + "_" + pair_right[i]);
			System.out.println(set.size());
		}
	}

}
