package co.edu.madr.datastructure.stack.basicstack;

public class TestBasicStack {

	public static void main(String[] args) {
		int size = 3;
		BasicStack stk = new BasicStack(size);
		
		try {
			stk.push(4); stk.push(4); stk.push(4);
			stk.push(5); stk.pop(); stk.push(4);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println(stk);
	}

}
