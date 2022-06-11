package Login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_login {
	//String driverPath = "C://chromedriver.exe";
	WebDriver driver;
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
}
	@Test
	public void SoftAssertion() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tmp11100\\Downloads\\Selenium\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://gmail.com/app";
		//Resize current window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseurl);
	}
				
			
			
	//Input Username
	@Test(priority = 1)
	public void Input_username() {
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("armpension1@gmail.com");
	WebElement textbox = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));textbox.sendKeys(Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
				}
					
					
	@Test(priority = 2)
	public void Input_password() {
	//Input Password
	driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Test@007");
	WebElement passwd = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));passwd.sendKeys(Keys.ENTER);
	new WebDriverWait(driver, Duration.ofSeconds(60));
	WebDriverWait wait = new WebDriverWait(driver,30);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("class=\"T-I T-I-KE L3\"")));
				}
					

			
	@Test(priority = 3)
	public void click_compose_email() {
	//Compose mail button
	driver.findElement(By.xpath("//div[text()='Compose']")).click();
					
				}
				
	@Test(priority = 4)
	public void email_receipaint1() {
	//Email (recipient)
	driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("armpension1@gmail.com");
					
				}
	@Test(priority = 5)
	public void email_subject() {
	//Email (Subject)
	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("hi");	
				}
				
	@Test(priority = 6)
	public void email_receipaint() {
	//Email (Body)
	driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Automation Test");
					
			}
	@Test(priority = 6)
	public void Click_enter() {
	//Click Enter
	//driver.findElement(By.xpath("//div[@class()='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
	driver.findElement(By.xpath("//div[text()='Send']")).click();
				}
					
					
					
	@Test(priority = 7)
	public void Click_nter() {
	String expected="message sent";
	String actual = driver.getTitle();
				
	Assert.assertEquals(expected, actual);
				}
					
	@Test(priority = 8)
	public void close_browser() {
				
	driver.close();
				
		
		
		
	}

		
			
}
			
			