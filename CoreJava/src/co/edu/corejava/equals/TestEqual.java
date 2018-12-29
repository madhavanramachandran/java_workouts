package co.edu.corejava.equals;

public class TestEqual {

	public static void main(String[] args) {
		
		EqEmp e1 = new EqEmp("madhavan", 2000);
		
		EqEmp e2 = new EqEmp("madhavan", 2010);

		System.out.println(e1.hashCode() + " -- " + System.identityHashCode(e1));
		System.out.println(e2.hashCode() + " -- " + System.identityHashCode(e2));
		
		System.out.println(e1.equals(e2));
		
	}

}
