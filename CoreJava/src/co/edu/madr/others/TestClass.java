package co.edu.madr.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestClass {
	public static void main(String[] args) {
		testMap();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] countArr = new int[10];
		try {
			String input = br.readLine();
			char [] inputArr = input.toCharArray();
			for (int i = 0; i < inputArr.length; i++) {
				int m = inputArr[i] - '0';
				countArr[m] = ++countArr[m];
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < countArr.length; i++) {
			System.out.println(i + " " + countArr[i]);
		}
		
	}
	
	static void testMap() {
		Map<Integer, Emp> map = new HashMap<>();
		Emp emp1 = new Emp(100);
		map.put(100, emp1);
		System.out.println(map.get(100).getId());
		emp1.setId(101);
		System.out.println(map.get(100).getId());
		
		
	}

}

class Emp {
	Emp(int id) {
		this.id = id;
	}
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}