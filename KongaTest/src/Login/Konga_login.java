package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Konga_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMUEL PC\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//This can be used to navigate  or open the web browser(both methods)
		//String URL= ("https://www.konga.com");
		driver.navigate().to("https://www.konga.com");
		
		//This maximize the browser and perform an implicit wait
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		
		//Click Login/Sign up
		driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[1]/div/div/div[4]/a")).click();
		
		//Enter Email or phone number
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jerryjayce@gmail.com");
		
		//Enter Password
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
		
		//Click Login
				driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
		
		//Search Item
				
			driver.findElement(By.xpath("//*[@id=\"jsSearchInput\"]")).sendKeys("Samsung Phone");
			driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[1]/div/div/div[2]/div/form/button/svg")).click();
			
			
			//Add To Cart
			
		

	}

}
