/**
 * 
 */
package co.edu.madr.hkr.problemsolving;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 * 
 * @author madr
 *
 *         Input Format
 * 
 *         The first line contains an integer , the number of games. The second
 *         line contains space-separated integers describing the respective
 *         values of scores.
 * 
 */
public class BreakingTheRecords {

	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {
		int min = 0;
		int max = Integer.MIN_VALUE;
		int breachMin = 0;
		int breachMax = 0;
		for(int i = 0; i< scores.length -2; i++) {
			int a = scores[i];
			int b = scores[i+1];
			if(a < b && b < min) {
				min = b;
				breachMin++;
			} else if(a > b && a > max) {
				max = a;
				breachMax++;
			}
		}
		System.out.println(breachMin  + " "+ breachMax);
		return new int[] {breachMin, breachMax};
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new StringWriter());

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] scores = new int[n];

		String[] scoresItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int[] result = breakingRecords(scores);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

}

class Score {
	private int game;
	
	private int score;
	
	private int min;
	
	private int max;
	
	private int minMax;

	public int getGame() {
		return game;
	}

	public int getScore() {
		return score;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public int getMinMax() {
		return minMax;
	}

	public void setGame(int game) {
		this.game = game;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void setMinMax(int minMax) {
		this.minMax = minMax;
	}
}
