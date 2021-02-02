package Seleniumexcercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
	static XSSFSheet sheet; 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 FileInputStream fis= new FileInputStream("E:\\Anand\\Automation\\AutomationData.xlsx");
		 
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 
		 sheet = workbook.getSheet("Selenium");
		 
		int row = sheet.getPhysicalNumberOfRows();
		
	//	XSSFCell cell = row.getCell(1);
	//	int i = 10;
		System.out.println("Total no of rows/records "+ sheet.getPhysicalNumberOfRows());//value ?

//		System.out.println(cell); //5,0 -> 6th row & the 1st col
		
		short columns = sheet.getRow(6).getLastCellNum();
		
		System.out.println("total no of columns : "+ columns);
		int col = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<row;i++) //Rows
		{
			for(int j=0;j<col;j++) //column
			{
				System.out.print(getCellData(i,j)+"  ");
			}
			System.out.println();
		}
		
	}
	
	public static String getCellData(int row, int col)
	{
		String celldata=null;		
		try {
			
			celldata = sheet.getRow(row).getCell(col).getStringCellValue();
		
			//System.out.println("Cell data : "+ celldata);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return celldata;
	}

}
