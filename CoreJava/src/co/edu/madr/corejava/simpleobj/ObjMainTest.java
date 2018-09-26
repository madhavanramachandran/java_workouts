package co.edu.madr.corejava.simpleobj;

public class ObjMainTest {

	public static void main(String[] args) {
		
		ObjEmployee emp1 = new ObjEmployee("Construtor Method", 1254l, 1001l);
		
		ObjEmployee emp2 = new ObjEmployee();
		emp2.seteId(1002l);
		emp2.seteName("Seperate setter");
		emp2.setePhoneNo(57565l);
		
		System.out.println("Setting values by construtor:: " + emp1);
		
		System.out.println("Setting values by seperate method:: " + emp2);

	}
 
}
