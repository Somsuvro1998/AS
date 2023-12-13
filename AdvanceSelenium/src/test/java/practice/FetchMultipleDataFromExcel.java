package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws Throwable {
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
FileInputStream fes=new FileInputStream("./src/test/resources/MyExcelData.xlsx");
Workbook book=WorkbookFactory.create(fes);
Sheet sheet=book.getSheet("Sheet1");
int row=sheet.getLastRowNum(); //295
for(int i=0;i<row; i++)
{
	Row r=sheet.getRow(i);
	short cel=r.getLastCellNum();

	for(int j=0; j<cel; j++)
	{
		Cell cell=r.getCell(j);
		DataFormatter format=new DataFormatter();
		String data=format.formatCellValue(cell);
		System.out.println(data);
	}

}





	}

}
