package campaigns;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CampaignWithProduct {
public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
	
		//Random Approach To avoid Duplicates
	Random ran = new Random();
	int ranNum = ran.nextInt(1000);
		
	String NAme = "Phone"+ranNum;
		driver.findElement(By.name("productname")).sendKeys(NAme);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
String prdName = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
	
if(prdName.contains(NAme))
{
	System.out.println("Product Created");
}
else
{
	System.out.println("Product not created");
}

driver.findElement(By.linkText("More")).click();
driver.findElement(By.linkText("Campaigns")).click();
driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
driver.findElement(By.xpath("//img[@alt='Select']")).click();

Set<String> allWin = driver.getWindowHandles();
Iterator<String> win = allWin.iterator();

while(win.hasNext())
{
	String winText = win.next();
driver.switchTo().window(winText);
String title = driver.getTitle();
if(title.contains("Products&action"))
{
	break;
}

}
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(NAme);
driver.findElement(By.xpath("//input[@name='search']")).click();

//Dynamic Xpath
//driver.findElement(By.xpath("//a[text()='"+NAme+"']")).click();
driver.findElement(By.xpath("//a[text()='"+NAme+"']")).click();
Thread.sleep(3000);

Set<String> allWin1 = driver.getWindowHandles();
Iterator<String> win1 = allWin1.iterator();

while(win1.hasNext())
{
String winText1 = win1.next();
driver.switchTo().window(winText1);
String title1 = driver.getTitle();

if(title1.contains("Campaigns&action"))
{
	break;
}
}
String campName = "Marketing"+ranNum;
driver.findElement(By.name("campaignname")).sendKeys(campName);
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
driver.findElement(By.linkText("Sign Out")).click();


}
}


	
	

