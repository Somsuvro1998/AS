package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonUsingXpath {
public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in");
		
		//syntax1:-xpath by Attribute
				//htmltag[@AttributeNAme="AttributeValue"]
		//driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_gb\"]")).click();

		//syntax2:-xpath by text()
				//htmltag[text()="visibleText"]
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
	}
}
