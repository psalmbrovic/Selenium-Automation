package Login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_login {
	String actualmessage;
	String expectedmessage = "message sent";
public static void main(String[] args) {
	// TODO Auto-generated method stub
	}
		@Test
		public void SoftAssertion() throws InterruptedException {
			
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tmp11100\\Downloads\\Selenium\\chromedriver_win32_new\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			//Resize current window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.navigate().to("https://gmail.com/app");
	
		
				//Input Username
				driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("armpension1@gmail.com");
				WebElement textbox = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));textbox.sendKeys(Keys.ENTER);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				//Input Password
				driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Test@007");
				WebElement passwd = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));passwd.sendKeys(Keys.ENTER);
				new WebDriverWait(driver, Duration.ofSeconds(60));
				
				WebDriverWait wait = new WebDriverWait(driver,30);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("class=\"T-I T-I-KE L3\"")));

		
				//Compose mail button
				driver.findElement(By.xpath("//div[text()='Compose']")).click();
				
				//Email (recipient)
				driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("armpension1@gmail.com");
				
				//Email (Subject)
				driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("hi");
				
				//Email (Body)
				driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Automation Test");
				
				//Click Enter
				//driver.findElement(By.xpath("//div[@class()='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
				driver.findElement(By.xpath("//div[text()='Send']")).click();
				
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"link_vsm\"]")));
				
				//String expectedtitle="message sent";
				//String actualtitle =driver.getTitle();
				//{
					//Assert.assertEquals(actualtitle, expectedtitle);
				
				//}
				
				driver.close();
			}
			
			
		
		}
			
			