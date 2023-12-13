package contact;

import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactWithOrganization {
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
	Random ran=new Random();
	int ranNum=ran.nextInt(1000);	
	String Name="Qspider"+ranNum;
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys(Name);
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
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	driver.findElement(By.xpath("//img[@alt='Select']")).click();
	
	Set<String> allWin = driver.getWindowHandles();
	Iterator<String> win = allWin.iterator();

	while(win.hasNext())
	{
		String winText = win.next();
	driver.switchTo().window(winText);
	String title = driver.getTitle();
	if(title.contains("Accounts&action"))
	{
		break;
	}

	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(Name);
	driver.findElement(By.xpath("//input[@name='search']")).click();
	driver.findElement(By.xpath("//a[text()='"+Name+"']")).click();
	Thread.sleep(3000);
	
	Set<String> allWin1 = driver.getWindowHandles();
	Iterator<String> win1 = allWin1.iterator();
	
	while(win1.hasNext())
	{
	String winText1 = win1.next();
	driver.switchTo().window(winText1);
	String title1 = driver.getTitle();

	if(title1.contains("Contacts&action"))
	{
		break;
	}
	}
	String contact="Contact"+ranNum;
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(contact);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.linkText("Sign Out")).click();
	
	System.out.println("Operation successful");
	
	
	
	}
}
