package Login;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_login {
	
public static void main(String[] args) {
		
	}
		// TODO Auto-generated method stub
		
		@Test
		public void AssetFunction() throws InterruptedException {
			
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tmp11100\\Downloads\\Selenium\\chromedriver_win32_new\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			//Resize current window
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
			driver.navigate().to("https://gmail.com/app");
			
			//Input Username
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("armpension1@gmail.com");
			WebElement textbox_1 = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));textbox_1.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			//Input Password
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Test@007");
			WebElement passwd = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));passwd.sendKeys(Keys.ENTER);
			
			WebDriverWait wait = new WebDriverWait(driver,30);
			
	
			//Compose mail button
			driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
			
			//Email (recipient)
			
			driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("armpension1@gmail.com");
			
			//Email (Subject)
			driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("hi");
			
			//Email (Body)
			driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Automation Test");
			
			//Click Enter
			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
			
			String ActualResult = driver.getTitle();
			String ExpectedResult = "Message sent";
			
			
			//driver.close();
			
		
		}
			
			
		}	