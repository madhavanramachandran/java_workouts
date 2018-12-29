package co.edu.corejava.base64;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base64Test {

	public static void main(String[] args) throws IOException {
		
		EncodeDecoder encode = new EncodeDecoder();
		
		//using base64 encoder to get the encoded string
		String encodedString = encode.encodeToBase64("D:\\input.xlsx"); 
		System.out.println(encodedString);

		//decoding the string back to byte array byte[]
		byte[] byteArray = Base64.getDecoder().decode(encodedString);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
		
		//Workbook object can be created from the inputstream by passing the decode byte array
		XSSFWorkbook book = new XSSFWorkbook(bis);
		System.out.println(book);
		System.out.println(book.getSheetAt(0).getSheetName());
	}

}
