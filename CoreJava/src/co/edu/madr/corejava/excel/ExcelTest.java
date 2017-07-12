package co.edu.madr.corejava.excel;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) {
		
		//you can use this class to get the output stream of the excel object
		ExcelWriter writer = ExcelWriter.getInstanse();
		
		XSSFWorkbook workBook = new XSSFWorkbook();
		
		//just getting the list of listing details
		//I am using a dummy populated object assuming we write in Auction_Template 
		List<AuctionListingDetail> listingList = new ArrayList<AuctionListingDetail>();
		listingList.add(populateValues());
		listingList.add(populateValues());
		
		try {
			FileOutputStream output = new FileOutputStream("D:\\output.xlsx");
			writer.buildExcel(workBook, listingList, -1, "success");
			workBook.write(output);
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static AuctionListingDetail populateValues() {
		AuctionListingDetail listing = new AuctionListingDetail();
		listing.setTitle("Test Item 001");
		listing.setMpn("MPN test value");
		listing.setSerialNo("#SDLKJ-2XD-SDFSG");
		listing.setPartType("Engine");
		listing.setPartTypeId(1);
		
		listing.setAtaChapter("ATA test value");
		listing.setAtaChapterId(1);
		listing.setConditionValue("New");
		listing.setConditionId(1);
		
		listing.setCertificationValue("Test Cert value");
		listing.setCertificationId(2);
		listing.setCategory("Aircraft");
		listing.setCategoryId(1);
		listing.setManufacturer("General Motoros");
		
		return listing;
	}

}
