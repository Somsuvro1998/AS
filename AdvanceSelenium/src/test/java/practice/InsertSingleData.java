package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertSingleData {

	public static void main(String[] args) throws Throwable {
//Step1:- Set the path
		FileInputStream fes=new FileInputStream("C:\\Users\\SOMSUVRO\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\Book.xlsx");
		
		//Step2:-
		Workbook book=WorkbookFactory.create(fes);
		
		//Step3:- get control to the sheet
		Sheet sheet=book.getSheet("Sheet1");
		
		Row row=sheet.createRow(0);
		
		Cell cell=row.createCell(0);
		
		cell.setCellValue("QSpiders");
		
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\SOMSUVRO\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\Book.xlsx");
		book.write(fos);
		book.close();
	}

}
