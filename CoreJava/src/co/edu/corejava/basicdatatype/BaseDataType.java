package co.edu.corejava.basicdatatype;

public class BaseDataType {
	
	private byte tByte;
	
	private short tShort;
	
	private int tInt;
	
	private long tLong;
	
	private double tDouble;
	
	private float tFloat;
	
	private boolean tBoolean;
	
	private char tChar;

	public byte gettByte() {
		return tByte;
	}

	public void settByte(byte tByte) {
		this.tByte = tByte;
	}

	public short gettShort() {
		return tShort;
	}

	public void settShort(short tShort) {
		this.tShort = tShort;
	}

	public int gettInt() {
		return tInt;
	}

	public void settInt(int tInt) {
		this.tInt = tInt;
	}

	public long gettLong() {
		return tLong;
	}

	public void settLong(long tLong) {
		this.tLong = tLong;
	}

	public double gettDouble() {
		return tDouble;
	}

	public void settDouble(double tDouble) {
		this.tDouble = tDouble;
	}

	public float gettFloat() {
		return tFloat;
	}

	public void settFloat(float tFloat) {
		this.tFloat = tFloat;
	}

	public boolean istBoolean() {
		return tBoolean;
	}

	public void settBoolean(boolean tBoolean) {
		this.tBoolean = tBoolean;
	}

	public char gettChar() {
		return tChar;
	}

	public void settChar(char tChar) {
		this.tChar = tChar;
	}

	@Override
	public String toString() {
		return "BaseDataType [tByte=" + tByte + ", tShort=" + tShort + ", tInt=" + tInt + ", tLong=" + tLong
				+ ", tDouble=" + tDouble + ", tFloat=" + tFloat + ", tBoolean=" + tBoolean + ", tChar=" + tChar + "]";
	}
	

}
