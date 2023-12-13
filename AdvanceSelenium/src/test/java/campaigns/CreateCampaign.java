package campaigns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaign {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement more=driver.findElement(By.xpath("//a[.='More']"));
	
		Actions action=new Actions(driver);
		
		action.moveToElement(more);
		
		WebElement campaigns=driver.findElement(By.xpath("//a[@name='Campaigns']"));
		
		action.moveToElement(campaigns);
		
		action.click().build().perform();
		
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		
		String CampaignName="Diwali Offer";
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(CampaignName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
		
		Thread.sleep(3000);
		
		String CampName=driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
		
		if(CampName.contains(CampaignName))
		{
			System.out.println("New Campaign created");
		}
		else
		{
			System.out.println("Campaign not created");
		}
 //logout from the application
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
		
	}

}
