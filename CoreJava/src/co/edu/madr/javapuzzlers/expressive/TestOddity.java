package co.edu.madr.javapuzzlers.expressive;

public class TestOddity {

	public static void main(String[] args) {
		TestOddity obj = new TestOddity();
		System.out.println("############################");
		
		/** assert(true) */
		System.out.println(obj.isOdd_traditional(5));
		/** assert(true) but returns false */
		System.out.println(obj.isOdd_traditional(-5));
		/** assert(false) (2147483648) returns false because its negative */
		System.out.println(obj.isOdd_traditional(Integer.MIN_VALUE));
		/** assert(false) (2147483647) */
		System.out.println(obj.isOdd_traditional(Integer.MAX_VALUE));
		System.out.println("############################");
		
		/** assert(true) */
		System.out.println(obj.isOdd_correctWay(5));
		/** assert(true) CORRECTED */
		System.out.println(obj.isOdd_correctWay(-5));
		/** assert(false) (2147483648) returns false beacuse its negative */
		System.out.println(obj.isOdd_correctWay(Integer.MIN_VALUE));
		/** assert(false) (2147483647) */
		System.out.println(obj.isOdd_correctWay(Integer.MAX_VALUE));
		System.out.println("############################");
		
		
		/** assert(true) */
		System.out.println(obj.isOdd_bitwise(5));
		/** assert(true) CORRECTED */
		System.out.println(obj.isOdd_bitwise(-5));
		/** assert(false) (2147483648) returns false beacuse its negative */
		System.out.println(obj.isOdd_bitwise(Integer.MIN_VALUE));
		/** assert(false) (2147483647) */
		System.out.println(obj.isOdd_bitwise(Integer.MAX_VALUE));
	}

	/**
	 * Problem is for negative numbers;
	 */
	private boolean isOdd_traditional(int i) {
		return i % 2 == 1;
	}

	private boolean isOdd_correctWay(int i) {
		return i % 2 != 0;
	}
	
	private boolean isOdd_bitwise(int i) {
		return (i & 1) != 0;
	}

}
