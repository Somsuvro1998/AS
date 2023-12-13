package Product;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAndDeleteProduct {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[.='Products']")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		Random ran=new Random();
		int ranNum=ran.nextInt(1000);
		String Prodname="Computer"+ranNum;
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(Prodname);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
		
		Thread.sleep(3000);
		
	    String Product=driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
	    
	    if(Product.contains(Prodname))
	    {
	    	System.out.println("Product created");
	    	
	    }
	    else
	    {
	    	System.out.println("Product not created");
	    }
	    
	    driver.findElement(By.xpath("(//a[text()='Products'])[1]")).click();

	    driver.findElement(By.xpath("//a[text()='"+Prodname+"']/../preceding-sibling::td/input")).click();

	    driver.findElement(By.xpath("//input[@value='Delete']")).click();
	    Alert alt = driver.switchTo().alert();
	    alt.accept();

	    //validation
	    List<WebElement> prdList = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]"));

	    boolean flag=false;

	    for (WebElement prd : prdList)
	    {
	    	String actData = prd.getText();//phone456
	    	if(actData.contains(Prodname))//phone360
	    	{
	    		flag=true;
	    		break;
	    	}
	    }
	    if(flag)
	    {
	    	System.out.println("product deleted");
	    }
	    else
	    {
	    	System.out.println("Product not deleted");
	    }
//	    Alert alert=driver.switchTo().alert();
//	    alert.dismiss();
//	    driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//	    driver.findElement(By.linkText("Sign Out")).click();
	    
	    
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
		
	}	
}
