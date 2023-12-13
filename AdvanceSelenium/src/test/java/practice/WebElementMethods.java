package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {

WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();

driver.manage().window().maximize();

//webElement Method1:-getCssValue()
/*driver.get("https://www.facebook.com");
WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
String size = logo.getCssValue("font-size");
	System.out.println(size);
	
	String elecolor = logo.getCssValue("color");
	System.out.println(elecolor);*/
	
	//webElement Method2:-sendKeys()
  /*driver.get("https://www.google.co.in/");
	Thread.sleep(3000);
  
	WebElement USERTEXT = driver.findElement(By.name("q"));
	USERTEXT.sendKeys("music");
	Thread.sleep(2000);
	
	//webElement Method3:-clear()
	USERTEXT.clear();*/
	
	//webElement Method4:-submit()
	/*driver.get("https://www.amazon.in");
	WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	searchBar.sendKeys("bluetooth");
	//searchBar.click();
	searchBar.submit();*/

   //driver.get("https://www.facebook.com");
    //webElement Method5:-getLocation()
    //WebElement loc = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
    //Point location = loc.getLocation();
	//System.out.println(location.getX());
	//System.out.println(location.getY());
	
	//webElement Method6:-getSize()
//	WebElement loc1 = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
//	Dimension size = loc1.getSize();
//	//System.out.println(size);
//	System.out.println(size.getHeight());
//	System.out.println(size.getWidth());
	
	//webElement Method7:-getRect()
	/*WebElement loc2 = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	Rectangle data = loc2.getRect();
	System.out.println(data.getX());
	System.out.println(data.getY());
	System.out.println(data.getHeight());
	System.out.println(data.getWidth());*/
	
   /* driver.get("https://www.amazon.in");
	//webElement Method8:-isDisplayed()
     WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
     if(logo.isDisplayed())
     {
    	 System.out.println("Logo Displayed");
     }
     else
     {
    	 System.out.println("Logo not displayed");
     }
   //webElement Method9:-isEnabled()
     
	WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	if(searchBar.isEnabled())
	{
		searchBar.sendKeys("puma");
		searchBar.submit();
	}
	else
	{
		System.out.println("Not Enabled");
	}*/

//webElement Method10:-isSelected(
   /* driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[.='Create new account']")).click();
	Thread.sleep(2000);
	WebElement radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	radioButton.click();
	if(radioButton.isSelected())
	{
		System.out.println("radioButton is Selected");
	}
	else
	{
		System.out.println("radioButton not Selected");
	}*/

    //webElement Method11:-getAttribute()
    /*driver.get("https://www.amazon.in");
    WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	System.out.println(searchBar.getAttribute("class"));

	//src is not present in HTML DOC  ---->Null
	System.out.println(searchBar.getAttribute("src"));
	
   WebElement data = driver.findElement(By.xpath("//a[.=\"Today's Deals\"]"));
   System.out.println(data.getAttribute("tabindex"));*/

   //webElement Method12:-getTagName()
    //driver.get("https://www.amazon.in");
	/*WebElement submitBar = driver.findElement(By.id("nav-search-submit-button"));
	System.out.println(submitBar.getTagName());*/
	
  //webElement Method13:-getAriaRole()
	/*WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	System.out.println(searchBar.getAriaRole());
	
	WebElement data = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
	System.out.println(data.getAriaRole());*/
	
    //DOM:-Document object model
    //webElement Method14:-getDomAttribute()
	/*WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	System.out.println(searchBar.getDomAttribute("aria-label"));
	
	//webElement Method15:-getDomProperty()
	WebElement txt = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
	System.out.println(txt.getDomProperty("textContent"));
	System.out.println(txt.getDomProperty("tagName"));*/
	
    //webElement Method16:-getAccessibleName()
	//driver.get("https://www.facebook.com");
	/*WebElement fbLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	System.out.println(fbLogo.getAccessibleName());*/
	
    //webElement Method17:-getText()
	/*driver.get("https://www.amazon.in");
	WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	searchBar.sendKeys("iphone");
	searchBar.submit();
	String price = driver.findElement(By.xpath("(//span[text()='52,999'])[1]")).getText();
	System.out.println(price);*/
}

}
