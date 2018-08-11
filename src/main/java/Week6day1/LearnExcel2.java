package Week6day1;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.dev.XSSFSave;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class LearnExcel2 {
	@Test
	public  Object[][] getData(String filename) throws InterruptedException, IOException 
	{
		{
		// TODO Auto-generated method stub
		// Open Work Book from path
		XSSFWorkbook wBook =  new XSSFWorkbook ("./data/"+filename+".xlsx");
		//Go to particuticular sheet
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		// Go to row count
		int lastRowNum = sheet.getLastRowNum();
		// get cell count		
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastRowNum);
		System.out.println(lastCellNum);
		//
		Object[][] data = new Object[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) 
		{
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) 
			{
				try {
					XSSFCell cell = row.getCell(j);
					data[i-1][j]  = cell.getStringCellValue();
				} catch (Exception e) {
					
					data[i-1][j]="";
				}

				//				System.out.println(stringCellValue);
			}

		}

		wBook.close();
		return data;
	}
	}
	}
