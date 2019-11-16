package co.edu.hkr.datastructures.arrays;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] inputArr = new int[N];
		for (int i = 0; i < N; i++) {
			inputArr[i] = scan.nextInt();
		}

		int[] result = reverseArray(inputArr, N);
		print1DArray(result);
		scan.close();
	}

	private static void print1DArray(int[] result) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < result.length; i++) {
			writer.write(result[i] + " ");
		}
		writer.flush();
	}

	private static int[] reverseArray(int[] inputArr, int N) {
		for (int i = 0, j = N - 1; i < N / 2; i++, j--) {
			int temp = inputArr[i];
			inputArr[i] = inputArr[j];
			inputArr[j] = temp;
		}
		return inputArr;
	}

}
