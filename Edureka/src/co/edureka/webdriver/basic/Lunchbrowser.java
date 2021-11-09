package co.edureka.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lunchbrowser {
//this will import org.openqa.selenium.WebDriver
	public static WebDriver driver = null;
			
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\SAMUEL PC\\eclipse-workspace\\Edureka\\Driver\\chromedriver.exe");
		//this will  lunch Chrome browser and import org.openqa.selenium.chrome.ChromeDriver
		driver = new ChromeDriver();
		//this wait for some specified time to identify some web element
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Open the web app
		driver.navigate().to("https://amazon.in");
		driver.manage().window().maximize();
		//this get the title of the page
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Amazon.in"))
		System.out.println("Title Matches");
		else
			System.out.println(title);
		
		//Locate a web element
		String tagname = "";
		tagname = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).getText();
		System.out.println(tagname);
		//click on Bestseller
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
		
		//For dropdown
		WebElement prime = driver.findElement(By.cssSelector("#nav-link-prime > span:nth-child(1)"));
		Actions action = new Actions(driver);
		//this move or hover toward an element
		action.moveToElement(prime).perform();
		//create time lag
		Thread.sleep(2000);
		
		//typing into the search box
		WebElement myElement= driver.findElement(By.id("twotabsearchtextbox"));
		myElement.sendKeys("Mac Air Pro Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollby (0,300)");
		//Thread.sleep(2000);
		
		
		
		

	}

}
