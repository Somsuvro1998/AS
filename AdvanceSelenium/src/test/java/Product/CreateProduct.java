package Product;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProduct {

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
		String Prodname="Computer";
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
	    
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
		
	
	
	}

}
