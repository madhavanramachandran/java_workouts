package co.edu.madr.datastructure.stack.dynamicstack;

public class TestDynamicStack {

	public static void main(String[] args) {
		DynamicStack stk = new DynamicStack(2);
		stk.push(1); stk.push(2); stk.push(3);
		
		System.out.println(stk);

	}

}
