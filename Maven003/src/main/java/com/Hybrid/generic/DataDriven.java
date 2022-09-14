package com.Hybrid.generic;

import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Properties;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataDriven {
	
	public String keyDriven(String key) throws Throwable
	{
	FileInputStream fis = new FileInputStream("C:\\Users\\QSPJSP\\eclipse-workspace\\Maven003\\src\\test\\resources\\ExternalData\\actilogin.PROPERTIES");
	Properties pobj = new Properties();
	pobj.load(fis);
	//String data = pobj.getProperty(key);
	//return data;
	return pobj.getProperty(key);
	}
	public String excelFetching(String sheet,int row,int cell) throws Throwable, IOException
	{
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("C:\\Users\\QSPJSP\\eclipse-workspace\\Maven003\\src\\test\\resources\\ExcelData\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheet);
	return	df.formatCellValue(sh.getRow(row).getCell(cell));
	
		
	}
	
}
