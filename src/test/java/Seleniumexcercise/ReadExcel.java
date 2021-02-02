package Seleniumexcercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 FileInputStream fis= new FileInputStream("E:\\Anand\\Automation\\AutomationData.xlsx");
		 
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
	//	 workbook.getSheetAt(0);
		 
		 XSSFSheet sheet = workbook.getSheet("Selenium");
		 
		XSSFRow row = sheet.getRow(5);
		
		XSSFCell cell = row.getCell(1);
	//	int i = 10;
		System.out.println("Total no of rows/records "+ sheet.getPhysicalNumberOfRows());//value ?

		System.out.println(cell); //5,0 -> 6th row & the 1st col
		
		short columns = sheet.getRow(6).getLastCellNum();
		
		System.out.println("total no of columns : "+ columns);
		
		int rows= sheet.getPhysicalNumberOfRows();
		String celldata=null;
		for(int i=0;i<rows;i++)  //Rows
		{
			for(int j=0;j<columns;j++) { //Columns
				
				/*celldata = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(celldata+"\t");*/
				
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		
	}

}
