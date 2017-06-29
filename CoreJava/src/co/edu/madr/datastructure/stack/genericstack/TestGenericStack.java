package co.edu.madr.datastructure.stack.genericstack;

public class TestGenericStack {

	public static void main(String[] args) {
		GenericStack<Integer> stk = new GenericStack<Integer>(1);
		stk.push(234);
		System.out.println(stk);
		stk.push(4445);
		System.out.println(stk);
	}
}
