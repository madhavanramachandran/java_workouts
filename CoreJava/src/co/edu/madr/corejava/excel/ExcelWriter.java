package co.edu.madr.corejava.excel;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	private ExcelWriter() {
		
	}
	
	private static ExcelWriter excelWriter;
	
	public static ExcelWriter getInstanse() {
		synchronized (ExcelWriter.class) {
			if(excelWriter == null) {
				excelWriter = new ExcelWriter();
			}
			return excelWriter;
		}
	}
	
	public void buildExcel(XSSFWorkbook workBook, List<AuctionListingDetail> listingList, int sheetIndex, String sheetName) throws Exception {
		XSSFSheet sheet = null;
		int rowNum = 0;
		
		//If pass a sheet number, it will get the sheet at the particular index
		if(sheetIndex == -1) {
			sheet = workBook.createSheet(sheetName);
		} else {
			sheet = workBook.getSheetAt(sheetIndex);
			rowNum = sheet.getLastRowNum() + 1;
		}
		
		XSSFRow row = null;
		
		//Iterates over the listing and populate the values
		for(AuctionListingDetail listing : listingList) {
			row = sheet.createRow(rowNum++);
			int cellNum = 0;
			insertToCell(row, cellNum++, listing.getTitle());
			insertToCell(row, cellNum++, listing.getMpn());
			insertToCell(row, cellNum++, listing.getSerialNo());
			insertToCell(row, cellNum++, listing.getPartType());
			insertToCell(row, cellNum++, listing.getPartTypeId());
			insertToCell(row, cellNum++, listing.getAtaChapter());
			insertToCell(row, cellNum++, listing.getAtaChapterId());
			insertToCell(row, cellNum++, listing.getCertificationValue());
			insertToCell(row, cellNum++, listing.getConditionId());
			insertToCell(row, cellNum++, listing.getCertificationValue());
			insertToCell(row, cellNum++, listing.getCertificationId());
			insertToCell(row, cellNum++, listing.getCategory());
			insertToCell(row, cellNum++, listing.getCategoryId());
			insertToCell(row, cellNum++, listing.getManufacturer());
		}
		
		sheet.autoSizeColumn(1);
	}
	
	private void insertToCell(XSSFRow row, int cellNum, Object value) {
		XSSFCell cell = row.createCell(cellNum++);
		if(value instanceof Integer) {
			cell.setCellValue((Integer)value);
		} else {
			cell.setCellValue((String)value);
		}
			
	}
	
}
