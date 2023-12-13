package organization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[.='Leads']")).click();
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		String firstname="Shyam";
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		String lastname="Singh";
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		String company="TCS";
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys(company);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
		
		Thread.sleep(3000);
		
		String LName=driver.findElement(By.xpath("//span[@id='dtlview_Last Name']")).getText();
		String CName=driver.findElement(By.xpath("//span[@id='dtlview_Company']")).getText();

		if(LName.contains(lastname)&&CName.contains(company))
		{
			System.out.println("Lead created successfully");
		}
		else
		{
			System.out.println("Lead creation failed");
		}
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			driver.findElement(By.xpath("//a[.='Sign Out']")).click();
			
	}

}
