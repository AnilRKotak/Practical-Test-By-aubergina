package test123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class AutomationScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String BrowserName="Chrome";
		WebDriver driver;
			
			// Initialize browser
		ChromeOptions options = new ChromeOptions();
		
		//Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		//Pass ChromeOptions instance to ChromeDriver Constructor
			driver =new ChromeDriver(options);
		
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
		     // Go to URL
		 driver.get("http://www.myntra.com/");
		  
		
		     // Maximize Window
		     driver.manage().window().maximize();
		  
		     // Mouse Over On " Men link " 
		 Actions a1 = new Actions(driver);
		 a1.moveToElement(driver.findElement
		 (By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"))).build().perform();
		 Thread.sleep(3000);
		 
		 // Wait For Page To Load
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		     //Click Jackets Link
		 driver.findElement
		 (By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[7]/a")).click();
		  
		     // Wait For Page To Load
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 //Click On CateGory
		 driver.findElement
		 (By.xpath("//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[2]/ul/li[2]/label")).click();
		  
		     // Wait For Page To Load
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 Thread.sleep(5000);
		 
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 
		 //Click on Color
		 driver.findElement
		 (By.xpath("//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[5]/ul/li[4]/label/div")).click();
		  
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 Thread.sleep(5000);
	
		 //Get Image Title 
		 var img = driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img"));
		 String actualTitle = img.getAttribute("title");
		 
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 Thread.sleep(5000);
		
		 //Click on Image
		 driver.findElement
		 (By.xpath("//li[1]//a[1]//div[1]//div[1]//div[1]//div[1]//picture[1]//img[1]")).click();
		 
		 
		 
		String MainWindow= driver.getWindowHandle();
		   
		
		for (String handle1 : driver.getWindowHandles()) 
		{
		   driver.switchTo().window(handle1);
			
		}
		//Verify Title
		//String actualTitle = driver.getTitle();
	//	String expectedTitle = "Buy Columbia Red Summit Sleeker Shell Rain Jacket - Rain Jacket for Men 5126234 | Myntra";
		if(driver.getTitle().contains(actualTitle))
		{
			System.out.println("Title is Pass");
			
		}
		else
		{
			System.out.println("Title is Failed");
		}
		
		
		//Get Price
		 var price = driver.findElement
		 (By.xpath("*//*[@class=\"pdp-price\"]")).getText();
		
		 System.out.println("Price"+price);
		//Click on medium size
		 driver.findElement
			     (By.xpath("//*[@id=\"sizeButtonsContainer\"]/div[2]/div[2]/div[1]/button/p")).click();
		
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		     Thread.sleep(5000);
		
		 
		 //Click on Addtocart 
		 driver.findElement
		 (By.xpath("//*[@id=\"mountRoot\"]/div/div/main/div[2]/div[2]/div[3]/div/div[1]")).click();
			
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		     Thread.sleep(5000);
		
		 
		//Click on Go To Bug
		 driver.findElement
		 (By.xpath("//*[@id=\"mountRoot\"]/div/div/main/div[2]/div[2]/div[3]/div/a/span[2]")).click();
		 
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		     Thread.sleep(5000);
		 
		 //Get Total Price
		 var Totalelement = driver.findElement
			     (By.xpath("//*[@class='itemBlock-base-totalCartValue']"));
		
		 String Total= Totalelement.getText();
		 System.out.println(Total);
		 System.out.println("Successfully Executed Script");
		 driver.close();
		 driver.quit();
				   
				
			 
	}

}
