package com.utility.amazon;

import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDP {
		
@DataProvider(name="ExcelData")//indices =1 to run specific pair of data	
public Object[][] readExcel() throws  IOException  {
	FileInputStream excel=new FileInputStream(".\\testData\\E-Com.xlsx");
	
	Workbook w1 = WorkbookFactory.create(excel);
//	// Get the sheet by name
    Sheet sheet = w1.getSheet("amazon");
    Row row = sheet.getRow(0);//header row
  
   // Determine the number of rows (including the header)
    int rowCount = sheet.getPhysicalNumberOfRows(); // 0-based indexing
    System.out.println("Number of rows (including header): " + rowCount);

   // Determine the number of columns (based on the header row)
     // Assuming the first row contains headers
    int columnCount = row.getLastCellNum(); // 1-based indexing
    System.out.println("Number of columns: " + columnCount);
   
    // Create the data array dynamically
    Object[][] data = new Object[rowCount-1][columnCount];
	
	for(int i=1;i<rowCount;i++) {
		for(int j=0;j<columnCount;j++) {
			
		row=sheet.getRow(i);
			Cell cell = row.getCell(j);
			if (cell.getCellType() == CellType.STRING) { // If the cell contains a string
	            data[i - 1][j] = cell.getStringCellValue();
	        } else if (cell.getCellType() == CellType.NUMERIC) { // If the cell contains a number
	            data[i - 1][j] = NumberToTextConverter.toText(cell.getNumericCellValue());
	        }
			
			/*String un=NumberToTextConverter.toText(w1.getSheet("amazon").getRow(i).getCell(0).getNumericCellValue());
			//String un = w1.getSheet("amazon").getRow(i).getCell(0).getStringCellValue();
			String pwd = w1.getSheet("amazon").getRow(i).getCell(1).getStringCellValue();
			data[i][0]=un;
			data[i][1]=pwd;*/
		}
	}
  
    
	return data;
}






















}