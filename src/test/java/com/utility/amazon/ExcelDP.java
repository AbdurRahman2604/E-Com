package com.utility.amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDP {
	
	
	static List<String>userName=new ArrayList<String>();
	static List<String>password=new ArrayList<String>();
	
	
@DataProvider(name="ExcelData")	
public Object[][] readExcel() throws IOException {
	FileInputStream excel=new FileInputStream("D:\\Eclipse_GroTechMInd\\E-Com\\src\\test\\resources\\E-Com.xlsx");
	Workbook wb=new XSSFWorkbook(excel);
	Sheet sheet = wb.getSheetAt(0);
	
	Iterator<Row> rowIterator = sheet.iterator();

	while(rowIterator.hasNext()) {
		Row row = rowIterator.next();
		Iterator<Cell> columnIterator = row.iterator();
		int i=2;
		while(columnIterator.hasNext()) {
			if(i%2==0) {
				userName.add(columnIterator.next().getStringCellValue());
			}
			else {
				password.add(columnIterator.next().getStringCellValue());
			}
			i++;
		}
	}



}


	
//	public static void main(String[] args) throws IOException {
//		ExcelDP e=new ExcelDP();
//		e.readExcel();
//	}
	
	

}
