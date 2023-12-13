package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByMultipleAttribute {


	public static void main(String[] args) {
		
		//launching browser
				WebDriverManager.edgedriver().setup();
				WebDriver driver=new EdgeDriver();

				     //launching application
				driver.get("https://demo.actitime.com/login.do");
				driver.manage().window().maximize();
				
//syntax:- And //htmltag[@AttributeName='AttributeValue' and @AtributeNAme='AttributeVAlue']
driver.findElement(By.xpath("//input[@name='username' and @id='username']")).sendKeys("admin");

//syntax:- or //htmltag[@AttributeName='AttributeValue' or @AtributeNAme='AttributeVAlue']
driver.findElement(By.xpath("//input[@name='pwd' or @placeholder='Passwor']")).sendKeys("manager");
	
//syntax:- or //htmltag[text()='AttributeValue' or @AtributeNAme='AttributeVAlue']
	driver.findElement(By.xpath("//div[text()='Login ' or @id='loginButton']")).click();
	}

	
	
	
}
