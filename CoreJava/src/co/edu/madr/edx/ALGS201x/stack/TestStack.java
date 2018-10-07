package co.edu.madr.edx.ALGS201x.stack;

public class TestStack {

	public static void main(String[] args) {
		TestStack test = new TestStack();
		test.testStackWithArray();
	}

	private void testStackWithArray() {
		StackWithArray stack = new StackWithArray(5);
		stack.push(5);
		stack.push(2342);
		stack.push(-5);
		System.out.println(stack); // prints 5, 2342, -5
		System.out.println(stack.pop()); // removes -5 and return its
		System.out.println(stack.peek()); // returns 2342
	}

}
