package organization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationWithIndustry {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[text()='Organizations'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		String Name="Gspider";
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys(Name);
		
		WebElement dD=driver.findElement(By.xpath("//select[@name='industry']"));
		Select i=new Select(dD);
		Thread.sleep(3000);
		i.selectByValue("Education");
		WebElement sD=driver.findElement(By.xpath("//select[@name='accounttype']"));
		Select t=new Select(sD);
		Thread.sleep(3000);
		t.selectByValue("Competitor");
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
		Thread.sleep(3000);
		
String OrgName=driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
		
		if(OrgName.contains(Name))
		{
			System.out.println("Organization created");
			
		}
		else
		{
			System.out.println("Organization not created");
		}
		
		//logout from application
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
		
		
	}

}
