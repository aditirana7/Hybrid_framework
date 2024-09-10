package uti;


	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.FileInputStream;
import java.io.IOException;

	public class excel2 {
	    private Workbook workbook;
	    	 public excel2() throws IOException
	    	 {
	        FileInputStream fis = new FileInputStream("./TestData/pnr.xlsx");
	        workbook = new XSSFWorkbook(fis);
	    }

	    public String getStringData(String sheetName, int rowNum, int colNum) {
	        Sheet sheet = workbook.getSheet(sheetName);
	        Row row = sheet.getRow(rowNum);
	        Cell cell = row.getCell(colNum);

	        if (cell == null) {
	            return "";
	        }

	        switch (cell.getCellType()) {
	            case STRING:
	                return cell.getStringCellValue();
	            case NUMERIC:
	                return String.valueOf(cell.getNumericCellValue());
	            case BOOLEAN:
	                return String.valueOf(cell.getBooleanCellValue());
	            case FORMULA:
	                return cell.getCellFormula();
	            default:
	                return "";
	        }
	    }

}
