package Week6day1;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.dev.XSSFSave;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class LearnExcel {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Open Work Book from path
		XSSFWorkbook wBook =  new XSSFWorkbook ("./data/book1.xlsx");
		//Go to particuticular sheet
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		// Go to row count
		int lastRowNum = sheet.getLastRowNum();
		// get cell count		
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastRowNum);
		System.out.println(lastCellNum);
		//Selecting the first row.
		for (int i = 1; i <= lastRowNum; i++) 
		{
			//selecting the first coloumn
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) 
			{
				
				XSSFCell cell = row.getCell(j);
				//Read values in coloumn
				// which return the type of the cell when we dont know the return type
				// cell.getCellType();
//				String stringCellValue = cell.getStringCellValue();				
//				CellType cellTypeEnum = cell.getCellTypeEnum(); gives you the type of input int/string
//				int cellType = cell.getCellType();
				String stringCellValue = cell.getStringCellValue();
		
				System.out.println(stringCellValue);
			}
		}
		//Close Workbook
		wBook.close();
	}

}
