package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchSingleDataFromExcel2 {
	public static void main(String[] args) throws Throwable{
		//step1:- Set the path
				FileInputStream fes=new FileInputStream("./src/test/resources/Ex.xlsx");
				 //FileInputStream fes=new FileInputStream("C:\Users\SOMSUVRO\eclipse-workspace\AdvanceSelenium\src\test\resources\MyExcelData.xlsx");
			//step2:- Open Workbook in read mode
				
			Workbook book=WorkbookFactory.create(fes);
			
			//step3:= get control to the sheet
			
			Sheet sheet=book.getSheet("Sheet1");
			//step4:- get control on row
			Row row=sheet.getRow(1);
			
				Cell cel=row.getCell(0);
				
				String ExcelData=cel.getStringCellValue();
				System.out.println(ExcelData);

}
}