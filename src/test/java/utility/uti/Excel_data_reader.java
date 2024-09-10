package uti;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data_reader {
	XSSFWorkbook wb;

	public Excel_data_reader() {
		File src = new File("./TestData/pnr.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to load Xls file " + e.getMessage());
		}
	}

	public String getStringData(String string, int row, int column) {
		return wb.getSheet(string).getRow(row).getCell(column).getStringCellValue();
	}
}
