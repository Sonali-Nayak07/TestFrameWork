package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	public ExcelDataProvider() 
	{
		File src=new File("./TestData/Data.xlsx");
		try
		{
		FileInputStream fis= new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		}catch (Exception e){
		System.out.println("Unable to read from excel"+e.getMessage());
		
		}
	}

	public String getStringData(String sheetName,int row,int coloumn)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(coloumn).getStringCellValue();
	}
	public double NumericData(String sheetName,int row,int coloumn)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(coloumn).getNumericCellValue();
	}
	
}
