package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchnumberfromexcelSheet {

	public static void main(String[] args) throws Throwable {
FileInputStream fes=new FileInputStream("./src/test/resources/Book1.xlsx");
Workbook workbook=WorkbookFactory.create(fes);
Sheet sheet=workbook.getSheet("Sheet1");

Row row=sheet.getRow(0);
Cell cell=row.getCell(0);

DataFormatter format=new DataFormatter();
String data=format.formatCellValue(cell);
System.out.println(data);
}

}
