package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws Throwable   {
		WebDriverManager.edgedriver().setup();
		//opens the empty edge browser
		WebDriver driver=new EdgeDriver();
		//pathsetup
		FileInputStream fis=new FileInputStream("C:\\Users\\SOMSUVRO\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\Property.properties");
		
		//loading the file to Properties class
		Properties pro=new Properties();
		pro.load(fis);
		
		//fetching key from properties class
		String URL=pro.getProperty("url");
		 driver.get(URL);
		 
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
		 
		

	}

}
