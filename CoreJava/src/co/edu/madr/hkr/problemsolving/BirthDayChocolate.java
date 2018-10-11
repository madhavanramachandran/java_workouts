package co.edu.madr.hkr.problemsolving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class BirthDayChocolate {

	static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		int sum = 0;
		for (int j = 0; j < m; j++) {
			sum += s.get(j);
			count += (sum == d && j == m - 1) ? 1 : 0;
		}
		
		/*for (int i = 1; i < s.size() - m + 1; i++) {
			sum += -s.get(i - 1) + s.get(i + m - 1);
			count += (sum == d) ? 1 : 0;
		}
		*/

		for (int i = m; i < s.size(); i++) {
			sum += -s.get(i-m) + s.get(i);
			count += (sum == d) ? 1 : 0;
		}
		System.out.println("Count:: " + count);
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new StringWriter());

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> s = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int sItem = Integer.parseInt(sItems[i]);
			s.add(sItem);
		}

		String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int d = Integer.parseInt(dm[0]);

		int m = Integer.parseInt(dm[1]);

		int result = birthday(s, d, m);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
