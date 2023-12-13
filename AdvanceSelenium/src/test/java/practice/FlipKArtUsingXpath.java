package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKArtUsingXpath {


	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//*[.='✕']")).click();
		Thread.sleep(3000);
		
		//syntax1:-  //htmltag[@AttributeName='AttributeValue']
	driver.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[1]")).click();
		
		//syntax2:-  //htmltag[text()='AttributeValue']
	//driver.findElement(By.xpath("//span[text()='✕']")).click();
//		driver.findElement(By.xpath("//*[.='✕']")).click();
//	
//		Thread.sleep(1000);
driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
Thread.sleep(3000);
	
	driver.quit();
	}
	
	
}
