package co.edu.madr.geeksforgeeks.java.strings;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * https://www.hackerrank.com/challenges/java-string-compare/problem
 * 
 * @author madr
 *
 */
public class JavaStringCompare {

	public static String getSmallestAndLargest(String s, int k) {
		SortedSet<String> sets = new TreeSet<String>();
		for (int i = 0; i <= s.length() - k; i++) {
			sets.add(s.substring(i, i + k));
		}
		System.out.println(sets);
		return sets.first() + "\n" + sets.last();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
