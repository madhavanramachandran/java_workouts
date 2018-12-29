package co.edu.corejava.basicdatatype;

public class BasicDataTypeTest {

	public static void main(String[] args) {
		
		BaseDataType defaultType = new BaseDataType();
		System.out.println("Default Values :: \n \t" + defaultType);

		BaseDataType minType = new BaseDataType();
		minType.settByte(Byte.MIN_VALUE);
		minType.settShort(Short.MIN_VALUE);minType.settInt(Integer.MIN_VALUE); 
		minType.settLong(Long.MIN_VALUE); minType.settFloat(Float.MIN_VALUE);  
		minType.settDouble(Double.MIN_VALUE); minType.settBoolean(false);
		System.out.println("Minimum Values :: \n \t" + minType);
		
		BaseDataType maxType = new BaseDataType();
		maxType.settByte(Byte.MAX_VALUE);
		maxType.settShort(Short.MAX_VALUE);maxType.settInt(Integer.MAX_VALUE); 
		maxType.settLong(Long.MAX_VALUE); maxType.settFloat(Float.MAX_VALUE);  
		maxType.settDouble(Double.MAX_VALUE); maxType.settBoolean(false);
		System.out.println("Maximum Values :: \n \t" + maxType);
		
		
		//char data type is a single 16-bit Unicode character
		System.out.println("Char Default Value:: " + maxType.gettChar());
		maxType.settChar('\u0001');
		System.out.println("Char Value:: " + maxType.gettChar());

	}

}
