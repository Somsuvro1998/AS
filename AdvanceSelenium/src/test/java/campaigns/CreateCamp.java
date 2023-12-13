package campaigns;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CreateCamp {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		
		//Random Approach To avoid Duplicates
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		String campName = "Marketing"+ranNum;
		driver.findElement(By.name("campaignname")).sendKeys(campName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		String campaignName = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
		
		if(campaignName.contains(campName))
		{
			System.out.println("Campaign Created");
		}
		else
		{
			System.out.println("Campaign not created");
		}
	   driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
	}
	
	
	
	
}
