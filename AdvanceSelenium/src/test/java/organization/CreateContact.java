package organization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		String firstname="Ram";
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		String lastname="Singh";
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
		Thread.sleep(3000);
		String FName=driver.findElement(By.xpath("//span[@id='dtlview_First Name']")).getText();
		String LName=driver.findElement(By.xpath("//span[@id='dtlview_Last Name']")).getText();
		
		
		if(FName.contains(firstname)&&LName.contains(lastname))
		{
			System.out.println("Contact created Successfully");
		}
		else
		{
			System.out.println("Contact not created");
		}
		
   //logout from the application
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
		
		
	}

}
