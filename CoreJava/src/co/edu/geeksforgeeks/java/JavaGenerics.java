package co.edu.geeksforgeeks.java;

/**
 * https://www.hackerrank.com/challenges/java-generics/problem
 * 
 * @author madr
 *
 */
public class JavaGenerics {

	public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
	}

}

class Printer {

	public void printArray(Object[] arr) {
		for(Object o : arr) {
			System.out.println(o.toString());
		}
		
	}
	
}
